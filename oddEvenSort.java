package hw04;

public class oddEvenSort {

    public static void main(String[] args) {
        int[] A = {6, 5, 4, 3, 2, 1};
        int n = A.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = A[i];
            for (int j = 0; j < n; j = j + 2) {
                if (A[j + 1] < A[j]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                } else {
                    break;
                }
            }
            for (int k = 1; k < n - 1; k = k + 2) {
                if (A[k] > A[k + 1]) {
                    temp = A[k];
                    A[k] = A[k + 1];
                    A[k + 1] = temp;
                } else {
                    break;
                }
            }

        }
        for (int r = 0; r < n; r++) {
            System.out.println(A[r]);
        }
    }

}
