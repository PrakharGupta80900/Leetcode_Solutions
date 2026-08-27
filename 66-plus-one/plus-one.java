class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        if(digits[n]<9){
            digits[n]=digits[n]+1;
        }else{
            while(n>=0 && digits[n]==9){
                digits[n]=0;
                n--;
            }
            if(n>=0){
                digits[n]++;
            }else {
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                return arr;
            }
        }
        return digits;
    }
}