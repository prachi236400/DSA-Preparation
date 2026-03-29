package BinarySearch;
public class rowWithMax1 {
    public static int lowerBound(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;

            }
        }
        return ans;

    }
    public static int findRow(int[][] arr,int r,int c){
        int count_max=0;
        int count_ones=-1;
        int index=-1;
        for(int i=0;i<r;i++){
            count_ones=c-lowerBound(arr[i],1);
            if(count_ones>count_max){
                count_max=count_ones;
                index=i;
            }

        }
        return index;
    }
    public static void main(String[] args){
        int[][] arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
        int r=5;
        int c=5;
        int res=findRow(arr,r,c);
        System.out.println(res);

    }
    
}
