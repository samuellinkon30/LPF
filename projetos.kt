fun main ()
{
    println("Fatorial: "+ fatororial(5))
    println("Soma: "+ soma(6))
    println("Potencia: 2ˆ4 = "+ exp(2,4))
    println("Potencia: 2ˆ0 = "+ exp(2,0))
    println("Potencia: 2ˆ1 = "+ exp(2,1))
    println("Retorna Any =  ${imp("Samuel")}")
    println("Funcao Reduzida: ( fun menor () = valor ) = ${menor()}")

    //Listas Encadeadas
    val l1 = No(1,null)
    // No [ 1,No [ 2, No [3,null] ] ]
    val l2 = incrementa(l1)
    println("l1 = ${l1}")
    println("l2 = ${l2}")
    println("Tamanho: ${tamanho(l1)}")
    l1.proximo()?.valor()
}
//Listas Encadeadas
data class No(val info:Int, val prox:No?)
{
    fun valor():Unit
    {
        println("Valor: ${this.info}")
    }
    fun proximo(): No?
    {
        return prox
    }
}
//Tamanho de uma lista encadeada
fun tamanho(no:No?):Int
{
    if (no==null)
    {
        return 0
    } else
    {
        return 1+(tamanho(no.prox))
    }
}

//Concatenar Listas
fun concatenar(no1:No?, no2:No?):No?
{
    val aux=null;
    if(no1!=null && no2!==null)
    {
        if(no1.prox==null)
        {
            return No(no1.info, no2)dwwdwddsdadadasdasdasdasdasdasdasd

                    dlsoddlsdate dadaadadddddddd
        }
        else
        {
            return (concatenar(no1.prox,no2))
        }
    }
    else
        return no1;
}

//Incrementa o valor dos Nós
fun incrementa(p: No?):No? =
    if (p == null)
        null
    else {
        No(p.info + 1, incrementa(p.prox))
    }

//Funcoes não precisam ter return se os seu retorno for de um unico valor.
val valor=10
fun menor () = valor

//Funcoes do tipo Any com Objetos do Tipo Any Retornam "Qualquer coisa."
fun imp(x:Any): Any {return x}

// Funcao Fatorial
fun fatororial (num:Int):Int
{
    if (num==0) return 1
    else if (num==1) return 1
    else return (num*fatororial(num-1))
}
// Funcao Somatorio
fun soma (num:Int):Int
{
    if(num==0) { return 0 }
    else if (num==1)
    { return 1}
    else {
        return num+soma(num-1)
    }
}

// Funcao Potencial
fun exp(num1:Int, num2:Int):Int
{
    if(num2==0) {return 1}
    else if (num2==1) {return  num1}
    else
    {
        return num1 *(exp(num1,num2-1))
    }
}

