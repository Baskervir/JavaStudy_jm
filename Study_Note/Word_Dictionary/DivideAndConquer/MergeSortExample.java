import java.util.Arrays;

public class MergeSortExample {

    // 병합 정렬 메소드
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // 배열의 크기가 1보다 작으면 정렬할 필요 없음
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // 재귀적으로 왼쪽과 오른쪽 배열을 정렬
        mergeSort(left);
        mergeSort(right);

        // 정렬된 배열을 병합
        merge(array, left, right);
    }

    // 배열을 병합하는 메소드
    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // 왼쪽과 오른쪽 배열을 비교하면서 정렬된 결과를 result에 저장
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // 왼쪽 배열의 나머지 요소를 추가
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // 오른쪽 배열의 나머지 요소를 추가
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Original array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}