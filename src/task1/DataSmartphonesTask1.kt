package task1

data class DataSmartphonesTask1(
    val manufacturer: String,
    val model: String,
    val price: Int

) {
    override fun toString(): String {
        return "$manufacturer, $model, price: $price"
    }
}
