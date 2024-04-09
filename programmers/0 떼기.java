class Solution {

    public String solution(String n_str) {

        return java.util.stream.IntStream
            .range(0, n_str.length())
            .filter(index-> n_str.charAt(index)!='0')
            .findFirst()
            .stream()
            .mapToObj(n_str::substring) 
            .findFirst()
            .get();
    }
}
