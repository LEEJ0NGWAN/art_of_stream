class Solution {

    public int[] solution(int[] num_list) {

        return java.util.stream.IntStream
            .of(num_list)
            .sorted()
            .skip(5)
            .toArray();
    }
}
