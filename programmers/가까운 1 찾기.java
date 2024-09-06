class Solution {

    public int solution(int[] arr, int idx) {

        return java.util.stream.IntStream
            .range(idx, arr.length)
            .filter(i-> arr[i]==1)
            .findFirst()
            .orElse(-1);
    }
}
