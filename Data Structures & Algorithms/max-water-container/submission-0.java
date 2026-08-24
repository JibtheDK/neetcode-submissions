class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;
        int area = 0;
        while(left < right){
            int width = right - left;
            int length = Math.min(heights[left],heights[right]);
            int areaTemp = width * length;
            if(areaTemp > area){
                area = areaTemp;
            }
            if(heights[left] > heights[right]){
                right--;
            }
            
            else{
                left++;
            }

        }
        return area;
    }
}
