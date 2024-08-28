class Solution {

    public int solution(int a, int b, int c, int d) {

        return java.util.stream.IntStream
            .of(a, b, c, d)
            .reduce(0, (y, x)-> {

                if (4000000 <= (y += Math.pow(10, 6-x) + 1000000)) {

                    final String result = '$' + Integer.toString(y).substring(1);

                    int l = -1, r = -1;

                    if ((l = result.indexOf('4')) != -1) return 1111 * l;
                    if ((l = result.indexOf('3')) != -1) return (r = 10 * l + result.indexOf('1')) * r;
                    if ((l = result.indexOf('2')) != -1)
                        return l == (r = result.lastIndexOf('2'))?
                        result.indexOf('1') * result.lastIndexOf('1'):
                        (l + r) * Math.abs(l - r);
                    return result.indexOf('1');
                }

                return y;
            });
    }
}
