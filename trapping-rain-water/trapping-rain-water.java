class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int left_max = 0;
        int right_max = 0;
        int res = 0;
        while(left <= right){
            if(height[left] <= height[right]){
                left_max = Math.max(left_max, height[left]);
                res += (left_max-height[left]);
                left++;
            }else{
                right_max = Math.max(right_max, height[right]);
                res += (right_max - height[right]);
                right--;
            }
        }
        return res;
    }
}