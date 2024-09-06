class Solution {

    public String[] solution(String[] strArr) {

        return java.util.stream.Stream
            .of(strArr)
            .filter(str-> !str.contains("ad"))
            .toArray(String[]::new);
    }
}
