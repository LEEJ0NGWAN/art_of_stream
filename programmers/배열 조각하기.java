class Solution {

    public int[] solution(int[] arr, int[] query) {

        return java.util.stream.IntStream
            .of(query)
            .collect(
                ()-> java.util.Collections.singletonList(new int[] {0,arr.length-1,0}),
                (list, index)->
                    list.get(0)[list.get(0)[2] = 1 - list.get(0)[2]] = list.get(0)[0] + index,
                (a, b)-> {})
            .stream()
            .map(info-> java.util.stream.IntStream.rangeClosed(info[0], info[1]))
            .findFirst()
            .get()
            .map(index-> arr[index])
            .toArray();
    }
}
