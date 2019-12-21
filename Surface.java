package lab10_simulation;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Surface {

	public static void Resoudre_Monte_Carlo(ArrayList<Double> polynome,double a,double b)
	{
		
		int counter=0;
		Random r=new Random();
		double x=0;
		double y=0;
		int nbIn=0;
		int nbOut=0;
		double max=NbOr.Solution(NbOr.Resoudre(polynome, a, b),polynome);

					while(counter < 1024)
						{
							x=r.nextDouble()*(b-a)+a;
						    y=r.nextDouble()*max;
							if(y<=Solution(x,polynome))
							{
								//fin.writeBytes(x+"\t"+y+"\n");
								nbIn++;
							}
							else {
								//fout.writeBytes(x+"\t"+y+"\n");
								nbOut++;
							}
							counter++;
						}
					
					System.out.println("Max ="+max);
					System.out.println("Fin "+nbIn + " Fout "+nbOut);					
					System.out.println("Solution = "+(double)((double)nbIn/1024)*max*(b-a));
	
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
