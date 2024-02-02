class Solution {

    public int solution(int n, String control) {

        return control
            .chars()
            .map(c-> {

                if ('w'==c) return   1;
                if ('s'==c) return  -1;
                if ('d'==c) return  10;
                if ('a'==c) return -10;

                return 0;
            })
            .reduce(n, (y,x)-> y+=x);
    }
}
