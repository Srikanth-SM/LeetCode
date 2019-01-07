public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[]arr=s.toCharArray();
        int length=s.length();
        boolean flag[]=new boolean[256];
        int max=0;
        int i=0,j=0;
        for (i = 0,j=0; i <length && j<length;) {
            if(!flag[arr[j]]){
                flag[arr[j]]=true;
                j++;
            }
            else{
                max=Math.max(j-i,max);
                while(i<j && arr[i]!=arr[j]){
                    // i++;
                    flag[arr[i++]]=false;
                }
               i++;
                flag[arr[j]]=false;

            }
        }
        max=Math.max(max,j-i);


        return max;
    }
}
