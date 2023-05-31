import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int [] al = new int[26];
		for(int i=0; i<S.length(); i++) {
			int num = S.charAt(i)-97;
			al[num]++;
		}
		
		for(int j=0; j<26; j++) {
			System.out.print(al[j]+" ");
		}
	}
}
