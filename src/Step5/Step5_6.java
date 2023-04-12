package Step5;
//알파벳 찾기
//소문자로 이뤄진 단어의 위치
//baekjoon
//0123457
//문자 S의 문자열=인덱스번호
/*import java.util.Scanner;

public class Step5_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){//배열 -1로 초기화
            arr[i]=-1;
        }

        String str = scan.next();//S라는 문자열 주어짐

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);// 문자형 변수 ch에 문자열의 문자들을 한글자씩 저장


            if(arr[ch-'a']==-1){//arr 원소 값이 -1인 경우에만 초기화 = ch 값 주어진 것들만 초기화해라
                arr[ch-'a']=i;//ex)i=2 ch=e=101 ->ch-'a'=5 ->arr[5]=2
            }

        }
        for(int i=0; i<arr.length; i++){//배열출력
            System.out.print(arr[i]+" ");
        }
    }
}
*/

/*indexOf로 문제 풀기 인덱스 번호 표시 그외에는 -1로 표시
indexOf("찾을 특정문자","시작할 위치")*/
import java.util.Scanner;

public class Step5_6 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        for (char  c= 'a'; c<='z'; c++ ){
            System.out.print(S.indexOf(c)+" ");
        }
    }
}



