class Lake
{
	static double Sum(double x,double y)
	{
		return (x+y);
	}
}
public class MethStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lake L = new Lake();
		//double ans = L.Sum(12.23,25);
		
		double ans=Lake.Sum(10.25,25);
		System.out.println(ans);
	}

}
