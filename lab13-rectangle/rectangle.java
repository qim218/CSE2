public class rectangle {
	double width; 
	double height;
	public void setWidth(double a){ 
		width=a; 
	}
	public void setHeight(double b){
		height=b;
	}
	public double getArea(){
		return width* height;
	}
	public static void main(String[] args){
		rectangle r1 = new rectangle(); 
		r1.setWidth(5.3); 
		r1.setHeight(7.3);
		System.out.println(r1.getArea()); 
	}
}