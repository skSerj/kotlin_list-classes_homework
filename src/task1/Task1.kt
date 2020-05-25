package task1

val smartphonesList = listOf<DataSmartphonesTask1>(
    DataSmartphonesTask1("Samsung", "s10", 16999),
    DataSmartphonesTask1("Iphone", "XS", 24000),
    DataSmartphonesTask1("Xiaomi", "Redmi10", 15000),
    DataSmartphonesTask1("Xiaomi", "Redmi8", 7000),
    DataSmartphonesTask1("Huawei", "P40Lite", 8000)
)
val finderManufacturer = "Iphone"
val minPrice = 16000
val maxPrice = 25000

var smartPrice = smartphonesList[0].price
var indexOfSmartphone = 0

fun main(args: Array<String>) {
    val smartByManufacturer = (smartphonesList)
        .filter { it.manufacturer.contains(finderManufacturer) }
    println("Finder smartphone by manufacturing ($finderManufacturer): $smartByManufacturer")

    smartphonesList.forEach { smartphone ->
        if (smartphone.price in minPrice..maxPrice) {
            println("Smart by price range is ${smartphone.manufacturer} ${smartphone.model} price: ${smartphone.price}")
        }
    }

    smartphonesList.forEachIndexed { index, smartphone ->
        if (smartphone.price < smartPrice) {
            smartPrice = smartphone.price
            indexOfSmartphone = index
        }
    }
    println("the cheapest smart is ${smartphonesList[indexOfSmartphone].manufacturer} ${smartphonesList[indexOfSmartphone].model} price: ${smartphonesList[indexOfSmartphone].price}")

    smartphonesList.forEachIndexed { index, smartphone ->
        if (smartphone.price > smartPrice) {
            smartPrice = smartphone.price
            indexOfSmartphone = index
        }
    }
    println("the most costly smart is ${smartphonesList[indexOfSmartphone].manufacturer} ${smartphonesList[indexOfSmartphone].model} price: ${smartphonesList[indexOfSmartphone].price}")

}





