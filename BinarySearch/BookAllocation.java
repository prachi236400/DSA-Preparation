package BinarySearch;
import java.util.*;
public class BookAllocation {
    public static int minPages(int[] arr,int m){
        int low=Arrays.stream(arr).min().getAsInt();
        int high=Arrays.stream(arr).sum();
        
        while(low<=high){
            int stu=0;
            int count=1;
            int mid=(low+high)/2;
            
            for(int i=0;i<arr.length;i++){
                if(stu+arr[i]<=mid){
                    stu=stu+arr[i];
                }
                else{
                    count++;
                    stu=arr[i];
                }
            }
            if(count>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr={12,34,67,90};
        int m=2;
        int res=minPages(arr,m);
        System.out.println(res);

    }
}
