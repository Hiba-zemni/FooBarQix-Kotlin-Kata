package fr.sg.kata

class FooBarQix {

    fun transformNumber(numbers : List<Int>): List<String> {
        val result = ArrayList<String>()
        for (item in numbers) {
            transformNumber(item)?.let { result.add(it) }
        }
        return result
    }


    fun transformNumber(number : Int):String?{
       return evaluateDivisibleRules(number)
    }

    private fun evaluateDivisibleRules (number : Int):String?{
        if(number % 3 == 0)
            return "Foo"
        if(number % 5 == 0)
            return "Bar"
        return number.toString()
    }
}
