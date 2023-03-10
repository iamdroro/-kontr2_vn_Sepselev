import kotlinx.coroutines.*

    suspend fun main() {
        var Dog: Dog = Dog("Молли", "Шпиц", 7, 40.0, "Серебристый металлик", 7.5, "Злая")
        println("Сколько будет повторений")
        var a = readLine()!!.toInt()
        println(Dog.info())
        GlobalScope.launch {
            for (i in 1..a) {
                println("$i раз");
Dog.input()
                Dog.Sob()
                Dog.Vozr()
                println(Dog.info())

            }
        }
        runBlocking { delay(60000L) }
    }
