package ru.alexpvl.app.service

import org.springframework.stereotype.Service
import ru.alexpvl.app.model.Bank
import ru.alexpvl.app.repository.BankRepository

@Service
class BankService(
    private val repository: BankRepository
) {
    fun getBanks(): Collection<Bank> = repository.retrieveBanks()

    fun getBankByAccountNumber(accountNumber: String): Bank = repository.retrieveBank(accountNumber)

    fun addBank(bank: Bank): Bank = repository.createBank(bank)

    fun updateBank(bank: Bank): Bank = repository.updateBank(bank)

}