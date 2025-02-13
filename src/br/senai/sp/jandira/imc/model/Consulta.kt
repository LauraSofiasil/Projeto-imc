package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.LocalTime

class Consulta {

        var dataConsulta: LocalDate? = null
        var horaConsulta: LocalTime? = null
        var paciente: Paciente? = null
        var medico: Medico? = null
        var valorConsulta: Double = 0.0

        fun mostrarDadosDaConsulta(){
            println("---------------------------------")
            println("D A D O S  D A  C O N S U L T A")
            println("---------------------------------")
            println("PACIENTE: ${paciente!!.nome}") // !! -> double bang: Significa Kotlin confia que não vai estar nula
            println("IDADE: ${paciente!!.calcularIdade()} anos")
            println("IMC: ${String.format("%.2f", paciente!!.calcularImc())}")
            println("CLASSIFICAÇÃO DO IMC: ${paciente!!.classificarImc()}")
            println("MÉDICO: ${medico!!.nome}")
            println("CRM: ${medico!!.crm}")
            println("DATA DA CONSULTA: $dataConsulta")
            println("HORA DA CONSULTA: $horaConsulta")
            println("VALOR DA CONSULTA: $valorConsulta")
            println("---------------------------------")
        }
}