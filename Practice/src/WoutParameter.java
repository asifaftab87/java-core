class Sample
{
       private double num1,num2;
		
		Sample(double x,double y)
		{
			num1=x;
			num2=y;
		}
		
		void add()
		{	
			double res = num1+num2;
			System.out.println("the sum is:" +res);
		}
}
public class WoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample S = new Sample(25,25.23);
		S.add();
	}

}
