package task2

import task1.smartphonesList

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
    DataStore("Mobilochka", "Валентиновская, 1", "mobilochka.ua", smartphonesListMobilochka)
)
val finderStore = "Comfy"

fun main(args: Array<String>) {
    storeList.forEach { store ->
        if (store.name.contains(finderStore)) {
            var smartPrice = smartphonesList[0].price
            var indexOfSmartphone = 0
            store.smartphones.forEachIndexed { index, smartphone ->
                if (smartphone.price < smartPrice) {
                    smartPrice = smartphone.price
                    indexOfSmartphone = index
                }
            }
            println("the cheapest smart is ${store.smartphones[indexOfSmartphone].manufacturer} ${store.smartphones[indexOfSmartphone].model} price: ${store.smartphones[indexOfSmartphone].price}")
        }
    }
}






