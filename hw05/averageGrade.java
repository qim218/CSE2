import java.util.Scanner;
public class averageGrade{
public static void main(String[] args) {
Scanner myScanner=new Scanner(System.in);
int count=0;
int totalgrade=0;
while(true){
    System.out.print("Enter the grade:");
    int grade=myScanner.nextInt( );
count=count+1;
totalgrade=totalgrade+grade;
if((grade<0)||(grade>100)){
    System.out.println("an invalid grade");
}
if(grade==999){
double averageGrade;
averageGrade=(totalgrade-999)/count;
    System.out.println("averageGrade is" + averageGrade);
    break;
}
}
}
}
