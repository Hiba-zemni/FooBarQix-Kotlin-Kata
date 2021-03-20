package fr.sg.kata

class FooBarQix {



    fun transformNumber(number1 : Int, number2 : Int):String?{
       return evaluateDivisibleRules(number1)
    }

    private fun evaluateDivisibleRules (number : Int):String?{
        if(number % 3 == 0)
            return "Foo"
        if(number % 5 == 0)
            return "Bar"
        return number.toString()
    }
}
