package BinarySearch;


public class CoutnOccu {
    public static int firstOcc(int[] arr,int n,int k){
        if(n==0) return -1;
        int low=0;
        int ans=-1;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;

    }
    public static int lastOcc(int[] arr,int n ,int k){
        if(n==0)return -1;
        int low=0;
        int high=n-1;
        int ans1=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                ans1=mid;
                low=mid+1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans1;
    }
    public static int finalOcc(int[] arr,int n,int k){
        int first=firstOcc(arr,n,k);
        int second=lastOcc(arr,n,k);
        if(first==-1) return 0;
        return (second-first)+1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,3,3,3,3,4,};
        int n=arr.length;
        int k=3;
        int res=finalOcc(arr,n,k);
        System.out.print(res);

    }
}
