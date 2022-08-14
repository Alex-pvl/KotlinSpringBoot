package ru.alexpvl.app.service

import io.mockk.*
import org.junit.jupiter.api.Test
import ru.alexpvl.app.repository.BankRepository

internal class BankServiceTest {

    private val repository: BankRepository = mockk(relaxed = true)
    private val bankService = BankService(repository)

    @Test
    fun `should call its data source to retrieve banks`() {
        bankService.getBanks()

        verify(exactly = 1) { repository.retrieveBanks() }
    }
}