val smartphonesList = listOf<DataSmartphones>(
    DataSmartphones("Samsung", "s10", 16999),
    DataSmartphones("Iphone", "XS", 24000),
    DataSmartphones("Xiaomi", "Redmi10", 15000),
    DataSmartphones("Xiaomi", "Redmi8", 7000),
    DataSmartphones("Huawei", "P40Lite", 8000)
)
val finderManufacturer = "Iphone"
val minPrice = 16000
val maxPrice = 25000

var smartPrice = smartphonesList[0].price
var indexOfSmartphone = 0

fun main(args: Array<String>) {
    smartphonesList.forEach { smartphone ->
        if (smartphone.manufacturer.contains(finderManufacturer)) {
            println("You find ${smartphone.manufacturer}")
        }
    }

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





