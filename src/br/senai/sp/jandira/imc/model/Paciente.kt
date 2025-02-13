package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {
    var nome = ""
    var dataNascimento: LocalDate? = null  //A interrogação serve para quebrar o bloqueio de usar nulo do kt
    var telefone: String = ""
    var peso: Int = 0
    var altura: Double = 0.0

    fun calcularImc(): Double{
        return peso / altura.pow(2)  //pow(n:2) -> Eleva ao quadrado
    }

    fun classificarImc(): String {
        val imc = calcularImc()

        if (imc < 18.5) {
            return "Abaixo do peso!"
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal!"
        } else {
            return "Acima do peso!"
        }
    }

    fun calcularIdade(): Int {
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years
        //Usar Period para calcular o período de tempo OBS: usar do pacote java.time

        return idade
    }

    fun mostrarFichaDoPaciente(){
        println("---------------------------------")
        println("D A D O S  D O  P A C I E N T E")
        println("---------------------------------")
        println("NOME: $nome") // OBS: não precisa colocar chave quando é apenas uma variável
        println("IDADE: ${calcularIdade()}")
        println("IMC: ${String.format("%.2f", calcularImc())}")
        // format -> faz com que mude a forma de printar o número, nesse caso mostra apenas 2 números depois do decimal
        // Ele funciona da seguinte forma:
        // % -> qualquer número
        // . -> representa depois do ponto
        // 2f -> 2 numeros float
        // Ou seja antes do ponto pode ser colocado qualquer número e depois do ponto apenas 2 dígitos
        println("CLASSIFICAÇÃO IMC: ${classificarImc()}")
        println("---------------------------------")
    }

}