package Chapter7;
// 선형 탐색

import java.util.Scanner;

/**
 * 배열 a로부터 key와 같은 값을가지는 요소를 탐색하는 linearSearch 메서드와 linearSearchR 메서드를 작성
 * 단, 키와 같은 값을 가지는 요소가 여러 개인 경우 linearSearch는 가장 앞에 위치한 요소를 찾는다
 * linearSearchR은 가장 뒤에 위치한 요소를 찾는다
 * **/
public class LinearSearch {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearchR(int[] a, int key) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값 : ");
        int key = stdIn.nextInt();

        int idxFitst = linearSearch(x, key);
        int idxLast = linearSearchR(x, key);

        if (idxFitst == -1) {
            System.out.println("해당 값은 존재하지 않습니다.");
        } else if (idxFitst == idxLast) {
            System.out.println("해당 값은 x[" + idxFitst + "]에 있습니다.");
        } else {
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
            System.out.println("가장 앞에 위치한 값은 x[" + idxFitst + "]에 있습니다.");
            System.out.println("가장 뒤에 위치한 값은 x[" + idxLast + "]에 있습니다.");
        }
    }
}

/**
 * 선형 탐색(linear search)
 * 데이터 집합에서 특정 값을 지닌 요소를 찾는 것 : 탐색 (Search)
 * 찾을 값 : 키 (Key)
 * 배열 사용 시 모든 요소를 순서대로 순회 -> 구현
 * 찾을 키 값과 동일한 값을 지니는 요소를 만나면 -> 탐색 성공 : 선형 탐색 or 순차 탐색
 * **/