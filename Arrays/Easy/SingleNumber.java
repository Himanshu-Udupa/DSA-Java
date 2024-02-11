class Solution {
    public int singleNumber(int[] nums) {
        int u=0;
        for(int j:nums) u^=j;
        return u;
    }
}
