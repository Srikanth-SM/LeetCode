class MaxSumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        
        int maxsum=0;
        if(nums.length>0)maxsum=nums[0];
        for(int num:nums){
            if(sum+num<num){
                sum = num;
            }
            else{
                sum+=num;
            }
            if(sum>maxsum){
                maxsum=sum;
            }
           
        }
         return maxsum;
    }
}
