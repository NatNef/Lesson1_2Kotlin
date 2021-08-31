package keyone.keytwo.lesson1_2kotlin;


//Singleton для того, что-бы обращаться к одному классу из разных мест

public class JavaSingleton {

    public String field1 = "";

    private static JavaSingleton INSTANSE = null;

    public static JavaSingleton getInstance(){
        if (INSTANSE==null){
            INSTANSE = new JavaSingleton();
        }
        return INSTANSE;
    }
}
