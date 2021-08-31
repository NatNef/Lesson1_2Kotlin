package keyone.keytwo.lesson1_2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    // поле для статичесского метода
    companion object Reserv{
        val field1 = "Static_string"


    }


    val i:Int = 0; // val значит, что наша переменная никогда не изменится
   // var i:Int = 0; // вариативная може менятся
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val objTest = Test("name")

       val getI = objTest.i
       objTest.i = 2
     //  this.i = 2;

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
    class Test(var name1: String, var name2: String="") {

        var i:Int = 0
        // я хочу поздняя инициализация
    }
}

  fun test(name1: String, name2: String=""):Int{
      var i:Int = 0
      return i
  }