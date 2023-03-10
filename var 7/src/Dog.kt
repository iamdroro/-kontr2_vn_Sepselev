class Dog( var name1:String, var poroda1:String,var vozr1:Int, var rost1:Double  ,var color1:String, var ves1:Double, var har1:String):Abstract() {
    override var name=name1
    override var poroda=poroda1
    override var vozr=vozr1
    override var rost=rost1
    override var color=color1
    override var ves=ves1
    override var har=har1
    override fun info():String
        {
           return "Информация о собаке: \nКличка: ${name}\nПорода: ${poroda}\nВозраст: ${vozr}\nРост: ${rost}\nЦвет: ${color}\nВес: ${ves}\nХарактер: ${har} "

        }
    fun Sob()
    {
        println("Какой вес у собаки")
        ves= readLine()!!.toDouble()
        if(ves>15)
        {
            println("У вас тяжелая собака")
        }
        else{ println("У вас легкая собака")};
     }
    fun Vozr()
    {
        println("Какой возраст у собаки")
        vozr= readLine()!!.toInt()
        if(vozr>0)
        {
            var аy:Int
           var ay=vozr*7
            println("Собаке человеческих лет ${ay}")
        }
        else {
            println("Возраст не может быть отрицательным")}
    }

}