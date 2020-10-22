import java.util.Scanner;
public class Rational
{
	/**
	*The Numerator part of Rational
	*/

	private int numerator;

	/**
	* The Denominator part of Rational
	*/

	private int denominator;

	/**
	* create and initialize a new Rational object
	*/

	public Rational(int numerator,int denominator){
		if(denominator==0){
			throw new RuntimeException("Denominator is Zero");
		}
		int g=gcd(numerator,denominator);
		if(g==1){
			System.out.println("No Common Division for Numerator and Denominator");
			this.numerator=numerator;
			this.denominator=denominator;
		}
		else{
			this.numerator=numerator/g;
			this.denominator=denominator/g;
		}
		
	}
	
	/**
	* return String representation of (this)
	*/
	
	public String toString(){
		return "("+numerator+"/"+denominator+")";
	}

	/**
	*
	*@param m
	*@param n
	*return Greatest common divisor for m and n
	*/
	private static int gcd(int m,int n){
		if(0==n){
			return m;
		}
		else{
			return gcd(n,m%n);
		}
	}


	/***************************************************************************
	**
	 *Test client 

	*****************************************************************************
	**/
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator :");
		int numerator=sc.nextInt();
		System.out.println("Enter Denominator");
		int denominator=sc.nextInt();
		Rational rational=new Rational(numerator,denominator);
		System.out.println("Efficient Representation for the rational number:"+rational);
	}
}
	
			
	
	
