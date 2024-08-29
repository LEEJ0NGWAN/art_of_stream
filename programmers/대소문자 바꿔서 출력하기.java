public class Solution {

    public static void main(String... args) throws Exception {

        new String(System.in.readAllBytes())
            .chars()
            .filter(Character::isAlphabetic)
            .mapToObj(c-> (char) (c>=97? c & 0x5f: c ^ 0x20))
            .forEach(System.out::print);
    }
}
