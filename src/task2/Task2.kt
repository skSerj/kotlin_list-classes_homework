package task2

val smartphonesListComfy = listOf<DataSmartphonesTask2>(
        DataSmartphonesTask2("Samsung", "s10", 16999, null),
        DataSmartphonesTask2("Iphone", "XS", 24000, 0.1),
        DataSmartphonesTask2("Xiaomi", "Redmi10", 15000, 0.15),
        DataSmartphonesTask2("Xiaomi", "Redmi8", 7000, null),
        DataSmartphonesTask2("Huawei", "P40Lite", 8000, 0.2)
)
val smartphonesListCitrus = listOf<DataSmartphonesTask2>(
        DataSmartphonesTask2("Samsung", "s10", 117500, 0.1),
        DataSmartphonesTask2("Iphone", "XS", 23000, null),
        DataSmartphonesTask2("Xiaomi", "Redmi10", 12000, 0.15)
)
val smartphonesListMobilochka = listOf<DataSmartphonesTask2>(
        DataSmartphonesTask2("Samsung", "s10", 117500, 0.1),
        DataSmartphonesTask2("Iphone", "XS", 23000, null),
        DataSmartphonesTask2("Xiaomi", "Redmi10", 12000, 0.15),
        DataSmartphonesTask2("Xiaomi", "Redmi8", 75000, 0.05),
        DataSmartphonesTask2("Huawei", "P40Lite", 8000, null)
)

val storeList = listOf<DataStore>(
        DataStore("Comfy", "Героев труда 10", "comfy.ua", smartphonesListComfy),
        DataStore("Citrus", "Гвардейцев-Широнинцев 28", "citrus.ua", smartphonesListCitrus),
        DataStore("Mobilochka", null, "mobilochka.ua", smartphonesListMobilochka)
)
val finderStore = "Comfy"
val finderManufacturer = "Huawei"
val minPrice = 16000
val maxPrice = 25000

fun main(args: Array<String>) {
    // find cheapest smartphone in store
    storeList.forEach { store ->
        if (store.name.contains(finderStore)) {
            var smartPrice = store.smartphones[0].price
            var indexOfSmartphone = 0
            store.smartphones.forEachIndexed { index, smartphone ->
                if (smartphone.price < smartPrice) {
                    smartPrice = smartphone.price
                    indexOfSmartphone = index
                }
            }
            println("the cheapest smart in $finderStore is ${store.smartphones[indexOfSmartphone]}. You can buy this smart by address '${store.address}' or in site: ${store.site}")
        }
    }
    // find smartphone in shop by manufacturer
    storeList.forEach { store ->
        if (store.name.contains(finderStore)) {
            store.smartphones.forEach { smartphone ->
                if (smartphone.manufacturer.contains(finderManufacturer)) {
                    println("For you request by manufacturer of smart ($finderManufacturer) in $finderStore you can buy smarts next model: ${smartphone.model}, price: ${smartphone.price}. You can buy this smart by address '${store.address}' or in site: ${store.site}")
                } else {
                    println("sorry we don't have $finderManufacturer in storeList")
                }
            }
        }
    }
    // find smartphone in shop by price range
    storeList.forEach { store ->
        if (store.name.contains(finderStore)) {
            store.smartphones.forEach { smartphone ->
                if (smartphone.price in minPrice..maxPrice) {
                    println("You smart in price range: $smartphone")
                }
            }
        }
    }

//    storeList.forEach { store ->
//        var smartDiscount = store.smartphones[0].discount
//        var indexOfSmartWithMaxDiscount = 0
//        store.smartphones.forEachIndexed { index, smartphone ->
//                if (smartphone.discount?.toDouble() ? = 0 > smartDiscount.) {
//                    smartDiscount = smartphone.discount
//                    indexOfSmartWithMaxDiscount = index
//                }
//
//        }
//        println("smart with biggest discount: ${store.smartphones[indexOfSmartWithMaxDiscount]} ")
//    }
}





