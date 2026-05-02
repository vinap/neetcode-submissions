class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = numCount.get(nums[i]);
            System.out.println(value);
            if (value != null && value >= 1) {
                return true;
            }else if (value != null) {
                numCount.put(nums[i], value++);
            } else if (value == null) {
                numCount.put(nums[i], 1);
            }  
        }

        return false;
    }
}