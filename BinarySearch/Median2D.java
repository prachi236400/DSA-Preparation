package BinarySearch;
public class Median2D{
    public static int findMedian(int[][] mat){
         int r=mat.length;
        int c=mat[0].length;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        
        for(int i=0;i<r;i++){
            low=Math.min(low, mat[i][0]);
            high=Math.max(high,mat[i][c-1]);
        }
        int desired=(r*c+1)/2;
        while(low<high){
            int mid=(low+high)/2;
            
            int count=0;
            for(int i=0;i<r;i++){
                int l=0;
                int h=c-1;
                while(l<=h){
                    int m=(l+h)/2;
                    if(mat[i][m]<=mid){
                        l=m+1;
                        
                    }
                    else{
                        h=m-1;
                    }
                }
                count=count+l;
            }
            
            
            if(count<desired){
                low=mid+1;
                
            }
            else{
                high=mid;
            }
            
            
        }
        return low;
    
    }
    public static void main(String[] args){
        int[][] mat={{1,5,7,9,11},{2,3,4,5,10},{9,10,12,14,16}};
        int res=findMedian(mat);
        System.out.println(res);
    }
}