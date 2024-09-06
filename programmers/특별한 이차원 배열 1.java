class Solution {

    public int[][] solution(int n) {

        return java.util.stream.IntStream
            .range(0, n*n)
            .collect(
                ()-> new int[n][n],
                (arr, i)-> arr[i/n][i%n] = i/n == i%n? 1: 0,
                (a, b)-> {});
    }
}
