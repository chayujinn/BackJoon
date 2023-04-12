package Step5;
//다이얼 전화를 걸기 위해서 필요한 최소 시간

import java.util.Scanner;

public class Step5_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num=0;

        for(int i=0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'A': case 'B': case 'C':
                num += 3;
                break;
                case 'D': case 'E': case 'F':
                    num += 4;
                    break;
                case 'G': case 'H': case 'I':
                    num += 5;
                    break;
                case 'J': case 'K': case 'L':
                    num += 6;
                    break;
                case 'M': case 'N': case 'O':
                    num += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    num += 8;
                    break;
                case 'T': case 'U': case 'V':
                    num += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    num += 10;
                    break;


            }
        }
        System.out.println(num);

    }
}
