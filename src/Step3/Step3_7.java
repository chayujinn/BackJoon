package Step3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
public class Step3_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = a + b;
            System.out.println("Case #" + i + ": " + result);
    }
  }
}
*/

public class Step3_7{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        for(int i=1; i<=N; i++){
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

            bw.write("Case #"+ i + ": "+(a+b)+"\n");

        }
        bw.flush();
    }
}