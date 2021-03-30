fun main()
{
    val arr = IntArray(5)
    for (i in arr.indices)
        print(arr[i])
    println()

    val arr1 = IntArray(5) { 42 }
    for (i in arr.indices)
        print(arr1[i])
    println()


    var arr2 = IntArray(5) { it * 1 }
    for (i in arr.indices)
        print(arr2[i])
    println()

}