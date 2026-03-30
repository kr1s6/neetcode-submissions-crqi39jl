class Solution {
    public int trap(int[] h) {
        int water = 0;

        int left = 0;
        int right = h.length-1;

        int leftMax = h[left];
        int rightMax = h[right];

        while(left<right){
            if(h[left] < h[right]){
                left++;
                leftMax = Math.max(leftMax, h[left]);
                water += leftMax - h[left];
            } else{
                right--;
                rightMax = Math.max(rightMax, h[right]);
                water += rightMax - h[right];
            }
        }

        return water;
    }
}
