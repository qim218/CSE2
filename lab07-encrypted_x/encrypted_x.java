import java.util.Scanner;

public class encrypted_x{
    
    public static void main(String[] args) {
    
        Scanner myScanner=new Scanner(System.in);
        
        System.out.println("what size ?:");
         
        int n = myScanner.nextInt();
        
        if (n<0 || n>100) {
            
            System.exit(-1);
        }
        
        for (int i=0; i<=n; i++){
            
            for (int j=0; j<=n; j++){
                
                if (j==i || j==n-i){
                    
                    System.out.print(" ");
                    
                }
                
                else{System.out.print("*");}
                
            }
                
                System.out.println("");
                
        }
        
    }
    
}