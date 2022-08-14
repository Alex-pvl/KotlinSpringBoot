package ru.alexpvl.app.repository

import ru.alexpvl.app.model.Bank

interface BankRepository {
    fun retrieveBanks() : Collection<Bank>
}