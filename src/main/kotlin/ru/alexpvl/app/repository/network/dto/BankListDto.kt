package ru.alexpvl.app.repository.network.dto

import ru.alexpvl.app.model.Bank

data class BankListDto(
    val results: Collection<Bank>
)