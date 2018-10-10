class Sam
{
	private double num1,num2;
	
	Sam(double x,double y)
	{
		num1=x;
		num2=y;
	}
	
	double sum()
	{
		return (num1+num2);
	}
}
public class WithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Sam S = new Sam(25.23,25);
		double x=S.sum();
		System.out.println(x);
	}

}
