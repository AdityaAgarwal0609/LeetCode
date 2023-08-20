class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        int a[]= new int[2];
        while(i<nums.length)
          {
              for(j=i+1;j<nums.length;j++)
              if(nums[i]+nums[j]==target)
                 {
                    a[0]=i;
                    a[1]=j;
                    
                 }

              i++;
          }
          return a;
        
    }
}