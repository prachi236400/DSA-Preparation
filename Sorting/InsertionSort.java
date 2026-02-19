package Sorting;

public class InsertionSort {
    public static void insertionSorting(int[] arr ,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={6,8,9,13,12,14,15,5};
        int n=arr.length;
        insertionSorting(arr,n);

    }
}
    


