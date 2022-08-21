package ru.alexpvl.app.repository

import ru.alexpvl.app.model.Bank

interface BankRepository {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
}