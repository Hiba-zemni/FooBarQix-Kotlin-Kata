package fr.sg.kata

class FooBarQix {

    fun transformNumber(numbers : List<Int>)=numbers.map {
        transformNumber(it)
    }


    fun transformNumber(number : Int) : String{
        val sb = StringBuilder()
        evaluateDivisibleRules(sb, number)
        return if(sb.isEmpty()) number.toString() else sb.toString()
    }

    private fun evaluateDivisibleRules (sb: StringBuilder, number : Int){
        when {
            number % 3 == 0 -> sb.append("Foo")
            number % 5 == 0 -> sb.append("Bar")
        }

    }
}
