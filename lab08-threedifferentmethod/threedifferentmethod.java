import java.util.Scanner;

public class threedifferentmethod{
    
    public static int mean(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j){
        
        int mean=(a+b+c+d+e+f+g+h+i+j)/10;
        
        return mean;
        
    }
    
    public static double median(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j){
        
        double median=(e+f)/2;
        
        return median;
        
    }
    
    public static void main(String[] args) {
        
    Scanner myScanner=new Scanner(System.in);
    
    System.out.print("a?");
    System.out.print("b?");
    System.out.print("c?");
    System.out.print("d?");
    System.out.print("e?");
    System.out.print("f?");
    System.out.print("g?");
    System.out.print("h?");
    System.out.print("i?");
    System.out.print("j?");
    int a=myScanner.nextInt();
    int b=myScanner.nextInt();
    int c=myScanner.nextInt();
    int d=myScanner.nextInt();
    int e=myScanner.nextInt();
    int f=myScanner.nextInt();
    int g=myScanner.nextInt();
    int h=myScanner.nextInt();
    int i=myScanner.nextInt();
    int j=myScanner.nextInt();
    
    int mean=mean(a,b,c,d,e,f,g,h,i,j);
    
    System.out.println(mean);
    
    double median=median(a,b,c,d,e,f,g,h,i,j);
    
    System.out.println(median);
    
    }
    
}
    
    