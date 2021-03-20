package fr.sg.kata

class FooBarQix {

    fun transformNumber(number : Int):String?{
        if(number % 3 == 0)
            return "Foo"
        if(number == 5)
            return "Bar"
        return number.toString()
    }
}
