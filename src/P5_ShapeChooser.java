/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/8/2018
*/
import java.util.Scanner;
public class P5_ShapeChooser {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What shape would you like printed? (Tri / Box)");
		String shape = console.nextLine();
		if (shape.equalsIgnoreCase("box")) {
			drawBox();
		} else if (shape.equalsIgnoreCase("Tri")) {
			drawTri();
		} else {
			System.out.print("Error: Input was not for a Triangle or a Box.");
		}
		console.close();
	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
