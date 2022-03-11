fun main() {
    //Regular Function.
    val f1: (Int, Int) -> Int
    val f2: (Int, Int) -> Boolean
    //minimal signature
    val f0: () -> Unit
    //Nullable.
    val f3: ((String) -> Int)?

    //assignment
    //declared function
    f1 =:: addInt
    //function literals
    //lambda
    f2 = {x: Int, y: Int -> x > y}

    //invoke
    f1.invoke(2,4)
    f2(6,5)
    f3 ("Mark")
    //f3.invoke("Hello")
   
}

fun addInt(x: Int, y: Int): Int {
    return x + y
}
