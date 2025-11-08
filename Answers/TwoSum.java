public class TwoSum {
    public Boolean twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];    
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;  
            } else {
                right--; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        TwoSum solution = new TwoSum();
        Boolean result = solution.twoSum(nums, target);
        System.out.println("Two sum exists: " + result);
    }
}