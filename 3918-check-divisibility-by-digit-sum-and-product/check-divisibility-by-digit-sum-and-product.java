class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int mul=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            mul*=digit;
            n=n/10;
        }
        int num=sum+mul;
        if(original%num==0){
            return true;
        }
        return false;
    }
}