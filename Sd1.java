package rushithaa;


import java.util.Scanner;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
/**
 * 
 * @author rushitha
 * @version 0.1
 * since 09-06-2022
 * 
 *This is a Standard Deviation program that finds the SD of random variables using math libraries
 *It takes random numbers as input and gives Sd as output
 */
public class Sd1 {


	 public double runsts(double[] nums)
	 {		 
		    
		    DescriptiveStatistics stats = new DescriptiveStatistics();
		    for (int j = 0; j< nums.length; j++) 
		    {
		        stats.addValue(nums[j]);
		    }
		  System.out.println("SD:" + stats.getStandardDeviation());
			double gmm = stats.getStandardDeviation();
		return gmm;
		
		} 
public static void main(String args[])
	 {
	 Sd1 st = new Sd1();
	 
	 	double[] nums = new double[8];
	 	Scanner sc=new Scanner(System.in);   
	 	
		System.out.println("Enter the Varibles: "); 
	 
	    for (int k=0; k<nums.length; k++)
	    {
	        nums[k] = sc.nextInt();
	    } 
	 st.runsts(nums);
}
	
	
}
