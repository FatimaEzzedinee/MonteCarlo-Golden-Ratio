package lab10_simulation;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import lab11.NbOr;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<Double> f=new ArrayList<Double>();
		f.add(1.0);
		f.add(0.0);
		f.add(-1.0);	
		Surface.Resoudre_Monte_Carlo(f,-1.0,0.5);
		double s=NbOr.Resoudre(f,-1.0,0.5);
		System.out.println("AA="+Math.abs(-1.5)*NbOr.Solution(s, f));
	}

}
