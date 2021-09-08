fun main() {
    val number1 = RoundingNumber()
    number1.number = 0.3
    println("Hasil Pembulatan Bilangan Pertama = ${number1.number.toInt()}")

    val number2 = RoundingNumber()
    number2.number = 3.3
    println("Hasil Pembulatan Bilangan Kedua = ${number2.number.toInt()}")
}

class RoundingNumber {
    var number: Double = 0.0
        get() = field
        set(value) {
            field = ((if (value < 0.5)
                Math.round(value)
            else
                Math.round(value)).toDouble())
        }
}