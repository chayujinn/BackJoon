package Step4;

import java.util.Scanner;

//개수 세기
public class Step4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] array = new int[N];

        for(int i=0;i<N;i++){
            array[i]=scan.nextInt();
        }

        int M = scan.nextInt();
        int cnt = 0;
        for(int j=0; j<N; j++){
            if(array[j]==M){
                cnt++;

            }
        }
        System.out.println(cnt);
    }
}
