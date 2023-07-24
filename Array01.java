import java.util.Scanner;

public class Array01 {
  public static void main(String[] args) {
    System.out.println("Array01");
  }
}

class Array_dynamic_init01 {
  public static void main(String[] args) {
    // 数组的定义：动态初始化 和 静态初始化
    Scanner input = new Scanner(System.in);
    // 动态初始化01
    int arr[] = new int[5];// 数组里的内容默认是0
    for (int i = 0; i < 5; i++) {
      arr[i] = input.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }

  }
}

class Array_dynamic_init02 {
  public static void main(String[] args) {
    // 动态初始化02
    Scanner input = new Scanner(System.in);
    int arr[];
    arr = new int[5];// 分配了空间才可以开始赋值了
    // 声明，还没有分配空间
    for (int i = 0; i < 5; i++) {
      arr[i] = input.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }

  }
}

class Array_static_init {
  public static void main(String[] args) {
    // 静态初始化：
    
    int arr[] = {1,2,3,4,5};
    for(int i = 0 ; i < 5 ; i++){
      System.out.println(arr[i]);
    }
   
  }
}

//数组的使用细节和注意事项
class Array_Detail{
  public static void main(String[] args) {
    //数组里的数据是多个相同数据的类型集合
    //数组中的可以是任何数据类型，可以是基本类型和引用类型（对象，接口，字符串）
    String[] arr={"nj","bj","xian"};
    //数组创建后，如果不赋值，则有默认值
    //数组属于引用类型，数组型数据是对象(object)
  }
}

//数组赋值机制
class Array_assignment{
  public static void main(String[] args) {
    //数组在默认情况下是引用传递，赋值的是地址
    //所以修改arr1的时候arr的值也被修改了
    //由此引出引用传递(地址传递)和值传递的区别
    int arr[] = {1,2,3};
    int arr1[] = arr;
    for(int i = 0 ;i<3;i++){
      System.out.print("arr=" + arr[i] + " ");
      
    }
    System.out.println();
    for(int i = 0; i<3;i++){
      System.out.print("arr1=" + arr1[i]+ " ");
    }
    arr1[0] = 10 ;
    System.out.println();
    for(int i = 0 ;i<3;i++){
      System.out.print("arr=" + arr[i]+ " ");
      
    }
    System.out.println();
    for(int i = 0; i<3;i++){
      System.out.print("arr1=" + arr1[i]+ " ");
    }
  }



}


class Array_Copy{
  public static void main(String[] args) {
    int arr[] = {1,2,3};
    int arr2[] =new int[arr.length]; //开辟一个新的地址
    //此时修改arr2 不会改变arr
    for (int i = 0; i < arr.length; i ++ ) {
      arr2[i] = arr[i];
        System.out.println(arr2[i]);
     } 
  }
}

class Array_Rverse01{
  public static void main(String[] args) {
    
    int arr[] = {1,2,3,4,5,6,7};
    int arr_verse [] = new int [arr.length]; 
  
  for (int i = 0; i < arr.length; i ++ ) {
      arr_verse[arr.length-1-i] = arr[i];
        
     } 
     //直接打印arr_verse当然可以，但是有空间浪费
     arr = arr_verse; //销毁arr空间
     for(int j = 0 ;j < arr.length ; j++){
      System.out.println(arr[j]);
     }
   }
}//时间复杂度和空间复杂的不够优秀，开辟了新的内存，用了两次循环  

class Array_Rverse02{
    public static void main(String[] args) {
      int arr[] = {11,22,33,44,55,66,77};
      int len = arr.length;
      for(int i = 0 ; i < len/2 ; i++){
          int tmp = arr[len-1-i];
          arr[len-1-i] = arr[i];
          arr[i] = tmp;
      }
      for(int j = 0 ; j< len ;j++){
      System.out.println(arr[j]);
    }
  }
}

class Array_dynamic_add {//数组的动态扩容
    public static void main(String[] args) {
        
          Scanner mysc = new Scanner(System.in);
          int[] arr = {1,2,3,4};

      while(true){

            int[] newarr = new int[arr.length+1];
            for(int i= 0 ;i<arr.length;i++){
              newarr[i] = arr[i];
              //拷贝
            }
            System.out.println("输入要添加的元素：");
            int addnum = mysc.nextInt();
            newarr[newarr.length-1] = addnum;
            //添加
            arr = newarr;
            //销毁空间
            System.out.println("扩容后数组情况：");
            for (int i = 0;i<arr.length;i++){
                System.out.println(arr[i]+"\t");
            }
            System.out.println("是否继续，请输入y/n");
            char key =mysc.next().charAt(0);
            if(key != 'y'){
                break;
            }
         }
          
  }
}


class Dynamic_Reduce_Array{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner reduce = new Scanner(System.in);

        while(arr.length>1) {
            int arrnew[] = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arrnew[i] = arr[i];
            }
            arr = arrnew;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
            System.out.println("是否继续缩减？y/n");
            char key = reduce.next().charAt(0);
            if (key != 'y') {
                break;
            }

        }
        System.out.println("长度不够");
    }

}


class Array_Bubble_sort{

    public static void B_sorting(int arr[]){
            for(int i = 0 ;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j+1]<arr[j]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;

                    }

                }

                System.out.println("\n==第"+(i+1)+"轮==");
                for(int k = 0 ; k<arr.length;k++){
                    System.out.print(arr[k] + "\t");
                }
            }
    }

    public static void main(String[] args) {
            //
        int arr[] ={87,89,56,1,78,465,23,46};
        B_sorting(arr);
//        for(int i = 0 ;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }

    }

}