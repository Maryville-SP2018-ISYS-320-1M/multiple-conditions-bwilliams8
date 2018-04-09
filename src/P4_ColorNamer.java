/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/8/2018
*/
import java.util.Scanner;
public class P4_ColorNamer {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What color should be named?");
		String colorLetter = console.nextLine();
		String chosenColor = null;
		
		if (colorLetter.equals("r")) {
			chosenColor = "Red";
		} else if (colorLetter.equals("g")) {
			chosenColor = "Green";
		} else if (colorLetter.equals("b")) {
			chosenColor = "Blue";
		} else {
			System.out.print("Error: I don't know what a " + colorLetter + " is.");
		}
		if (chosenColor != null) {
			System.out.print("The name is " + chosenColor + ".");
		}
	}

}
