class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> subsetList = new ArrayList<>();

        Arrays.sort(nums);

        dfs(subsetList, nums, 0, new ArrayList<>());

        return subsetList;
    }

    private void dfs(List<List<Integer>> subsetList, int nums[], int index, List<Integer> tempList) {

        subsetList.add(new ArrayList<>(tempList));

        if (index >= nums.length)
            return;

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1])
                continue;

            tempList.add(nums[i]);
            dfs(subsetList, nums, i + 1, tempList);
            tempList.remove(tempList.size() - 1);

        }

    }
}