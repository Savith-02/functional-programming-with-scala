object expressions extends App {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5 
    val k: Float = 4.3f
    val g: Float = 6.3f

    println((b - 1) * a + c * (d - 1))
    println(a + 1)
    println(-2 * (g - k) + c) 
    // println( c = (c + 1))  Assignment in Scala does not return a value
    println(c + 1)
    println((c + 1) * (a + 1))

}