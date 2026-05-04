class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            int difference  = target - nums[index];
            if (numToIndexMap.containsKey(difference )
                && numToIndexMap.get(difference) != index) {
                return new int[] {numToIndexMap.get(difference ), index};
            } else {
                numToIndexMap.put( nums[index] , index);
            }
        }
        return new int[] {-1, -1};
    }
}
