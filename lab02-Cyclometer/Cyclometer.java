public class Cyclometer {
// main method required for every Java program 

public static void main(String[] args) {
 int secsTrip1=480; //record secsTrip1     
 int secsTrip2=3220; //record secsTrip2
 int countsTrip1=1561; //record countsTrip1
 int countsTrip2=9037; //record countsTrip2
 double wheelDiameter=27; //record value of wheelDiameter
 double PI=3.14159; //record value of pi
 int feetPerMile=5280; //record value of feetPerMile
 int inchesPerFoot=12; //record value of inchesPerFoot
 int secondsPerMinute=60; //record value of secondsPerMinute
 double distanceTrip1, distanceTrip2, totalDistance;
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
distanceTrip1=countsTrip1*wheelDiameter*PI;
distanceTrip1=inchesPerFoot*feetPerMile;
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
totalDistance=distanceTrip1+distanceTrip2;
System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
System.out.println("The total distance was "+totalDistance+" miles"); 
    
 }//end of main method
}//end of class