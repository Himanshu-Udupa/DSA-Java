class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int maxElement=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maxElement){
                count++;
            }
            else{
                count--;
                if(count<0){
                    maxElement=nums[i];
                    count=1;
                }
            }
        }
        return maxElement;
    }
}
