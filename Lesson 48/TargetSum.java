import java.util.*;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = findTargetSum(nums, target);
        System.out.println(result);
    }

    public static List<List<Integer>> findTargetSum(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, target, res, 0, new ArrayList<>());
        return res;
    }

    private static void backtrack(int[] nums, int target, List<List<Integer>> res, int start, List<Integer> curr){
        if (target < 0) return;
        if (target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <nums.length; i++){
            curr.add(nums[i]);
            backtrack(nums, target - nums[i], res, i, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
