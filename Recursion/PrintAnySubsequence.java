package Recursion;
import java.util.*;
public class PrintAnySubsequence {
    public static List<List<Integer>> anySubsequence(int[] arr, int target){
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtrack(arr,0,curr,0,res,target);
        return res;
    }
    public static boolean backtrack(int[] arr,int ind, List<Integer> curr,int sum , List<List<Integer>> res,int target){
        if(ind==arr.length){
            if(sum==target){
                res.add(new ArrayList<>(curr));
                return true;
            }
            return false;
        }
        curr.add(arr[ind]);
        sum=sum+arr[ind];
        if(backtrack(arr,ind+1,curr,sum,res,target)) return true;
        curr.remove(curr.size()-1);
        sum=sum-arr[ind];
        if(backtrack(arr,ind+1,curr,sum,res,target)) return true;

        return false;

    }

    public static void main(String[] args) {
        int[] arr={2,4,1,4,5,6};
        int target=6;
        System.out.println(anySubsequence(arr,target));
    }
    
}
