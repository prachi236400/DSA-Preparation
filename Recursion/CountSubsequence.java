package Recursion;

public class CountSubsequence{
    public static int countSubsequence(int[] arr, int target){
        return backtrack(arr,0,0,target);
        
    }
    public static int backtrack(int[] arr, int ind, int sum, int target){
        if(ind==arr.length){
            if(sum==target){
                return 1;
            }
            else {
                return 0;

            
        }
    }
        sum=sum+arr[ind];
        int left=backtrack(arr,ind+1,sum,target);
        sum=sum-arr[ind];
        int right=backtrack(arr,ind+1,sum,target);
        return left+right;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,5,3};
        int target=6;
        System.out.println(countSubsequence(arr,target));

    }
}