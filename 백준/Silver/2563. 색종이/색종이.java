import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer = 0;

        boolean[][] check = new boolean[101][101];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=y;j<y+10;j++){
                for(int s = x;s<x+10;s++)
                    check[j][s] = true;
            }
        }

        for(int i=1;i<101;i++){
            for(int j=1;j<101;j++)
                if(check[i][j])
                    answer++;
        }
        bw.write(answer + "");
        bw.flush();	
        bw.close();
        br.close();
    }
}