package Step4;
//******나머지가 서로 다른 갯수 -- HashSet을 사용하면 더 간편(중복값 허용 안함)*************************************************

import java.util.Scanner;

public class Step4_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];
        int count=0;

        for(int i=0; i<10; i++) {
            arr[i] = scan.nextInt() % 42;
        }

        for(int i=0; i<10; i++){//10개의 중복된 값이 있는지 확인한다
            int temp =0;
            for(int j=i+1;j<10;j++){//i와 j(i+1)를 비교하여 같으면 temp를 증가시킴
                if(arr[i]==arr[j]){
                    temp++;
                }
            }
            if (temp==0) {//i와j가 값이 같지 않은 경우 count를 더해준다
                count++;
            }
        }

        System.out.println(count);
    }
}
/*
HashSet은 자바 Collection중 Set의 파생클래스이다
set을 집합이라고 생각하면 되는데,HashSet의 경우 몇가지 특징이 있다.

1.중복되는 원소를 넣을 경우 하나만 저장한다.즉,중복원소를 허용하지 않는다!!!!!!!!!!!!!
2.HashSet은 순서 개념이 없다.따라서 Collections.sort()메소드를 사용할 수 없다. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야함


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();//값을 넣을때 만약 중복되는 값이 없으면 HashSet에 저장되면서 true 반환,
		                                              만약 중복되어 저장되지 않으면 False를 반환한다

		for (int i = 0; i < 10; i++) {
			h.add(scan.nextInt() % 42);//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}

		in.close();
		System.out.print(h.size());//HashSet.size()는 HashSet의 크기(=저장되어 있는 원소의 개수)를 반환
	}
}
 */