package br.ifpb.pdm.praticas

class Atividade(val titulo: String?, val descricao: String?, val data: Data?){
    override fun toString(): String {
        return "Atividade = ${titulo ?:"Campo não informado"} || Descrição = ${descricao ?:"Campo não informado"}"
    }
}
class Data(val dia: Int?, val mes: String?)

fun listar(repositorio: MutableList<Atividade>){
    for (atividade in repositorio){
        println(atividade)
    }
}

 fun listarTituloEMes(repositorio: MutableList<Atividade>) {
    repositorio.forEach { println("Atividade ${it.titulo ?:"nulo"} para o mes ${it.data?.mes ?:"nulo"}.") }
 }

fun qtdAtividades(repositorio: MutableList<Atividade>){
    val qtdAtividades = repositorio.size
    println("Número de atividade(s): $qtdAtividades")
}

fun listarAtividadeSemData(repositorio: MutableList<Atividade>) {
    repositorio.forEach {
        if(it.data == null || it.data.dia == null && it.data.mes == null) println(it)
    }
}

fun main(){
    val repositorioAtividades = mutableListOf<Atividade>()
    repositorioAtividades.add(Atividade("Fazer Compras","Café, açúcar, arroz", Data(14, "Março")))
    repositorioAtividades.add(Atividade("Prova de BD2",null, Data(23, null)))
    repositorioAtividades.add(Atividade("Organizar documentos para solicitar férias","Café, açúcar, arroz", null))

    repositorioAtividades.add(Atividade(null,"Organizar seminário", null))

    listar(repositorioAtividades)
    println()
    qtdAtividades(repositorioAtividades)
    println()
    listarTituloEMes(repositorioAtividades)
    println()
    repositorioAtividades.add(Atividade("Adicionado por Ian","Organizar seminário", Data(null, null)))
    listarAtividadeSemData(repositorioAtividades)

}
