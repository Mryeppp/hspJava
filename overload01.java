public class overload01 {

    //java 允许一个类中多个同名方法出现，条件是形参列表不同
    //方法名必须一样
    //形参列表的个数，类型，顺序必须至少满足一项不一样
    //与返回值无关！！！！！！返回值一样不能作为重载条件
    static class  Mycalculator{
        public static void calculate(int a ,int b){
            int tmp = a+b;
            System.out.println(tmp);
        }
        public static  void calculate(int a ,double b ){
            double tmp = a +b ;
            System.out.println(tmp);
        }

        public  static  void calculate(double a , int b){
            double tmp = a - b;
            System.out.println(tmp);
        }

        public  static void calculate(int a ,int b, int c){
            int tmp = a+b+c;
            System.out.println(tmp);
        }
    }
    public static void main(String[] args) {
        Mycalculator mc = new Mycalculator();
        mc.calculate(1,2,3);
        mc.calculate(1,2);
        mc.calculate(2.5,2);
        mc.calculate(2,2.5);
    }
}
