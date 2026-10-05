class Solution {
    public int trap(int[] height) {
        // to determine, do the height[i] of guard multiplied by the amount of steps to next guard, if guards between the 2 big guards, then subtract those height[i] inbetween them
        int total = 0;

            
            int n = height.length; 
            int[] maxLeft = new int[n];
            int[] maxRight = new int[n];
            
            maxLeft[0] = height[0];
            for(int i = 1; i < n; i++){
                maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
            }

            maxRight[n - 1] = height[n-1];
            for(int i = n-2; i >= 0; i--){
                maxRight[i] = Math.max(maxRight[i+1], height[i]);
            }
            
            for(int i = 0; i < n; i++){
                total += Math.min(maxLeft[i], maxRight[i]) - height[i];
            }
            
        return total;
        
    }
}
