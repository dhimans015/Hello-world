package assignment;

public class Power {
	int num1,num2;
	public int powerInt(int num1,int num2) {
		return (int) Math.pow(num1,num2); 
	}
	public double powerdouble(double n1,int n2) {
		return  Math.pow(num1,num2); 
	}
	public static void main(String[] args) {
		Power a= new Power();
		System.out.println(a.powerdouble(2.0,2));
		System.out.println(a.powerInt(2,2));
		
	}

}
