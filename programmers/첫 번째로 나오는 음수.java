class Solution {

    public int solution(int[] num_list) {

        return java.util.stream.IntStream
            .range(0, num_list.length)
            .filter(index-> num_list[index] < 0)
            .findFirst()
            .orElse(-1);
    }
}
