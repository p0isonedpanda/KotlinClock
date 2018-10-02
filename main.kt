package KotlinClock

fun main(args: Array<String>)
{
    val clk: Clock = Clock()

    for (i in 1..(60*60))
    {
        clk.Tick()
        println("The time is ${clk.CurrentTime}")
    }
}

class Counter
{
    private var value: Int
    private val name: String

    public val Value: Int
        get()
        {
            return value
        }
    public val Name: String
        get()
        {
            return name
        }

    constructor(_name: String)
    {
        name = _name
        value = 0
    }

    public fun Increment()
    {
        value++
    }

    public fun Reset()
    {
        value = 0
    }
}

class Clock
{
    private val sec: Counter
    private val min: Counter
    private val hour: Counter

    public val CurrentTime: String
        get()
        {
            return "${hour.Value}:${min.Value}:${sec.Value}"
        }
    
    constructor()
    {
        sec = Counter("sec")
        min = Counter("min")
        hour = Counter("hour")
    }

    public fun Tick()
    {
        sec.Increment()
        if (sec.Value == 60)
        {
            sec.Reset()
            min.Increment()

            if (min.Value == 60)
            {
                min.Reset()
                hour.Increment()
            }
        }
    }

    public fun Reset()
    {
        sec.Reset()
        min.Reset()
        hour.Reset()
    }
}