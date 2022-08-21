package ru.alexpvl.app.repository.network

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import ru.alexpvl.app.model.Bank
import ru.alexpvl.app.repository.BankRepository
import ru.alexpvl.app.repository.network.dto.BankListDto
import java.io.IOException

@Repository("network")
class NetworkRepository(
    @Autowired private val restTemplate: RestTemplate
) : BankRepository {

    override fun retrieveBanks(): Collection<Bank> {
        val response: ResponseEntity<BankListDto> =
            restTemplate.getForEntity("http://54.193.31.159/banks")
        return response.body?.results
            ?: throw IOException("Could not fetch banks from the network")
    }

    override fun retrieveBank(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }

    override fun createBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun updateBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun deleteBank(accountNumber: String) {
        TODO("Not yet implemented")
    }
}