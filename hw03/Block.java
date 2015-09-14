import java.util.Scanner;
public class Block{

public static void main(String[] args) {
Scanner myScanner=new Scanner(System.in);
System.out.print("Enter the length:");
double length=myScanner.nextDouble( );
System.out.print("Enter the width:");
double width=myScanner.nextDouble( );
System.out.print("Enter the height:");
double height=myScanner.nextDouble( );
double volume;
double surfaceArea;
volume=length*width*height;
surfaceArea=(length*width+length*height+width*height)*2;
System.out.println("volume of the block is"+volume);
System.out.println("surface area of the block is"+surfaceArea);
}
}