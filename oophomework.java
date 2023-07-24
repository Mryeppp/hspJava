import java.util.Scanner;

public class oophomework {
    public static void main(String[] args) {
        System.out.println("oophomework.java");
    }
}

class TestPerson{
    public static void main(String[] args) {
        Person p0 = new Person(18,"jack");
        Person p1 = new Person(18 ,"jack");
        boolean res = p0.compare_to(p1);
        System.out.println(res);
    }
}

class Person {
    int age;
    String name;
    public Person(int age , String name){
        this.age = age;
        this.name = name;
    }
    public boolean compare_to(Person p){
        if(this.age == p.age && this.name == p.name) {return true;}
        else {return false;}
    }
}



class A01{
    double darr[] = {1.2,2.4,3.0,6.7,4.1};
    double max_ele = 0 ;
    public Double findmax(double[] arr) {
        if(arr!= null && arr.length == 0){

            return null;

        }
        for (int i = 0; i< arr.length-1 ;i++){

            if(arr [i] < arr[i+1]){ max_ele = arr[i+1];}

        }
        return max_ele;
    }
    public static void main(String[] args) {
        A01 a = new A01();
        Double res = a.findmax(a.darr);
        if(res != null){
            System.out.println("arr的最大值=" + res);
        }else {
            System.out.println("arr输入有误,数组不可以为null或者{}");
        }

    }
}

class A02 {
    String carr[] = {"abc", "ba", "c", "daaaa", "e", "f", "sssssssg"};

    public int find(String[] a, String b) {
        for (int i = 0; i < a.length; i++) {
            if (b.equals(a[i])) {
                return i;
            }

        }
        return -1;
    }

        public static void main (String[] args){
            A02 a02 = new A02();
            if (a02.carr != null) {
                int res = a02.find(a02.carr, "e");
                System.out.println(res);
            } else {
                System.out.println("数组不可以为null");
            }

        }
    }



class PrciceofBook{
    public static void main(String[] args) {
        Book book01 = new Book(180);
        Book book02 = new Book(120);
        Book book03 = new Book(80);
        book01.updatePrice();
        book02.updatePrice();
        book03.updatePrice();
    }
}

class Book{
    int price;
    public Book(int price){
    this.price = price;
    }
    public void updatePrice(){
        if(this.price >= 150) { 
            this.price = 150 ; 
            System.out.println(this.price);
            return ;
         }
        else if(this.price > 100 && this.price < 150) {
            this.price = 100 ; 
            System.out.println(this.price);
            return ;
        }
        else { 
            System.out.println(this.price);
            return ;
        }
    }
}

class A03{

    public int[] newarr(){
        System.out.println("请输入您希望的数组长度：");
        Scanner in02 = new Scanner(System.in);
        System.out.println("请输入数组元素：");
        Scanner in01 = new Scanner(System.in);


        int[] b = new int[in02.nextInt()];
        for (int i = 0; i < b.length; i++) {
            b[i] = in01.nextInt();
        }


        return b;
    }


    public int[] copyarr(int[] arr){
        int[] cparr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){


             cparr[i] = arr[i];
        }
        return cparr;
    }

}

class TestCopyArr {

    public static void main(String[] args) {

        A03 a03 = new A03();

        int[] newa = a03.copyarr(a03.newarr());
        System.out.println("copy数组：");
        for (int i = 0; i < newa.length; i++) {
            System.out.print( newa[i] + "\t");
        }
    }
}




class Circle{
    double PI = 3.14;
    int r;
    public Circle(int r){this.r = r;}
    public void showCircumference(){
        System.out.println(this.PI*this.r*2);
    }
    public void showArea(){
        System.out.println(this.PI*this.r*this.r);
    }

}

class showCircle{
    public static void main(String[] args) {
        Circle c = new Circle(2);
        c.showArea();
        c.showCircumference();

    }
}




class Cale{
    int a;
    int b;
    public Cale(int a ,int b){
        this.a = a;
        this.b = b;

    }
    public void sum(){
        System.out.println(this.a+this.b);
    }
    public void minus(){
        System.out.println(this.a-this.b);
    }
    public void div(){
        if( this.b == 0 ){
            System.out.println("div error");
            return ;
        }
        else{
            System.out.println(this.a/this.b);
        }

    }
    public void mul(){
        System.out.println(this.a*this.b);
    }
}
class TestCale{
    public static void main(String[] args) {
        Cale newCale = new Cale(1,0);
        newCale.sum();
        newCale.minus();
        newCale.div();
        newCale.mul();

    }
}



