fun main()
{
  demo("def")
  demo1("sgesrb")
  demo2("jhkjdv")
}
fun demo1(x: Any) {
    if (x is String) {
        println(x.length)
    }
}
fun demo(x: Any) {
    if (x !is String) return
    println(x.length)
}
fun demo2(x: Any)
{
    if (x !is String || x.length == 0) return
    print(x.length)
    if (x is String && x.length > 0) {
        print(x.length)
    }
}