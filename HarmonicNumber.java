package com.bridgelabz.HarmonicNumber;

import java.util.Scanner;

public class HarmonicNumber {
	private double sumOfSeries;
	private double initialValue;
	//to store nth harmonic value i.e.initialValue/nthHarmonicNumber
	private double nthHarmonicValue;
	//to store the end point of harmonic series
	private double nthHarmonicNumber;

	public void setSumOfSeries() {
		this.sumOfSeries=0.0;
	}
	public void setInitialValue() {
		this.initialValue=1.0;
	}
	public void setNthHarmonicNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value upto which harmonic value must be calculated");
		this.nthHarmonicNumber = sc.nextDouble();

	}

	public double getSumOfSeries() {
		return this.sumOfSeries;
	}
	public double getInitialValue() {
		return this.initialValue;
	}
	public double getNthHarmonicNumber() {
		return this.nthHarmonicNumber;
	}
	public void calcNthHarmonicValue() {
		for(double i = 1; i<= this.getNthHarmonicNumber(); i++) {
			this.nthHarmonicValue= this.initialValue/i;
			this.sumOfSeries = this.sumOfSeries + (this.initialValue/i);
			System.out.println("Harmonic value in " +i +"st iteration : "+ this.nthHarmonicValue);
		}
		System.out.println("Nth harmonic value is : "+ this.nthHarmonicValue + " \n Sum of harmonic series is : "+ this.sumOfSeries);
	}

}
