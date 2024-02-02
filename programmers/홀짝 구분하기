public class Solution {

    public static void main(String[] args) throws Exception {

        System.out.println(
            java.util.stream.IntStream
            .of(Integer.parseInt(new String(System.in.readNBytes(4))))
            .collect(
                StringBuilder::new,
                (sb, x)-> sb
                .append(x)
                .append(" is ")
                .append(x%2==0? "even": "odd"),
                (a,b)-> {})
            .toString());
    }
}
