package com.example.untitled;

public class lab6 {
    private static int sravnenie = 1;

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 2};

        System.out.println("Исходный массив:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nОтсортированный массив:");
        printArray(array);

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                System.out.println("Сравнение номер "+sravnenie);
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                sravnenie ++;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
