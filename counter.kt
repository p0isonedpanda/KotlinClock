package KotlinClock

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