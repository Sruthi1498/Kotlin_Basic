fun main()
{
    //val str: String = "hello"
    val str:String? = null

    /*if(str is String)
        println(str.length)*/

    if(str !is String)
        println("not a string")
    else
        println("string")
}