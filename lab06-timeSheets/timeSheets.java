import java.util.Scanner;


public class timeSheets{
    
    public static void main(String[] args) {
    
        Scanner myScanner=new Scanner(System.in);
        
        System.out.print("Enter the number of employee timesheets:");
        
        int numEmp = myScanner.nextInt();
        
        int payroll=0;
        
        for(int i=0;i<numEmp;i++){
        
            int totalTime = 0;
            
            int hours = 0;
            
            System.out.print("Enter pay per hour:");
            
            int pay=myScanner.nextInt();
            
            for(int j=0;j<5;j++){
                
                switch(j){
                    case 0: System.out.print("Enter hours worked Monday:");
                    hours = myScanner.nextInt();
                    break;
                    case 1: System.out.print("Enter hours worked Tuesday:");
                    hours = myScanner.nextInt();
                    break;
                    case 2: System.out.print("Enter hours worked Wednesday:");
                    hours = myScanner.nextInt();
                    break;
                    case 3: System.out.print("Enter hours worked Thursday:");
                    hours = myScanner.nextInt();
                    break;
                    case 4: System.out.print("Enter hours worked Friday:");
                    hours = myScanner.nextInt();
                    break;
                }
                
                totalTime =  totalTime+hours;
            
            }
            
            payroll += (pay*totalTime);
            
        }
        
        System.out.println("Total pay is "+ payroll);
        
    }
    
}