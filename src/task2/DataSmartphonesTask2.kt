package task2

data class DataSmartphonesTask2(
    val manufacturer: String,
    val model: String,
    val price: Int,
    val discount: Double?

) {
    override fun toString(): String {
        return "$manufacturer, $model, price: $price"
    }
}

data class DataStore(
    val name: String,
    val address: String?,
    val site: String,
    val smartphones: List<DataSmartphonesTask2>

) {
    override fun toString(): String {
        return " $name,  $address, '$site'"
    }
}
