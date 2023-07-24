public class oop{

	public static class Person{

		int age;
		String name;
		double sal;
		boolean isPass;
		//属性具有默认值

	}

	public static class car{
		String name;//属性，又叫成员变量，字段，filed
		double price;
		String color;
		String[] master;
		//属性可以是基本类型，可以是引用类型
	}


	
	//访问修饰符：public(默认) protected private
	public static class Cat{
		String name;
		int age;
		String color;
	}
	//Cat就是一个数据类型


	public static void main(String[] args) {
		//类与对象：
		//类就是自己定义的数据类型，对象就是具体实例
		int a = 120;
		//int 就是一个类，a就是int类的具体对象！


		//实例化一只猫：（创建一只猫对象）
		Cat cat1 = new Cat() ; 
		//new Cat();创建一只猫，将创建的猫让变量cat1接收
		//cat1 的类型是 Cat;
		//cat1 是对象的引用,在口语中说cat1对象，其实并不准确，cat1只是这个对象的名字

		cat1.name ="小花";
		cat1.age=100;
		cat1.color="花色";


		Cat cat2 = new Cat();
		cat2.name ="小白" ;
		cat2.age=3;
		cat2.color="白色";

		System.out.println(cat1.age);

		//创建对象person1，person是对象名，person指向的空间及其所属的数据才是对象本身
		Person person1 = new Person();
		System.out.println(person1.age); 
		//0
		System.out.println(person1.name);
		//null
		System.out.println(person1.sal); 
		//0.0
		System.out.println(person1.isPass); 
		//false

	}


	//对象在内存中的布局：
	// 对象是引用类型：
	// cat1在栈区 cat1里面存放地址 指向堆区，堆区里面存放的是基本数据类型，
	// 						  引用类型会存放一个地址，这地址指向方法区的常量池

}
//主类oop结束




class howtodefine_obj{

	public static class Cat{
		int age;
		String name;
	}

	public static void main(String[] args) {
		//先声明再创建
		Cat cat1;
		cat1 = new Cat();
		//直接创建
		Cat cat2 = new Cat();
	}
}



class obj_moemory_allocate{
	//1.方法区加载属性信息和方法信息
	//2.在堆区开辟空间，将空间地址返回到栈区
	//3.栈区的变量指向此地址
	//4.属性值分开存放，基本数据类型放在堆区，引用类型放在方法区的常量池

	public static class Person{
		int age ;
		String name;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "lyp";
		p1.age = 20;
		Person p2 = p1;
		System.out.println(p1.age); // 20
		System.out.println(p2.age);// 20
		p1.age = 21;
		System.out.println(p1.age);// 21
		System.out.println(p2.age);// 21
	}
}


class obj_moemory_allocate_practice{
	public static class Person{
		int age ;
		String name;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10 ;
		p1.name = "xiaoming";
		Person p2 = p1;
		System.out.println("p2 name = " + p2.name);//xiaoming
		p2.age = 200 ;
		p2 = null ;
		System.out.println("p1 age = " + p1.age);//200
		System.out.println("p2 age = " + p2.age);
		//error:Cannot read field "age" because "<local2>" is null
	}
}

class obj_method{
	//成员方法：
	//调用机制：
	public static class Person{
		int age;
		String name;

		public void speak(){
			//public 访问权限为公开
			//void 方法返回值，speak是方法名，（）形参列表
			System.out.println("im a good guy");
		}

		public int sum_num(int a ,int b){

			int sum = a+b;
			return sum;
		}

		public int value_to_add1to1000(){
			int sum = 0;
			for(int i = 0; i<=1000;i++){

				sum += i;
			}
			return sum;
		}

		public int value_to_add1to_j(int j){
			int sum = 0;
			for(int i = 0; i<=j;i++){

				sum += i;
			}
			return sum;
		}
	}

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "lyp";
		p1.age = 20;
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.speak();
		System.out.println(p1.sum_num(1,2));
		System.out.println(p1.value_to_add1to1000());
		System.out.println(p1.value_to_add1to_j(5));
		System.out.println(p1.value_to_add1to_j(10));

	}


	//方法调用机制原理图：很重要！
	//栈区的空间由计算机统一管理，函数执行完毕之后自动的销毁空间

}




 class member_method{

	 //成员方法实现遍历二维数组
	 public static class Mytraverse{
		 public void print_2dimen_array(int[][] map){
			 for(int i = 0 ;i<map.length;i++){
				 for (int j =0; j<map[i].length;j++ ) {
					 System.out.print(map[i][j]);

				 }
				 System.out.println();
			 }
		 }
	 }

	 public static void main(String[] args) {

		 //普通二维数组遍历：代码冗余，复用性质极差
		 //int[][] map = new int[3][3];
		 int map[][] = {{0,0,1},{1,1,1},{1,1,3}};

		 for(int i = 0 ;i<map.length;i++){
			 for (int j =0; j<map[i].length;j++ ) {
				 System.out.print(map[i][j]);

			 }
			 System.out.println();
		 }

		 Mytraverse Mytraverse1 = new Mytraverse();
		 Mytraverse1.print_2dimen_array(map);
	 }
 }


 //

