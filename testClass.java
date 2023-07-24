public class testClass{
	public static void main(String[] args) {
		System.out.println("hhh");
	}
}
class Dog{
	public static void main(String[] args) {
		System.out.println("hello,Dog");

	}
}

class Tiger{
	public static void main(String[] args) {
		System.out.println("hello,Tiger");
		
	}
}
//一个源文件中只有一个public类，其他不限。每一个类编译后每一个类都对于一个.class
//public类名和文件名必须一样


//指定运行其他类，其入口就是main方法  
//		javac  文件名.java
//		java 类名