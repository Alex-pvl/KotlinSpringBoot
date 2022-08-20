package ru.alexpvl.app.repository.mock

import org.springframework.stereotype.Repository
import ru.alexpvl.app.model.Bank
import ru.alexpvl.app.repository.BankRepository

@Repository
class MockBankRepository : BankRepository {

    val banks = listOf(
        Bank("1234", 3.14, 1),
        Bank("5678", 10.1, 2),
        Bank("9000", 1.00, 3)
    )

    override fun retrieveBanks() : Collection<Bank> = banks
}