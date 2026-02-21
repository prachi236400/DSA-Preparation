package Sorting;

public class binarySearch {
    public static int bs(int[] arr,int low,int high,int target){
        if(low>high){
            return -1;

        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return bs(arr,low,mid-1,target);

        }
        else{
            return bs(arr,mid+1,high,target);

        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        int result=bs(arr,0,arr.length-1,target);
        System.out.println("Element found at index: "+result);
        
    }
    
}

