package ru.alexpvl.app.model

import jakarta.persistence.*
import lombok.*

@Getter
@Setter
@Entity
@Table(schema = "app_db", name = "banks")
open class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    var id: Int = 0

    @Column(name = "account_number", nullable = false)
    var accountNumber: String = ""

    @Column(name = "trust", nullable = false)
    var trust: Double = 0.0

    @Column(name = "transaction_fee", nullable = false)
    var transactionFee: Int = 0

    constructor()

    constructor(accountNumber: String, trust: Double, transactionFee: Int) {
        this.accountNumber = accountNumber
        this.trust = trust
        this.transactionFee = transactionFee
    }

}