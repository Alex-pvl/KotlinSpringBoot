package ru.alexpvl.app.repository.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankRepositoryTest {

    private val mockBankRepository = MockBankRepository()

    @Test
    fun `should provide a collection of banks`() {
        val banks = mockBankRepository.retrieveBanks()

        assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data`() {
        val banks = mockBankRepository.retrieveBanks()

        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).allMatch { it.transactionFee != 0 }
    }
}