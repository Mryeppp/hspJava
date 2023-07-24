public class Varparameter01 {

    //可变参数：java允许将同一个类中的多个同名，同功能，但参数不同的方法封装成一个方法
    //实参可以是0个或者多个，可变参数的本质就是数组
    //实参可以是数组
    //一个形参列表只能有一个可变参数
    //可变参数可以和普通参数一起出现在形参列表，但是可变参数必须在形参列表最后
    static class HspMethod {
        public static int sum(int... a) {
            //a是一个数组
            int res = 0;
            for (int i = 0; i < a.length; i++) {
                res += a[i];
            }
            return res;
        }

        public static void f1(int... nums) {
            System.out.println("长度" + nums.length);
        }

        //可变参数可以和普通参数一起出现在形参列表，但是可变参数必须在形参列表最后
        public static void f1(double a, int... nums) {
            System.out.println("长度" + nums.length);
        }

        //错误：Vararg 形参必须为列表中的最后一个形参
//              public static  void f1(int... nums,double a ){
//                System.out.println("长度"+ nums.length);
//            }
//    }
        public  static  void ShowScore(String name,double... score){
            double s_all = 0;
            for(int i =0;i<score.length;i++){
                 s_all += score[i];
            }
            System.out.println(name + s_all);
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            HspMethod hs = new HspMethod();
            int res = hs.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            System.out.println(res);

            hs.f1(arr); //长度5 //进一步说明，可变参数本质是数组

            hs.ShowScore("lyp",90,90,100);
            hs.ShowScore("lyf",90,90);
            hs.ShowScore("ys",100,100,100,95,92);

        }
    }
}
