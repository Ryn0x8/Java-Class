import java.util.*;

public class Permutation {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        helper(0, nums, new ArrayList<>());
        return result;
    }

    private void helper(int idx, int[] nums, List<Integer> curr){
        if (curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i< nums.length; i++){
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
        Permutation p = new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = p.permute(nums);
        System.out.println(ans);
        
    }
}
