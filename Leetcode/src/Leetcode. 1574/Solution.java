class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
      int n = arr.length;
      int leftEnd = 0;
      while (leftEnd+1 < n && arr[leftEnd] <= arr[leftEnd+1]) {
          leftEnd++;
      }
      
      if (leftEnd == n-1) {
          return 0;
      }
     
      int ret = n-leftEnd-1;
      int rightStart = n-1;
      
      while (leftEnd >= 0 && rightStart > leftEnd) {
          if (arr[leftEnd] > arr[rightStart]) {
              leftEnd--;
          } else {
              ret = Math.min(ret, rightStart-leftEnd-1);
              if (arr[rightStart-1] <= arr[rightStart]) {
                  rightStart--;
              } else {
                  break;
              }
          }
      }
      while (rightStart-1 >= 0 && arr[rightStart-1] <= arr[rightStart]) {
          rightStart--;
          ret = Math.min(ret, rightStart);
      }
      return ret;
  }
}