package ru.alexpvl.app.repository.mock

import org.springframework.stereotype.Repository
import ru.alexpvl.app.model.Bank
import ru.alexpvl.app.repository.BankRepository

@Repository
class MockBankRepository : BankRepository {

    val banks = mutableListOf(
        Bank("1234", 3.14, 1),
        Bank("5678", 10.1, 2),
        Bank("9000", 1.00, 3)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
    }

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber })
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists")
        banks.add(bank)
        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull { it.accountNumber == bank.accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number ${bank.accountNumber}")
        banks.remove(currentBank)
        banks.add(bank)
        return bank
    }

}