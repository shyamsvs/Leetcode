class Solution:
    def trap(self, heights: List[int]) -> int:
        water = [0 for x in heights]
        lmax = 0
        for i in range(len(heights)):
            height= heights[i];
            water[i] = lmax
            lmax = max(lmax, height);
        rmax = 0
        for i in reversed(range(len(heights))):
            height = heights[i];
            minH = min(rmax, water[i])
            if height <minH:
                water[i] = minH - height
            else:
                water[i] = 0
            rmax = max(rmax, height)
        return sum(water)
        
