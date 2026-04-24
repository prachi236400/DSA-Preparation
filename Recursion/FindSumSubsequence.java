package Recursion;
import java.util.*;
class FindSumSubsequence{
    public static List<List<Integer>> countSubsequence(int[] arr,int target){
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtrack(arr,0,curr,0,res,target);
        return res;

    }
    public static void backtrack(int[] arr, int ind,List<Integer> curr, int sum, List<List<Integer>> res, int target){
        if(ind==arr.length){
            if(sum==target){
                res.add(new ArrayList<> (curr));

            }
            return;
        }
        curr.add(arr[ind]);
        sum=sum+arr[ind];
        backtrack(arr,ind+1,curr,sum,res,target);
        curr.remove(curr.size()-1);
        sum=sum-arr[ind];
        backtrack(arr,ind+1,curr,sum,res,target);
    }
    public static void main(String[] args){
        int[] arr={2,4,1,5,3};
        int target=6;
        System.out.println(countSubsequence(arr,target));
        


    }
}