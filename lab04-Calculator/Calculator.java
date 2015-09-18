//You will write a Calculator program using the switch statement. You will
//prompt the user for two intergers a and b and an operator (‘*', '-'. '+', or '/'). Display "Illegal
//operator" if the operator is invalid. You will compute and display a+b, a-b, a*b, or a/b according
//to the operator.
import java.util.Scanner;
public class Calculator{
public static void main(String[] args) {
Scanner myScanner=new Scanner(System.in);
System.out.print("Enter value a:");
int a=myScanner.nextInt( );    
System.out.print("Enter value b:");
int b=myScanner.nextInt( );
System.out.print("Enter one of the following operations: * - + /?:");
String operatorString= myScanner.next();

int value1=a*b;
int value2=a-b;
int value3=a+b;
int value4=a/b;

switch(operatorString){
case "*": System.out.println("a*b="+value1);
break;
case "-": System.out.println("a-b="+value2);
break;
case "+": System.out.println("a+b="+value3);
break;    
case "/": System.out.println("a/b="+value4);
break;    
default : System.out.println("Illegal operator");
break;    
}
} //end of main method
} //end of class