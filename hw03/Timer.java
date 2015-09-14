import java.util.Scanner;
public class Timer{

public static void main(String[] args) {
Scanner myScanner=new Scanner(System.in);
System.out.print("Enter the current time:");
int CurrentTime=myScanner.nextInt( );
System.out.print("Enter the time that you will be eating dinner:");
int TimeEating=myScanner.nextInt( );
int TimeuntilDinner;
TimeuntilDinner=TimeEating-CurrentTime;
System.out.println("You have"+TimeuntilDinner+"minutes until dinner");
}
}