import java.util.Scanner;

public class oop_practice {

    //1.编写一个类AA判断一个数是奇数还是偶数
     public static class AA{

         Scanner mysc = new Scanner(System.in);
        int num_to_check = mysc.nextInt();
        public void checknum(){
            if(num_to_check % 2 == 0){
                System.out.println("偶数");
            }else{
                System.out.println("奇数");
            }
        }
    }
    //2.编写一个类根据行列字符打印对应的行数和列数的字符

    public  static class PrintChar{
        public void print_char(int row,int col,char c){
            for(int i = 0 ;i<row;i++){
                for(int j = 0 ;j<col;j++){
                    System.out.print(c+"\t");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {//??只能有一种对象存在？
        PrintChar pc = new PrintChar();
        pc.print_char(3,4,'a');

        /*

        a	a	a	a
        a	a	a	a
        a	a	a	a

        */

         while (true) {
           AA aa = new AA();
           aa.checknum();
       }

    }
}
