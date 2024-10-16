package LeetCode;
public class ContainerMostWater{
public int containerMostWater(int[] height) {
    int N = height.length;
    int left = 0, right = N - 1;
    int maxWater = Integer.MIN_VALUE;
        
    while( left < right ) {
         
        maxWater = Math.max(maxWater, Math.min(height[left], height[right]) * (right - left));
            
        if(height[left]  < height[right] ) left++;
        else right--;
    }
        
    return maxWater;

}    


public static void main(String[] args) {
    int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    ContainerMostWater mostWater = new ContainerMostWater();
    System.out.println(mostWater.containerMostWater(nums));
    
}
}