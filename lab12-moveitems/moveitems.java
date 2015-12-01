import java.util.Scanner;

public class moveitems{
	  public static void main(String[] args){
		Scanner A = new Scanner(System.in); 
		System.out.println("Enter the size of the array: "); 
		int size=0; 
		int[] arr=null; 
		try {
			size = A.nextInt();
			arr = new int[size-1];	
		} catch(Exception a){
			System.out.println("Invalid input"); 
			System.exit(0); 
		}
		arr = new int[size];
		System.out.println(""); 
		for(int a=0;a<size;a++){
			arr[a] = (int)(Math.random()*100);
			}
		for(int a=0;a<size;a++){
			System.out.print(arr[a]+" "); 
			}
		try{
			System.out.println("Enter the index: ");  
			int index=A.nextInt(); 
			int temp = arr[index];
			for(int a=index;a<size-1;a++){
				arr[a]=arr[a+1];
			}
			
			arr[size-1]=temp; 
			}catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Invalid index"); 
		}
		for(int a=0;a<size;a++){
			System.out.print(arr[a]+" "); 
			}
	}
}