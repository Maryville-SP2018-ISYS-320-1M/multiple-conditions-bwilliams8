import java.util.Scanner;

/*
ISYS 320
Name(s):Brian Williams
Date: 4/8/2018
*/

/*  What was the error?
 name == "blue" is not correct, and functions correctly as name.equals("blue").
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if( name.equals("blue")) {
			System.out.println("Mine too!");
		}

	}

}
