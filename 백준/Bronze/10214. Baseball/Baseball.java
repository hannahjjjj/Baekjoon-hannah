import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int [] korea = new int [9];
		int [] yonsei = new int [9];
		for(int i=0; i<num; i++) {
			int k = 0;
			int y = 0;
			for(int j=0; j<9; j++) {
				yonsei[j] = scan.nextInt();
				y += yonsei[j];
				korea[j]=scan.nextInt();
				k += korea[j];
			}
			if(k>y) 
				System.out.println("Korea");
			else if(k<y) 
				System.out.println("Yonsei");
			else 
				System.out.println("Draw");
			
		}
		scan.close();
	}
}