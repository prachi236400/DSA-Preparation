package BinarySearch;
public class NthRoot {
    public  static int findNthRoot(int n,int m){
        int low=0;
        int high=m;
        
        while(low<=high){
            int mid=(low+high)/2;
            int ans=1;
            for(int i=0;i<n;i++){
                ans=ans*mid;
                if(ans>m){
                    break;
                }
            }
            if(ans==m) return mid;
                
            if(ans<m) low=mid+1;
                
            else high=mid-1;
                

        }

        return -1;
        
    }
    public static void main(String[] args){
        int n=3;
        int m=27;
        int res=findNthRoot(n,m);
        System.out.println(res);
    }
    
}
