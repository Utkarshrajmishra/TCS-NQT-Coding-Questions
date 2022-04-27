import java.util.*;

class MergeSortClass {

       void mergeSort(int arr[], int l, int r) {
              if (l < r) {
                     int mid = (l + r) / 2;
                     mergeSort(arr, l, mid); 
                     mergeSort(arr, mid + 1, r); 
                     merge(arr, l, mid, r); 
              }
       }

       void merge(int arr[], int l, int mid, int r) {
              int i = l; 
              int j = mid + 1; 
              int f = l; 
              int temp[] = new int[100000]; 

         
              while (i <= mid && j <= r) {
                     if (arr[i] < arr[j]) {
                            temp[f] = arr[i];
                            i++;
                     } else {
                            temp[f] = arr[j];
                            j++;
                     }
                     f++;
              }

              if (i > mid) {
                     while (j <= r) {
                            temp[f] = arr[j];
                            f++;
                            j++;
                     }
              } else {
                  
                     while (i <= mid) {
                            temp[f] = arr[i];
                            f++;
                            i++;
                     }
              }

             
              for (f = l; f <= r; f++) {
                     arr[f] = temp[f];
              }
       }
}

class Solution {

       public static void main(String args[]) {
              Scanner sc = new Scanner(System.in);
              int n = 7;
              int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
              System.out.println("Before sorting array: ");
              for (int i = 0; i < n; i++) {
                     System.out.print(arr[i] + " ");
              }
              System.out.println();
              MergeSortClass obj = new MergeSortClass();
              obj.mergeSort(arr, 0, n - 1);
              System.out.println("After sorting array: ");
              for (int i = 0; i < n; i++) {
                     System.out.print(arr[i] + " ");
              }
       }
}
