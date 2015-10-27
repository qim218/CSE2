import java.util.Scanner;

public class areas{
    
    public static double area1(int radius){
        
        double area=3.14*radius*radius;
        
        return area;

    }
    
    public static int area2(int length, int width){
        
        int area=length*width;
        
        return area;
    }
    
    public static int area3(int height, int base1, int base2){
        
        int area=(base1+base2)*height;
        
        return area;
        
    }
    
    public static void main(String[] args) {
        
    System.out.print("circle,rectangle or trapezoid?");
    
    Scanner myScanner=new Scanner(System.in);
    
    String A=myScanner.next();
    
    switch(A){

    case "circle": System.out.print("radius?");
    
    int radius=myScanner.nextInt();
    
    double area=area1(radius);
    
    System.out.println(area);
    
    break;
    
    case "rectangle": System.out.print("length?");
    
    System.out.print("width?");
    
    int length=myScanner.nextInt();
    
    int width=myScanner.nextInt();
    
    int areaR=area2(length,width);
    
    System.out.println(areaR);
    
    break;

    case "trapezoid": System.out.print("height?");
    
    System.out.print("base1?");
    
    System.out.print("base2?");
    
    int height=myScanner.nextInt();
    
    int base1=myScanner.nextInt();
    
    int base2=myScanner.nextInt();
    
    int areaT=area3(height,base1,base2);
    
    System.out.println(areaT);
    
    break;
    
    }
    
    }
    
}