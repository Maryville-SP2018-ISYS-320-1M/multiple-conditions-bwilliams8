/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/8/2018
*/
import java.util.Scanner;
public class P6_Quadrant {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input an X and Y Coordinate. \nX = ");
		int x = console.nextInt();
		System.out.print("Y = ");
		int y = console.nextInt();
		
		int quadrant = quadrant(x, y);
		
		System.out.print("Your coordinates are in quadrant " + quadrant + ".");
	}
	
	public static int quadrant(int x, int y) {
		if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else if (x > 0 && y < 0) {
			return 4;
		} else {
			return 0;
	}

	}
}
