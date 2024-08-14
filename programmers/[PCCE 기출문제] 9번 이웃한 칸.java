class Solution {

    public int solution(String[][] board, int h, int w) {

        return (int) java.util.stream.Stream
            .of(new int[][]{{-1,0},{0,1},{1,0},{0,-1}}) // {dy, dx}
            .peek(d-> { d[0]+=h; d[1]+=w; })
            .filter(d-> 0<=d[0]&&d[0]<board.length&&0<=d[1]&&d[1]<board.length)
            .map(d-> board[d[0]][d[1]])
            .filter(board[h][w]::equals)
            .count();
    }
}
