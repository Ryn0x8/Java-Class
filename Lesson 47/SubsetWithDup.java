import java.util.*;

public class SubsetWithDup {
    Set<List<Integer>> output = new HashSet<>();
    public List<List<Integer>> subsets(int[] nums){
        Arrays.sort(nums); 
        helper(0, new ArrayList<>(), nums);
        List<List<Integer>> result = new ArrayList<>(output);
        return result;
    }

    public void helper(int first, List<Integer> curr, int[] nums){
        if (first == nums.length){
            output.add(new ArrayList<>(curr));
            return;
        }
        helper(first + 1, curr, nums); 
        curr.add(nums[first]);
        helper(first + 1, curr, nums);
        curr.remove(curr.size()-1);
    }

    public static void main(String[] args){
        SubsetWithDup solutions = new SubsetWithDup();
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = solutions.subsets(nums);
        System.out.println(result);
    }
}
