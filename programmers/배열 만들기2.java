class Solution {

    public int[] solution(int l, int r) {

        return java.util.Optional
            .of(
                java.util.stream.IntStream
                .rangeClosed(l,r)
                .filter(number-> Integer.toString(number).chars().allMatch(x-> x=='0'||x=='5'))
                .toArray())
            .filter(arr-> arr.length > 0)
            .orElse(new int[]{ -1 });
            
    }
}
