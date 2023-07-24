import java.util.Scanner;

public class continue1{
	public static void main(String[] args) {
	
		label1:
		for (int j = 0  ; j < 4 ; j++ ) {
			   	
			   	label2:
			   	for (int i = 0 ; i < 10 ; i++ ) {

			   		if(i == 2){
			   			//continue label1; //01010101
			   			//continue label2; //
			   			continue;//等价于label2
			   			//013456789 013456789 013456789 013456789
			   	}
			   	System.out.println("i =" + i);
			   		
			}
		}	   
	}
}