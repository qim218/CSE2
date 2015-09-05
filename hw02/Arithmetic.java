public class Arithmetic {
// main method required for every Java program 

public static void main(String[] args) {
//Number of pairs of socks
double totalcostbeforetaxS;
double totalcostbeforetaxG;
double totalcostbeforetaxE;
double totalcostaftertaxS;
double totalcostaftertaxG;
double totalcostaftertaxE;
double totalcostbeforetax;
double totalcostaftertax;
double saletaxfortotal;
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;
//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;
totalcostbeforetaxS=nSocks*sockCost$;
totalcostbeforetaxG=nGlasses*glassCost$;
totalcostbeforetaxE=nEnvelopes*envelopeCost$;
totalcostaftertaxS=nSocks*sockCost$*taxPercent+totalcostbeforetaxS;
totalcostaftertaxG=nGlasses*glassCost$*taxPercent+totalcostbeforetaxG;
totalcostaftertaxE=nEnvelopes*envelopeCost$*taxPercent+totalcostbeforetaxE;
totalcostbeforetax=totalcostbeforetaxS+totalcostbeforetaxG+totalcostbeforetaxE;
totalcostaftertax=totalcostaftertaxS+totalcostaftertaxG+totalcostaftertaxE;
saletaxfortotal=totalcostbeforetax*taxPercent;
}
}