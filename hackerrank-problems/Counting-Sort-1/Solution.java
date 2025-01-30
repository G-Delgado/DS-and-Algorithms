import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        Integer[] freqArr = new Integer[100];
        Arrays.fill(freqArr, 0);
        for (int i = 0; i < arr.size(); i++) {
            freqArr[arr.get(i)] += 1;
        }
        List<Integer> finalList = new ArrayList<Integer>();
        for (int i = 0; i < freqArr.length; i++) {
            for (int j = 0; j < freqArr[i]; j++) {
                finalList.add(i);
            }
        }
        
        // If you use the final list, you'll get the list sorted. If you return the freqArr, you'll only get the frequencies as per the problem requested.
        //return finalList;
        return Arrays.asList(freqArr);
        
    }

}