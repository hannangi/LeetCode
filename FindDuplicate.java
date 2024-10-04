public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        
    // // edge case
    // if (nums == null || nums.length == 0) {
    //     return -1;
    // }
    
    // // initialize low and high pointers
    // int low = 1;
    // int high = nums.length - 1;
    
    // // keep iterating until low and high pointers meet
    // while (low <= high) {
        
    //     // find the middle element
    //     int mid = low + (high - low) / 2;
        
    //     // initialize a counter to keep track of how many elements are less than or equal to the middle element
    //     int count = 0;
        
    //     // iterate through the array and count how many elements are less than or equal to the middle element
    //     for (int num : nums) {
    //         if (num <= mid) {
    //             count++;
    //         }
    //     }
        
    //     // if the count is greater than the middle element, that means there are duplicate elements in the range [low, mid]
    //     // so we set high = mid
    //     if (count > mid) {
    //         high = mid;
    //     }
        
    //     // otherwise, there are duplicate elements in the range [mid + 1, high]
    //     // so we set low = mid + 1
    //     else {
    //         low = mid + 1;
    //     }
    // }
    
    // // at this point, low and high pointers have converged and we have found the duplicate element
    // return low;
    int low = 1, high = nums.length - 1;
    while (low <= high) {
        int mid = (int) (low + (high - low) * 0.5);
        int cnt = 0;
        for (int a : nums) {
            if (a <= mid) ++cnt;
        }
        if (cnt <= mid) low = mid + 1;
        else high = mid - 1;
    }
    return low;
}

public static void main(String[] args) {
    int[] nums = {1, 3, 4, 2, 2};
    FindDuplicate finder = new FindDuplicate();
    System.out.println(finder.findDuplicate(nums));
    
}
}


