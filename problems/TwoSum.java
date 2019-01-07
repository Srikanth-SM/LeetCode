public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] a=new int[2];
        int old=target;
        for(int i=0;i<nums.length-1;i++){
            target=old;
           a[0]=i;
           target=target-nums[i];
           for(int j=i+1;j<nums.length;j++){
               if(target==nums[j]){
                   a[1]=j;
                   return a;
               }
           }
        }
        return a;
    }
}
