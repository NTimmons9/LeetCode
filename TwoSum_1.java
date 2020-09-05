class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> hm = new HashMap<>();
      
      for (int i = 0; i < nums.length; ++i){
        int newtarget = target - nums[i];
        int pos = hm.getOrDefault(newtarget, -1);
        if (pos != -1 && pos != i){
          return new int[]{i, pos};
        }
        hm.put(nums[i], i);
      }
      return null;
    }
}
