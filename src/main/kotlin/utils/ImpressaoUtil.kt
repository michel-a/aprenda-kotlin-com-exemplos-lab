package utils

import entities.Formacao

object ImpressaoUtil {
    fun imprimirFormacao(formacao: Formacao) {
        println("${formacao.nome} - Carga Horária - Nível: ${formacao.nivel}")
        for (elemento in formacao.conteudos) {
            println("\t${elemento.nome} \t${elemento.duracao} hrs")
        }
        println()
    }

    fun imprimirInscritosFormacao(formacao: Formacao) {
        println("Formação: ${formacao.nome}\n\tUsuário(s) matriculado(s):")
        print("\t\t")
        for (inscrito in formacao.inscritos) {
            print("${inscrito.nome}, ")
        }
        println()
    }
}