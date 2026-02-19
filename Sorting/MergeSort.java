package Sorting;
import java.util.*;
public class MergeSort {
    public static void mergeSorting(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergeSorting(arr,low,mid);
        mergeSorting(arr,mid+1,high);
        
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> lst=new ArrayList<>();
        while(left<=mid&& right<=high){
            if(arr[left]<=arr[right]){
                lst.add(arr[left++]);
                


            }else{
                lst.add(arr[right++]);
                
            }
        }
        
        while(left<=mid){
            lst.add(arr[left++]);
           
        }
        while(right<=high){
            lst.add(arr[right++]);
            
        }
    
        for(int i=low;i<=high;i++){
            arr[i]=lst.get(i-low);
            //System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4,1,5,2,6,4};
       
        mergeSorting(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");

        }
        
        
    }
}

    

