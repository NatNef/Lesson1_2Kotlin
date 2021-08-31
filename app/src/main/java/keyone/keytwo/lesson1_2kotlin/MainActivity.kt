package keyone.keytwo.lesson1_2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


open class MainActivity : AppCompatActivity() {

  //  Object == is Any в котлин

    // поле для статичесского метода
    companion object Reserv {
        val field1 = "Static_string"

    }

    // через object создаем ананимный класс чего угодно
    // реализовал интерфейс OnClickListener и он реализовал его поведение
    val listener = object : View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }


    }


    var i: Int = 0; // val значит, что наша переменная никогда не изменится

    // var i:Int = 0; // вариативная може менятся
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // поиск кнопки^ клик
        val button = findViewById<Button>(R.id.rfrfz)
        button.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    TODO("Not yet implemented")
                }
        })


        // дз Создать Object. KotlinSingleton
        //В Object вызвать copy и вывести значения скопированного класса на экран.
        val objTest = Test("name","name2")
        val objTest2 = objTest.copy();




        val getI = objTest.i
        objTest.i = 2
        //  this.i = 2;

        //    // if возвращает значение
        this.i = if(objTest.i==3) {1; 2 }else 3


        // when возвращает
        this.i =1
        val String = when(this.i){
            1-> "1"
            2-> {val int1:Int = 12
                int1}
            else ->1
        }

    }

    // погода
    enum class WeatherType {
        SUNNY,
        RAINY,
        CLOUDI,
        MISTY,
        SNOWY,
        HAILY
    }



    //    // if возвращает значение
    //    this.i = if(objTest.i==3) {1; 2 }else 3

    // when возвращает

//    //переменная для WeatherType
//    val weatherType: WeatherType = WeatherType.CLOUDI
//    this.i = when(weatherType){
//        WeatherType.SUNNY 1
//        else -1
//        //создаем для всего
//
//    }
// // или
//    this.i =1
//    val String = when(this.i){
//        1-> "1"
//        2-> {val int1:Int = 12
//        int1}
//        else ->1
//    }

    // создали объект для класса, которого нет, анонимный
    // test3 экземпляр анонимного класса
    val test3 = object {
        var i: Int = 0
        val field1 = "Static_string"
    }


    //   class Test constructor(val name:String, ){
    // или
    //class Test {constructor(name:String,){
    // или class Test (name:String,) {

//class Test {
//
//    var name1:String
//    var name2:String
//
//    constructor(name1:String,name2:String){
//        this.name1 = name1
//        this.name2 = name2
//
//    }
//
//        var i:Int = 0
//        // я хочу поздняя инициализация
//    }


    //  сокращенно
    class Test(var name1: String, var name2: String = "") {

        var i: Int = 0
        // поздняя инициализация

    }





    fun test(name1: String, name2: String=""):Int{
        var i:Int = 0
        return i
    }

    //  циклы

    //список создаем
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday")


    //выводим
    for(day in daysOfWeek) {
        Log.d("mylogs", "$day")
    }

    //или
    // forEach внедряется
    daysOfWeek.forEach{day:String ->
        Log.d("mylogs","it")

    }

    //перечисляет
    repeat(daysOfWeek.size){
        Log.d("mylogs","${daysOfWeek[it]}")
        if(i>2) break
    }

    //ничего
    fun test():Nothing Int{
        while (true){
        }
    }




}


