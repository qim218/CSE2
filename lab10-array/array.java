import java.util.Scanner;

public class array {
	public static void main(String[] args){
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the size of array"); 
		int size = A.nextInt();
		int[] ary = new int[size];
		for(int i=0;i<size;i++){
			ary[i]=(int) (Math.random()*100);
		}
		for(int j=0;j<size;j++){
			System.out.println(ary[j]); 
		}
		int sum=0; 
		for(int k=0;k<size;k++){
			sum+=ary[k]; 
		}
		double avg = (double)sum/(double)size;
		System.out.println("sum is"+sum+"average is"+avg); 
		for(int p=0;p<size;p++){ 
			if(ary[p]>=avg){ 
				System.out.println(ary[p]); 
			}
		}
		
	}
}