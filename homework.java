import java.util.Scanner;
public class homework{

}

class homework01{
	public static void main(String[] args) {
		int count1 = 0;
		int count2 = 0;
		
		Scanner myscanner = new Scanner(System.in);
		double cash = myscanner.nextDouble();

		while(cash > 50000){
			cash = cash - cash*0.05;
			count1+=1;
			if(cash <= 50000){
				break;
		}

		while (cash > 1000 && cash <=50000){
			cash -= 1000;
			count2+=1;
		}
		int count = count1 + count2;
		System.out.println("这个人能过这个路口"+ count + "次");

	}
}


class homework02{
	//判断整数的范围 大于0 小于0 等于0
	public static void main(String[] args) {
		Scanner myscanner02 = new Scanner(System.in);
		int num = myscanner02.nextInt();
		//嵌套:
		if(num >0){
			System.out.println(">");
			}
		else if(num == 0){
				System.out.println("=");
			}
		
		else{
			System.out.println("<");
		}

		
		}
	}
	
class homework03{
	public static void main(String[] args) {
		//判断闰年
	Scanner myscanner03 = new Scanner(System.in);
	System.out.println("请输入一个年份：");
	int year = myscanner03.nextInt();
	if(year%4==0&&year%100!=0||year%400==0){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
		
	}

	
}

class homework04{
	public static void main(String[] args) {
		//水仙花数的判断
		Scanner myscanner04 = new Scanner(System.in);
		System.out.println("输入一个数字");
		int f_num = myscanner04.nextInt();
		if(f_num >=100 && f_num <= 999){

		//求各个位置的数字
			//百位：
			int a = f_num/100;
			//十位
			int b = (f_num % 100) / 10 ;
			//个位：
			int c = (f_num%100)%10;
			if(a*a*a+b*b*b+c*c*c == f_num){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}


		}else{
			System.out.println("位数不符合");
		}
	}
}		

class homework05{
	public static void main(String[] args) {
		//看看输出什么
		int m = 0 , n = 3;
		if(m>0){
			if(n>2){
				System.out.println("OK1");
			}else{
				System.out.println("OK2");
			}
		}
	}
}
//无输出


class homework06{
	public static void main(String[] args) {
		//输出1-100之间不可以被5整除的数字，每五个一行
//?怎么五个一行？计数器！打印五次之后打印一个换行符
		int count_06 = 0; 
		for(int i = 1;i<=100;i++){
			if( i % 5 != 0){
				count_06++;
				System.out.print(i + " ");
				if(count_06 % 5 == 0) {
					System.out.println();
				}

			}
		}
	}
}


class homework07{
	//输出小写a-z以及大写Z-A
	public static void main(String[] args) {
		//考察a-z编码和for循环的结合使用
		//字符的本质就是整数，可以比较大小和自增
		for (char c1 ='a' ; c1 <= 'z' ;c1++ ) {
			System.out.print(c1+" ");
		}
		System.out.println();
		for (char c2 ='Z' ; c2 >= 'A' ;c2-- ) {
			System.out.print(c2 +" ");
		}
	}
} 
class homework08{
	//1-1/2+1/3-1/4……1/100
	//奇数项是加，偶数项是减
	//隐藏条件：分母必须是1.0才能保存精度，否侧1/2==0，1/3==0
	public static void main(String[] args) {

		double sum = 0;
		for(int i = 0 ; i<=100;i++){
			if(i%2!=0){
				sum+=(1.0/i);
			}else{
				sum-=(1.0/i);
			}

		}
		System.out.println(sum);
		
	}
} 

class homework09{
	
	public static void main(String[] args) {

		int sum = 0;

		for(int j = 1 ; j<=100 ; j++){
			for(int i = 1 ; i<=j ; i++ ){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
  } 
}