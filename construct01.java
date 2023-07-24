public class construct01 {
//    构造器/构造方法 
//    作用是初始化对象，而不是创建对象
//    //构造方法不能有static，没有返回值
//    有默认修饰符，
//    方法名与类名必须一致，
//    构造器由系统调用,只要创建对象就调用构造器
//    系统默认构造函数是空实现；
   
   public static class Person{
        String name ;
        int age;
        public Person(String pname,int page){ 
            name = pname;
            age = page;
        }
        public Person(String pname){
         name = pname;
        }

   }
   public static void main(String[] args) {
      Person p1 = new Person("lyp",18);
        System.out.println(p1.age);
        System.out.println(p1.name);
        Person p2 = new Person("lyp");
        System.out.println(p2.age);
        System.out.println(p2.name);
   }
}
    
class construct02{

   public static class Dog {

      int age = 10;
      String name ;
   
   public Dog(int a ,String n){
      age = a;
      name = n;
   }

}

public static void main(String[] args) {
        
        Dog D = new Dog(1,"qiuiqu");
        //对象创建流程：
        //在方法区加载类的信息
        //在堆区开辟空间，
        //将属性赋值为默认值
        //初始化属性值
        //调用构造函数修改初始化
        //返回给对象引用D
        //!!!!!!!!!所以说明构造器作用是初始化对象，而不是创建对象


    }   
}



class this01{
   public static class Dog{
      String name;
      int age;
      public Dog(String name,int age){
         this.name = name;
         this.age = age;
      }

   }
   public static void main(String[] args) {
      Dog D = new Dog("qiuqiu",13);
      System.out.println(D.age);
      System.out.println(D.name);

   }
}


//this 关键字： jvm会给每个对象分配一个this代表当前对象。

 class this02{
   public static class Dog{
      int age;
      String name;
      public Dog(String name,int age){
            this.age = age;
            this.name = name;
            System.out.println("构造函数" + this.hashCode());
      }
      public void info(){
         System.out.println(age);
         System.out.println(name);
         System.out.println("info " + this.hashCode());
      }
   }

   
   public static void main(String[] args) {
     
      Dog d = new Dog("qq",12);
      System.out.println("d " + d.hashCode());
      Dog e = new Dog("qqq",1212);
      d.info();
     

   }
}


class this_detail {
   //this关键字用来区分当前类的属性和局部变量
   //this关键字用来访问本类的  属性 方法 构造器
            //访问构造器语法：this(参数列表) 只能在构造器的第一行使用，用处是在构造器中访问另一个构造器；
   //this不能在类定义外部使用，只能在类定义的方法中使用
  
    public static void main(String[] args) {
         T t = new T();
         t.f2();
         t.f3();
    }
}

class T {
   String name = "jack";
   int age =18;
   public T(){
      //访问构造器语法
      //注意：this访问构造器的语法必须在第一条
      this("jack",18);
   
      System.out.println("T");
     
   }

   public T(String name,int age){
      System.out.println("T(String name,int age)");
   }
   public void f1(){
      System.out.println("f1");
   }
   public void f2(){
      System.out.println("f2");
      f1();
      this.f1();
      //有区别，在继承中会讲
   }
   public void f3(){
      System.out.println(age);
      System.out.println(name); // (作用域)就近原则，容易被重名的局部变量截胡
      System.out.println(this.age); //准确无误的，标准的,绝对不会出错的
      System.out.println(this.name);
   }
}