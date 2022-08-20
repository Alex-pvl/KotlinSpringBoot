package ru.alexpvl.app.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.alexpvl.app.model.Bank
import ru.alexpvl.app.service.BankService

@RestController
@RequestMapping("/api")
class BankController(
    @Autowired
    private val bankService: BankService
) {
    @GetMapping("/banks")
    fun getAllBanks(): Collection<Bank> = bankService.getBanks()

}