package BinarySearch;
public class SingleElement{
    public static int findSingle(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if((mid%2==0  && arr[mid]==arr[mid+1] )|| (mid%2!=0 && arr[mid] ==arr[mid-1])){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,4,5,5};
        int res=findSingle(arr);
        System.out.println(res);
    }
}