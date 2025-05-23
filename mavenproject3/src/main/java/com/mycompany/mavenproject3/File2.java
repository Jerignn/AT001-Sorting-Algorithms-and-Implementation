package com.mycompany.mavenproject3;

public class File2 {

    public static void main(String[] args) {
        String[] names = {
            "Lucas", "Emma", "Abigail", "Joshua", "Owen", "Tristan", "Victor", "Sophia", "Caleb", "Gabriel",
            "Kevin", "Nathan", "Isaac", "Charlotte", "Samuel", "Thomas", "Penelope", "Patrick", "Grace",
            "Yasmine", "Madison", "Alexander", "William", "Matthew", "Leah", "Daniel", "Benjamin", "Zoe",
            "Jacob", "Rachel", "Elijah", "Uriel", "Diana", "Jasmine", "Noah", "Steven", "Katherine", "Mia",
            "Sarah", "Vanessa", "Aaron", "Alice", "Isabella", "Quentin", "Zachary", "Brianna", "Xander",
            "Liam", "Olivia"
        };

        
        System.out.println("Orignal sort: ");
        printArray(names); 
        
        // Make copies of the original array for each sort
        String[] namesForMergeSort = names.clone();
        String[] namesForQuickSort = names.clone();

        // Merge Sort        
        mergeSort(namesForMergeSort, 0, namesForMergeSort.length - 1);
        
        
        System.out.println("----------------------------------------------");
        System.out.println("\nMerge Sort:");
        printArray(namesForMergeSort);

        // Quick Sort        
        quickSort(namesForQuickSort, 0, namesForQuickSort.length - 1);
        
        System.out.println("----------------------------------------------");
        System.out.println("\nQuick Sort:");
        printArray(namesForQuickSort);
    }

    // Merge Sort Method
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Quick Sort Method
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //method to print array
    public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.println(name + " ");
        }
        System.out.println();
    }
}