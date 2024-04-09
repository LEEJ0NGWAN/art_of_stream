class Solution {

    public String solution(String myString) {

        return myString
            .chars()
            .map(c-> c<'l'? 'l':c)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }
}
