import entities.ConteudoEducacional
import entities.Formacao
import entities.Usuario
import enums.Nivel

fun main() {
    val usuario1 = Usuario("Michel")
    val usuario2 = Usuario("Luana")

    val conteudo1 = ConteudoEducacional("Abstração", 4)
    val conteudo2 = ConteudoEducacional("Encapsulamento", 5)
    val conteudo3 = ConteudoEducacional("Herança", 7)
    val conteudo4 = ConteudoEducacional("Polimorfismo", 12)
    val conteudo5 = ConteudoEducacional("Funções", 5)
    val conteudo6 = ConteudoEducacional("AbstraçColeções", 13)

    val listagemJava = mutableListOf(conteudo1, conteudo2, conteudo3, conteudo4)
    val listagemKotlin = mutableListOf(conteudo1, conteudo2, conteudo3, conteudo4, conteudo5, conteudo6)

    val formacao1 = Formacao("Java Fundamentos II", listagemJava, Nivel.INTERMEDIARIO)
    val formacao2 = Formacao("Kotlin Fundamentos III", listagemKotlin, Nivel.AVANCADO)

    imprimirFormacao(formacao1)
    imprimirFormacao(formacao2)

    formacao1.matricular(usuario1)
    formacao2.matricular(usuario1)
    formacao2.matricular(usuario2)

    imprimirInscritosFormacao(formacao1)
    imprimirInscritosFormacao(formacao2)
}

private fun imprimirFormacao(formacao: Formacao) {
    println("${formacao.nome} - Carga Horária - Nível: ${formacao.nivel}")
    for (elemento in formacao.conteudos) {
        println("\t${elemento.nome} \t${elemento.duracao} hrs")
    }
    println()
}

private fun imprimirInscritosFormacao(formacao: Formacao) {
    println("Formação: ${formacao.nome}\n\tUsuário(s) matriculado(s):")
    print("\t\t")
    for (inscrito in formacao.inscritos) {
        print("${inscrito.nome}, ")
    }
    println()
}