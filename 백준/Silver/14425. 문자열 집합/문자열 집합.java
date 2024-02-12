import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =Integer.parseInt(st.nextToken()); //집합 S의 개수
        int M =Integer.parseInt(st.nextToken()); //비교할 대상의 문자열 개수

        Set<String> array = new HashSet<>();

        for(int i = 0; i < N; i++) {
            array.add(br.readLine()); 
        }
        
        int count = 0; 
        
        for(int i = 0; i < M; i++) {
            String str = br.readLine();

            if(array.contains(str)) { 
                count++; 
            }
        }
        br.close();
        
        System.out.println(count);
    }
}
