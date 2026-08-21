class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }//problem is solved in Ologn t.complexiity
        int num=0;
        int left=1;
        int right=x/2;
        while(left<=right){
            //formula to find the mid value by preventing the 
            // integer overflow
            int mid=left+(right-left)/2;
            if(mid<=x/mid){
                num=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return num;
    }
}