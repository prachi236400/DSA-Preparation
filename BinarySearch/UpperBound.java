 package BinarySearch;

public class UpperBound {
 
 
 public static int lowBound(int[] arr,int low,int high, int target){
    int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={3,5,8,15,19,19,19,20};
        int target=7;
        int result=lowBound(arr,0,arr.length-1,target);
        System.out.println("Lower bound index: "+result);
        }
    }

    

