class Solution {
    public int dayOfYear(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7))-1;
        int day=Integer.parseInt(date.substring(8));
        while(month>0){
            day+=days(month,year);
            month--;
        }
        return day;
    }
    public int days(int month,int year){
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            return 31;
        }else if(month==4||month==6||month==9||month==11){
            return 30;
        }else if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return 29;
        }
        return 28;
        
    }
}