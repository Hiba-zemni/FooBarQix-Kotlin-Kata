package fr.sg.kata

class FooBarQix {

    fun transformNumber(number : Int):String?{
        if(number % 3 == 0)
            return "Foo"
        return number.toString()
    }
}
