fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14]) // 4
printk("adv","ärbg","aerg","khjn")
}
fun printk( vararg msg: String)
{
    for(i in msg)
        println(i)
}