fun main(){
    //Numbers
    var myInt: Int = 10
    var mySecondInt = 20 //Kotlin knows Data Types
    var myLong: Long = 40L
    var myLong2 = 40L
    var myShort: Short = 16
    var myByte: Byte = 5
    var myDouble: Double = 45.2554466
    var myFloat: Float = 3.14F
    var myChar: Char = 'k'

    var myBoolean: Boolean = true

    //Strings
    var myString: String = "This is a string"
    var myString2 = "This string has a newline \n"
    var multiLine = """
        This is line 1
        This is line 2
        This is line3...
    """.trimIndent()

    println("This is the way Kotlin concatenates $myInt")
}