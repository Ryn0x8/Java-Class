import java.util.*;

public class UPermutation {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums){
        helper(0, nums, new ArrayList<>());
        List<List<Integer>> nres = new ArrayList<>(result);
        return nres;
    }

    private void helper(int idx, int[] nums, List<Integer> curr){
        if (curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i< nums.length; i++){
            if (i>idx && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            swap(nums, i, idx);
            helper(idx + 1, nums, curr);
            swap(nums, i, idx); 
            curr.remove(curr.size() - 1);
        }

    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        UPermutation p = new UPermutation();
        int[] nums = {1, 1, 3};
        List<List<Integer>> ans = p.permuteUnique(nums);
        System.out.println(ans);
        
    }
}
