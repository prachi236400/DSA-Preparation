package BinarySearch;

public class TimesSorted {
    public static int sortTime(int[] arr){
        int n=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }

        }
        return low;
    }



    
    public static void main(String[] args){
        int[] arr ={4,5,6,7,0,1,2,3};
        int res=sortTime(arr);
        System.out.println(res);

    }
}
    

// Find out how many times the array is rotated
// Input : arr = [4,5,6,7,0,1,2,3]
// Result: 4