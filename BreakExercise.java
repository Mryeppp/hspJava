import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args) {
		//1-100的和，大于20时，求此时是几
		int sum = 0;
		int n=0;

		for(int i = 1 ; i <= 100 ; i++){
			
		    sum += i;
			if(sum>20){
				System.out.println("sum>20的时候i="+i);
				n=i;
				break;
			}
		}
		System.out.println("i="+n);

}
		
}

class BreakExercise02{


	public static void main(String[] args) {
		//登陆验证三次机会，否则提示还有几次机会
		//思路：创建Scanner对象接受用户输入，定义String name和String passward
		//保存用户名和密码
		//最多循环三次，满足条件提前退出	
		
		Scanner myscnner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;//登陆一次少一次
		for(int i = 1 ; i <= 3 ; i++){
			System.out.println("请输入名字");
			name = myscnner.next();
			System.out.println("请输入密码");
			password = myscnner.next();

			if(name.equals("丁真") && password.equals("666")) {
					System.out.println("恭喜你登陆成功");
					break;
			}
		    //中文因为输入法问题无法成功
			chance--;
			System.out.println("你还有" + chance + "次登陆机会");
		}
	}
}