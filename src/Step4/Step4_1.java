package Step4;

import java.util.Scanner;

public class Step4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int [] array = new int[N];
        int cnt = 0;

        for(int i=0;i<N;i++){
            array[i] = scan.nextInt();
        }
        int v = scan.nextInt();

        for(int j=0; j<N;j++){
            if(array[j] == v)
                cnt++;

        }
        System.out.println(cnt);
    }
}
