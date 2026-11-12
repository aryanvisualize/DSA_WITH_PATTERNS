// 39. Combination Sum

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, candidates, target, new ArrayList<>(), result);
        return result;
    }
    private void findCombinations(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {

        // Base case: valid combination found
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Base case: invalid path
        if (index == candidates.length || target < 0) {
            return;
        }

        // Choice 1: Pick the current element
        current.add(candidates[index]);

        findCombinations(index, candidates, target - candidates[index], current, result);

        // Backtracking: remove the selected element
        current.remove(current.size() - 1);

        // Choice 2: Do not pick the current element
        findCombinations(index + 1, candidates, target, current, result );
    }
}
