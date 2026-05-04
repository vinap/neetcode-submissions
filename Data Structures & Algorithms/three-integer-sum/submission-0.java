class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outPut = new ArrayList<>();
        for (int i =0 ;i<nums.length;i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int target = nums[i];
            if(target>0) break;
            if( i > 0 && target == nums[i-1]) continue;
            while (left < right) {
                int sum = nums[left] + nums[right] + target;
                if(sum > 0) {
                    right--;
                } else if (sum<0){
                    left++;
                } else {
                    outPut.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left ++;
                    }
                }
            }
        }
        return outPut;
    }
}
