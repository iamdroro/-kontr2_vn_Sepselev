abstract class Abstract:Input {
    abstract var name:String
    abstract var poroda:String
    abstract var vozr:Int
    abstract var rost:Double
    abstract var color:String
    abstract var ves:Double
    abstract var har:String

    override fun input() {
        println("Введите кличку собаки: ")
        var name= readLine()!!.toString()
        println("Введите породу собаки: ")
        var poroda= readLine()!!.toString()
        println("Введите возраст собаки: ")
        var vozr= readLine()!!.toInt()
        println("Введите рост собаки: ")
        var rost= readLine()!!.toDouble()
        println("Введите окрас собаки: ")
        var color= readLine()!!.toString()
        println("Введите вес собаки: ")
        var ves = readLine()!!.toDouble()
        println("Введите характер собаки: ")
        var har= readLine()!!.toString()
    }
    abstract fun info():String
}