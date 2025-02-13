package br.senai.sp.jandira.imc.model

class Medico {

        var nome: String = ""
        var especialidades: ArrayList<String> = ArrayList<String>()
        var crm: String = ""
        var telefone: String = ""

        fun mostrarFichaDoMedico() {
            println("---------------------------------")
            println("D A D O S  D O  M É D I C O")
            println("---------------------------------")
            println("NOME: $nome")
            println("CRM: $crm")
            println("TELEFONE: $telefone")
            println("ESPECIALIDADES")
            println("---------------------------------")
            for (especialidade in especialidades) {
                println("  -$especialidade")
            }
            println("---------------------------------")

        }
}