package Ejemplos;

import java.util.Arrays;

public class ComplejidadLogaritmicaN {

   public void metodoNLogN() {
        int[] datos = {9, 4, 8, 3, 1, 2, 5, 7, 6};

        mergeSort(datos, 0, datos.length - 1);

        System.out.println(Arrays.toString(datos));
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }
}