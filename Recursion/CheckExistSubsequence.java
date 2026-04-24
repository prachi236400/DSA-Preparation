package Recursion;
import java.util.*;
public class CheckExistSubsequence {
    public static boolean checkSubsequence(int[] arr,int target){
        if(backtrack(arr,0,0,target)){
            return true;
        }
        return false;
    }
    public static boolean backtrack(int[] arr,int ind, int sum,int target){
        if(ind== arr.length){
            if(sum==target){
                return true;
            }
            return false;
        }
        sum=sum+arr[ind];
        if(backtrack(arr,ind+1,sum,target)) return true;
        sum=sum-arr[ind];
        if(backtrack(arr,ind+1,sum,target)) return true;
        return false;

    }
    public static void main(String[] args) {
        int[] arr={2,1,3,5,4,6};
        int target=21;
        System.out.println(checkSubsequence(arr,target));

    }
    
}
