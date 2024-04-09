class Solution {

    public int[] solution(int[] arr, int[] delete_list) {

        return java.util.Optional
            .of(new boolean[1001])
            .stream()
            .peek(tmp-> java.util.stream.IntStream.of(delete_list).forEach(d-> tmp[d]=true))
            .map(tmp-> java.util.stream.IntStream.of(arr).filter(e-> !tmp[e]).toArray())
            .findFirst()
            .get();
    }
}
