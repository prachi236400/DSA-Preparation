public class SquareRoot {
    public static int squareRoot(int num){
        int low=1;
        int high=num;
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=num){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;

            }
        }
        return high;
    }
    public static void main(String[] args){
        int num=54;
        int res=squareRoot(num);
        System.out.println(res);
    }
    
}
