import java.util.Scanner;

public class coin{
	public static int flip(){
		int result = (int) (Math.random()+0.5);
		if(result==0){ // 0 is tail
			System.out.println("tail");
		}
		if(result==1){ //1 is head
			System.out.println("head");
		}
		return result;
	}
	public static void flip(int a){
		for(int b =0;b<a;b++){ 
			flip();
		}
	}
	public static void main(String[] args){
		Scanner A = new Scanner(System.in); 
		System.out.println("Enter a number:");
		int num = A.nextInt();
		if(num==0){
			flip();
		}
		 if(num>0 && num<=100){ 
			flip(num);
		}
		else if(num>100){ 
			System.exit(0);
		}
	
	}
}