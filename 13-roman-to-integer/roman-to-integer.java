class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&value(s.charAt(i))<value(s.charAt(i+1))){
                num-=value(s.charAt(i));
            }else{
                num+=value(s.charAt(i));
            }
        }

        return num;
        
    }
    public int value(char ch){
        if(ch=='M') 
            return 1000;
        if(ch=='D') 
            return 500;
        if(ch=='C') 
            return 100;
        if(ch=='L') 
            return 50;
        if(ch=='X') 
            return 10;
        if(ch=='V') 
            return 5;
        
        return 1;

    }
}