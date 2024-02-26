class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max2=max1;
                max1=max;
                max=num;
            }
            else if(num<max&&num>max1){
                max2=max1;
                max1=num;
            }
            else if(num<max1&&num>max2)
                max2=num;
        }
        int result=(max2==Long.MIN_VALUE)?(int)max:(int)max2;
        return result;
    }
}
