import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		if (x1==x2) {
			System.out.println(x3);
		}
		else if (x1==x3) {
			System.out.println(x2);
		}
		else {
			System.out.println(x1);
		}
		if (y1==y2) {
			System.out.println(y3);
		}
		else if (y2==y3) {
			System.out.println(y1);
		}
		else {
			System.out.println(y2);
		}
		
			
	}
		
}
