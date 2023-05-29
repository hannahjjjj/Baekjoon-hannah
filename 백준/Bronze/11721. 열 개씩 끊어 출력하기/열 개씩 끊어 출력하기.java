import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		for(int i=0; i<N.length(); i++) {
			System.out.print(N.charAt(i));
			if(i % 10 ==9) {
				System.out.println();
			}
		}
	}
}