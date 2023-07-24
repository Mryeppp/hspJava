import java.util.Scanner;;
public class Scope01 {
    
    //作用域
    
//局部变量在自己的代码块中使用,局部变量没有默认值，必须赋值以后才可以使用
//全局变量在程序各个地方都可以使用，不需要赋值，因为全局变量有默认值
//属性和局部变量可以重名，访问的时候依据就近原则
//同一个作用域中，两个局部变量不能重名
//属性生命周期长，局部变量生命周期短
//全局变量/属性可以加修饰符，局部变量不可以加修饰符


static class Person{
    String name = "jack";  //属性，生命周期长

    public static void say(){
        String name = "king"; // 局部变量，生命周期短

        System.out.println("say() name = " + name);
    }

    public static void hi(){
        String adress ="sh";
      //String adress = "bj"; //同一个作用域中，两个局部变量不能重名
        String name = "hsp";


    }
}





public static void main(String[] args) {

        Person p = new Person();
        p.say();  
        //就近原则，输出king 
        

    }
}
