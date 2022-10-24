import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int H = Integer.parseInt(st.nextToken());
        int[][] map = new int[H][N];

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(i % 2 == 0 ){
                for (int even = H - tmp; even < H; even++) {
                    map[even][i] = 1;
                }
            } else{
                for (int odd = 0; odd < tmp; odd++) {
                    map[odd][i] = 1;
                }
            }
        }
        for(int i = 0; i<H; i++){
            System.out.println(Arrays.toString(map[i]));
        }

    }
}
