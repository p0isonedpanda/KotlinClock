package KotlinClock

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