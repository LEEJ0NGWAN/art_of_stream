class Solution {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        return java.util.stream.Stream
        .of(data)
        .filter(datum-> {

            final int attributeIndex =
            ext.equals("code")? 0:
            ext.equals("date")? 1:
            ext.equals("maximum")? 2: 3;

            return datum[attributeIndex] < val_ext;
        })
        .sorted((datum1, datum2)-> {

            final int attributeIndex =
            sort_by.equals("code")? 0:
            sort_by.equals("date")? 1:
            sort_by.equals("maximum")? 2: 3;

            return datum1[attributeIndex] < datum2[attributeIndex]? -1: 1;
        })
        .toArray(int[][]::new);
    }
}
