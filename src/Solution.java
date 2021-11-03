import java.util.*;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = Arrays.binarySearch(nums, target);
        if (answer >= 0) {
            return answer;
        }
        return -(answer + 1);
    }
}
