package br.senai.sp.jandira.imc.model

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.time.LocalTime

fun main() {

    var paciente1 = Paciente()  //A variável paciente1 está recebendo a classe que nós criamos
    paciente1.nome = "Laura Sofia"
    paciente1.dataNascimento = LocalDate.of(2008, 4, 25)
    paciente1.telefone = "(11) 94002-8922"
    paciente1.peso = 54
    paciente1.altura = 1.58
    paciente1.mostrarFichaDoPaciente()

    println()
    println()
    println()

    // CRIAR UM MÉDICO
    var medico1 = Medico()
    medico1.nome= "Paula Oliveira"
    medico1.crm = "67895-03"
    medico1.telefone = "(11) 97865-0943"
    medico1.especialidades.addAll(
        listOf(
            "Clínico Geral",
            "Cardiologista",
            "Nutricionista "
        )
    )
    medico1.mostrarFichaDoMedico()

    println()
    println()
    println()

    // CRIAR UMA CONSULTA
    var consulta1 = Consulta()
    consulta1.dataConsulta = LocalDate.of(2025, 4, 2)
    consulta1.horaConsulta = LocalTime.of(16, 30)
    consulta1.valorConsulta = 103.50
    consulta1.paciente = paciente1
    consulta1.medico = medico1
    consulta1.mostrarDadosDaConsulta()
}



//    println("O IMC é: ${paciente1.calcularImc()}")
//
//    println("Hello World!")  // println -> Mostra um dado e pula a linha
//    println("Laura Sofia")
//
//    var idade = 16
//
//    var preco = 6.9
//
//    var nome: String  // Uma variável precisa ter uma tipagem, não tem como deixá-la vazia
//
//    nome = "Laura"
//
//    println("O nome é $nome!")  //Printar um texto com uma variável junto
//
//    println("A soma de 8 e 5 é ${8+5}!")  //Printar um texto junto com uma conta
//
//    cumprimentar()  //Chamando uma função de fora
//
//    var hoje = LocalDate.now()  //LocalDate.now -> Mostrar a data daquele momento
//
//    println(hoje)
//
//    var dataNascimento = LocalDate.of(2008, 4, 25) //Mostrar a data de um momento específico
//
//    println(dataNascimento.dayOfWeek)  //Mostrar o dia da semana daquela data de nascimento
//
//    println(dataNascimento.dayOfYear)







//fun cumprimentar(){
//    println("Olá, tudo bem?" )
//}