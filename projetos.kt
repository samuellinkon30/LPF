fun main ()
{
    val no1= No(1,No(2,No(3,null)))
    val no2= No(4,No(5,No(6,null)))
    println("Tamanho: ${tamanho(no1)}")
    println("Valor: ${valor(no1)}")
    println("Proximo: ${proximo(no1)}")
    println("Concatenar: ${conc(no1,no2)}")
    println("No n1= ${no1}")
    println("N-esimo valor: ${enes(2,no1)}")
    println("verifca valor 2: ${verfica(2,no1)}")
    println("verifca valor 10: ${verfica(10,no1)}")

}

data class No (val valor:Int, val prox:No?)

fun tamanho(no:No?):Int
{
    if (no==null)
    {
        return 0
    }
    else
    {
        return (1 + tamanho(no.prox))
    }
}

fun valor(no:No?):Int? {
    if (no==null)
    {
        return null
    }
    else
    {
        return no.valor
    }
}

fun proximo(no:No?):No?
{
    if(no==null)
    {
        return null;
    }
    else
    {
        return no.prox;
    }
}

fun conc(no1:No?,no2:No?):No?
{
    if (no1==null)
    {
        return no2
    } else if ( no2==null)
    {
        return no1
    }
    else if (no1.prox==null)
    {
        return No(no1.valor,no2)
    }
    else
    {
        return No(no1.valor ,conc(no1.prox,no2))
    }
}

fun enes(x:Int,no:No?):Int?
{
    if(x==1)
    {
        return no?.valor
    }
    else
    {
        return enes(x-1,no?.prox)
    }
}

fun verfica(x:Int,no:No?):Boolean
{
    if (x==no?.valor)
    {
        return true
    }
    else
    {
        return false && (verfica(x,no?.prox))
    }
}