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
        int minPath = 0;
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < H; i++) {
            long count = Arrays.stream(map[i]).filter(s -> s == 1).count();
            if(count<min){
                min = count;
                minPath = 1;
            } else if (count == min) minPath++;
        }
        System.out.println(min + " " + minPath);
    }
}