class  mem_method_Detail{
	//成员方法的细节
	//访问修饰符：public private 默认 protected
	//返回值不一定是一个值，利用数组可以返回多个值，返回值可以是任意数据类型，包括基本数据类型和引用数据类型(数组，对象)
	//方法之中不能嵌套定义方法

	//方法调用细节：同一个类中的方法可以直接调用;夸类方法类调用，需要通过新实例化对象调用，并且受到访问权限的限制
	public static class AA{
		public int[] getSum_and_Sub(int n1,int n2){
			int[] res = new int[2];
			res[0] = n1 + n2;
			res[1] = n1 - n2;
			return res;
		}


		public void sayAA(int a,int b){
			System.out.println("Say AA" + " " + (getSum_and_Sub(a,b)[0]) + (getSum_and_Sub(a,b)[1]));
		}
	}

	public static class BB{


		public void sayBB(){
			AA a = new AA();      //夸类方法的调用
			a.sayAA(1,2); //3-1
			System.out.println("hello BB");
		}
	}

	public static void main(String[] args) {

		AA aa = new AA();
		BB bb = new BB();
		System.out.println(aa.getSum_and_Sub(1,2)[0]); //3
		System.out.println(aa.getSum_and_Sub(1,2)[1]); //-1

		aa.sayAA(1,2);
		bb.sayBB();
	}
}




class basic_datatype_pass_arguements{

	public static class test{
		public static void myswap(int a ,int b){
			int tmp = a ;
			a=b;
			b=tmp;
			System.out.println(a);//20
			System.out.println(b);//10
		}
	}

	public static void main(String[] args) {
		test test01 = new test();
		int j = 10;
		int k =20;
		test01.myswap(j,k);
		System.out.println(j);
		//10
		System.out.println(k);  
		//20
		//基本数据类型，传值pass by value ，形参的修改不会改变实参
	}
}


class refer_datatype_pass_arguements{

	public static class test02{
		public static void  mytestarr(int[] arr){
			arr[0]=200;
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}
		}

	}

	public static void main(String[] args) {
		int arr[]={1,2,3};
		test02 t = new test02();
		t.mytestarr(arr);
		System.out.println(arr[0]);
		//引用数据类型，传地址pass by reference(adress)，形参的修改会改变实参

	}
}






class MethodParameter02 { 
	
	public static class Person {
		String name;
		int age; 
	}
	public static class B {
		public void test200(Person p) {
			//p.age = 10000; //修改对象属性
			//思考
			p = new Person();
			p.name = "tom";
			p.age = 99;
			//思考
			//p = null; 
		}
	
		//B类中编写一个方法test100，
		//可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
		public void test100(int[] arr) {
			arr[0] = 200;//修改元素
			//遍历数组
			System.out.println(" test100的 arr数组 ");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		//测试
		B b = new B();
		// int[] arr = {1, 2, 3};
		// b.test100(arr);//调用方法
		// System.out.println(" main的 arr数组 ");
		// //遍历数组
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }
		// System.out.println();

		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		//测试题, 如果 test200 执行的是 p = null ,下面的结果是 10
		//测试题, 如果 test200 执行的是 p = new Person();..., 下面输出的是10
		System.out.println("main 的p.age=" + p.age);//10000 
	}
}


class CLONE_A_OBJ{
	//克隆一个对象的属性值
	public static class MyPerson{
		int age = 18;
		String name = "LL";

	}

	public static class MyTool{
		public static MyPerson copyperson(MyPerson mp){	
				
				MyPerson MP = new MyPerson();
				MP.age = mp.age;
				MP.name = mp.name;
				return MP;

		}
	}
	public static void main(String[] args) {
		MyPerson mp = new MyPerson();
		MyTool MT = new MyTool();
		MyPerson MP = MT.copyperson(mp); //调用并且接受
		System.out.println(MP.age);
		System.out.println(MP.name);

	}
}







class recursion{

	static class T {
		public static void Test01(int n){
			if(n>2){
				Test01(n-1);
			}
			System.out.println("n="+n);
		}
	}
	public static void main(String[] args) {
		
	}
}