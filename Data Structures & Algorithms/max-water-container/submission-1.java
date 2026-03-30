class Solution {
    public int maxArea(int[] heights) {
        int bar1 = 0;
        int bar2 = heights.length - 1;

        int waterMax = (bar2-bar1) * Math.min(heights[bar1], heights[bar2]);
        while(bar1 < bar2){
            if(heights[bar1] < heights[bar2]){
                bar1++;
            } else{
                bar2--;
            }

            if((bar2-bar1) * Math.min(heights[bar1], heights[bar2]) > waterMax){
                waterMax = (bar2-bar1) * Math.min(heights[bar1], heights[bar2]);
            }

        }

        return waterMax;
    }
}
