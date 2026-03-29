package BinarySearch;
import java.util.*;

public class AggressiveCows {
    public static int cowsproblem(int[] arr, int k){
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        int ans=1;
        
        while(low<=high){
            int count=1;
            int mid=(low+high)/2;
            int last=arr[0];
            for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=mid){
                count++;
                last=arr[i];


            }
        }
        if(count>=k){
            ans=mid;
            low=mid+1;
            
        }
        else high=mid-1;

    }
        return ans;
    
}
    public static void main(String[] args){
        int[] arr={0,3,4,7,10,9};
        int k=4;
        int res=cowsproblem(arr,k);
        System.out.println(res);
    }
    
}
