class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n = n % 14 == 0 ? 14 : n % 14;
        for (int i = 0; i < n; i++) {

            int clone[] = cells.clone();

            for (int j = 1; j < 7; j++) {

                if (clone[j - 1] != clone[j + 1]) {
                    cells[j] = 0;
                } else {
                    cells[j] = 1;
                }
            }

            cells[0] = 0;
            cells[7] = 0;

            // System.out.println(Arrays.toString(cells));

        }

        return cells;
    }
}