package KotlinClock

fun main(args: Array<String>)
{
    val clk: Clock = Clock()

    for (i in 1..(60*30))
    {
        clk.Tick()
        println("The time is ${clk.CurrentTime}")
    }
}