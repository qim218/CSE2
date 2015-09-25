//You will write a Calculator program using the switch statement. You will
//prompt the user for two intergers a and b and an operator (‘*', '-'. '+', or '/'). Display "Illegal
//operator" if the operator is invalid. You will compute and display a+b, a-b, a*b, or a/b according
//to the operator.Your calculator should ask user for input until they reply “n” or “N”
//to the question “Type n or N to stop”.
import java.util.Scanner;
public class CalculatorSpecial{
public static void main(String[] args) {
while(true){
Scanner myScanner=new Scanner(System.in);
System.out.println("Enter value a:");
int a=myScanner.nextInt( );
System.out.println("Enter value b:");
int b=myScanner.nextInt( );
System.out.println("Enter one of the following operations: * - + /?:");
String operatorString= myScanner.next();
switch(operatorString){
case "*": System.out.println("a*b="+ (a*b));
break;
case "-": System.out.println("a-b="+ (a-b));
break;
case "+": System.out.println("a+b="+ (a+b));
break;    
case "/": System.out.println("a/b="+ (a/b));
break;    
default : System.out.println("Illegal operator");
break;    
}
System.out.println("Y/N?:");
String Y=myScanner.next();
if(Y.equals("N")||Y.equals("n")){
    break;
}
}
}
}
