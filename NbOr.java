package lab10_simulation;

import java.util.ArrayList;

public class NbOr {

	public static double Resoudre(ArrayList<Double> f,double a1,double b1)
	{
		double x=0;
		double a=a1;
		double b=b1;
	//	System.out.println("a ="+a + " b= "+b);
		while((b-a)>0.001)
		{
			double l=(double) (0.618*(b-a));
			double x1=b-l;
			double x2=a+l;
			
			double fx1=Solution(x1,f),fx2=Solution(x2,f);
			if(fx1<fx2)
				a=x1;
			if(fx2<fx1)
				b=x2;
			if(fx1==fx2)
			{
				a=x1;
				b=x2;
			}
			
		//	System.out.println("a ="+a + " b= "+b);
	
		}
		x=(a+b)/2;
		return x;
	}
	
	public static double Solution(double x,ArrayList<Double> poly)
	{
		double solution=0.0;
		for(int i=0;i<poly.size();i++)
		{
			solution+=poly.get(i)*Math.pow(x,i);
		}
		return solution;
	}
}
