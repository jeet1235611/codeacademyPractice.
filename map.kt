fun main() {
//    val myClothes = mapOf("shirts" to 7, "Pairs of Pants" to 4, "Jackets" to 2)
//    for((itemName, itemCount) in myClothes) {
//        println("I have $itemCount $itemName")
//    }
    val myClothes = mapOf("Shirts" to 7, "Paris of Pants" to 4, "Jackets" to 2)

    println("KEYS")
    for(itemName in myClothes.keys) {
        println("\nVALUES")
    }

    println("\nVALUES")
    for(itemCount in myClothes.values) {
        println(itemCount)
    }
}
