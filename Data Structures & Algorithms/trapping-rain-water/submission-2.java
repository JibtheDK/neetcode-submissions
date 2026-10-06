class Solution {
    public int trap(int[] height) {

        int l = 0, r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int total = 0;

        while (l < r) {

            if (leftMax < rightMax) {
                l+=1;
                leftMax = Math.max(leftMax, height[l]);
                total += leftMax - height[l];
            } 

            else {
                r-=1;
                rightMax = Math.max(rightMax, height[r]);
                total += rightMax - height[r];
            }

        }
        return total;
    }
}