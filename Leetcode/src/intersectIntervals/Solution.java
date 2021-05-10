class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        List<int[]> unionIntervals = new ArrayList<>();

        int i = 0, j = 0;

        int n = firstList.length, m = secondList.length;

        Arrays.sort(firstList, (a, b) -> a[0] - b[0]);
        Arrays.sort(secondList, (a, b) -> a[0] - b[0]);

        int currentInterval[] = new int[2];
        while (i < n && j < m) {

            int first = Math.max(firstList[i][0], secondList[j][0]);
            int next = Math.min(firstList[i][1], secondList[j][1]);

            if (first <= next) {
                unionIntervals.add(new int[] { first, next });
            }

            if (firstList[i][1] <= secondList[j][1]) {
                i++;
            } else {
                j++;
            }

        }

        int result[][] = new int[unionIntervals.size()][2];
        int k = unionIntervals.size();

        for (i = 0; i < k; i++) {
            result[i][0] = unionIntervals.get(i)[0];
            result[i][1] = unionIntervals.get(i)[1];
        }

        return result;
    }
}