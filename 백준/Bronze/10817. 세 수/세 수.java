import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int med = 0;
		if(a>=b) {
			if(b>=c) {
				med = b;
			}else if(a>=c) {
				med = c;
			}else {
				med = a;
			}
		}else if(a>c) {
			med = a;
		}else if(b>c) {
			med = c;			
		}else {
			med = b;
		}
		System.out.println(med);
	}
}