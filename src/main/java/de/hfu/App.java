package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter a message: ");

	    String message = sc.nextLine().toUpperCase();  
	    System.out.println("Your message: \n" + message);
    }
}
