class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0,a=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=val){
            nums[a]=nums[i];
            a++;
            }
        }
       return a;
    }
}