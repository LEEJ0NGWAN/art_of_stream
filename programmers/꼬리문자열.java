class Solution {

    public String solution(String[] str_list, String ex) {

        return java.util.Arrays
            .stream(str_list)
            .filter(str-> !str.contains(ex))
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
    }
}
