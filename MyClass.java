public class MyClass {
    public int var1;
    public String var2;
    static String STATIC_VAR = "Статическая переменная";


    public void useStaticVariable() {
        System.out.println("Используем статическую переменную: " + STATIC_VAR);
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.var1 = 1;
        myClass.var2 = "hello";
        STATIC_VAR = "word";
        //Тест-System.out.println(myClass.var1 + myClass.var2 + STATIC_VAR);
    }
}
