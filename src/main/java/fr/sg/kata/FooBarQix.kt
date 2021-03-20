package fr.sg.kata

class FooBarQix {

    fun transformNumber(numbers : List<Int>)=numbers.map {
        transformNumber(it)
    }


    fun transformNumber(number : Int) : String{
        val sb = StringBuilder()
        evaluateDivisibleRules(sb, number)
        evaluateContainsRules(sb, number)
        return if(sb.isEmpty()) number.toString() else sb.toString()
    }

    private fun evaluateContainsRules(sb: StringBuilder, number: Int) {
        number.toString().toCharArray().forEach {
            when(it) {
                '3' -> sb.append("Foo")
                '5' -> sb.append("Bar")
                '7' -> sb.append("Qix")
            }
        }
    }

    private fun evaluateDivisibleRules (sb: StringBuilder, number : Int){
        if(number % 3 == 0)
            sb.append("Foo")
        if(number % 5 == 0)
            sb.append("Bar")

    }

}

fun main() {
    FooBarQix().transformNumber((1..100).toList()).forEach {
        println(it)
    }
}
