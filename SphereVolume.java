/*
 * Author: Jonathan Yang
 * Lab 2a
 */

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double diam, r, volume;
		
		System.out.println("This program will find the volume of a sphere.");
		System.out.print("Enter diameter of a sphere: ");
		diam = in.nextDouble();
		r = diam/2;
		
		volume = (4.0/3)*Math.PI*Math.pow(r, 3);
		System.out.println(volume);
		in.close();
	}

}
