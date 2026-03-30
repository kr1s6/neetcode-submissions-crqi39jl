class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length-1;

        int waterMax = (right - left) * Math.min(heights[left], heights[right]);
        while(left<right){
            if(heights[left] < heights[right]){
                left++;
            } else{
                right--;
            }

            int waterTmp = (right - left) * Math.min(heights[left], heights[right]);
            if(waterMax < waterTmp){
                waterMax = waterTmp;
            }
        }

        return waterMax;
    }
}
