import java.util.Scanner;

public class pyramid{
    
    public static void main(String[] args) {
    
        Scanner myScanner=new Scanner(System.in);
        
        System.out.println("what size pyramid?:");
        
        int n = myScanner.nextInt();
        
        int a = n*2-1;
        
        for (int i=0; i<n; i++){
            
            for (int j=1; j<=a; j++){
                
                if (j<=n+i && j>=n-i){
                    
                    System.out.print("*");
                
                }
                
                else{System.out.print(" ");}
            }
        System.out.println("");
            
        }
}

    
}