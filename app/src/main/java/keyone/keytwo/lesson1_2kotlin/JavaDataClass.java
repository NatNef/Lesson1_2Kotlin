package keyone.keytwo.lesson1_2kotlin;

import android.view.View;

public class JavaDataClass {

    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    public JavaDataClass() {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;

    }

    // крпируем метод copy
    private JavaDataClass copy (JavaDataClass javaDataClass) {
        JavaDataClass newJavaDataClass = new JavaDataClass();
        JavaSingleton.getInstance().field1 = "hjh";
        KotlinSingleton.INSTANCE.setField1("hjh");




        newJavaDataClass.field1 = field1;
        newJavaDataClass.field2 = field2;
        newJavaDataClass.field3 = field3;
        newJavaDataClass.field4 = field4;
        newJavaDataClass.field5 = field5;
        return newJavaDataClass;

}


    @Override
    public String toString() {
        return "JavaDataClass{" + JavaSingleton.getInstance().field1+ KotlinSingleton.INSTANCE.getField1()+
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                '}';
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }
}
