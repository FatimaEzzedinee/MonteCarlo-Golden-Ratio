package lab10_simulation;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class monte_carlo_PI {
	
	public static void Resoudre_Pi()
	{
		int counter=0;
		Random r=new Random();
		double x=0;
		double y=0;
		int nbIn=0;
		int nbOut=0;
		try {
			DataOutputStream fin =new DataOutputStream(new FileOutputStream("Fin.txt"));
			DataOutputStream fout =new DataOutputStream(new FileOutputStream("Fout.txt"));
					while(counter < 1024)
						{
							x=r.nextDouble();
							y=r.nextDouble();
							if((x*x + y*y)<=1)
							{
								fin.writeBytes(x+"\t"+y+"\n");
								nbIn++;
							}
							else {
								fout.writeBytes(x+"\t"+y+"\n");
								nbOut++;
							}
							counter++;
						}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin "+nbIn + " Fout "+nbOut);
		System.out.println("PI = "+(4*(double)nbIn/1024));
	}

	 
	 
	 
}
