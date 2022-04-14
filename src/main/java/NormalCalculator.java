import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * User: Syed Abdullah
 * Date: 15-Apr-2022
 * Time: 12:22 AM
 */
public class NormalCalculator implements Calculator {
    private static final String DELIMITERS = ",|\n";
    public int add(String numbers) {
        return add(parseNumbers(numbers));
    }

    private int add(List<Integer> integers) {
        return integers.stream().mapToInt(i-> i.intValue()).sum();
    }

    private List<Integer> parseNumbers(String numbers) {
        List<Integer> integers=new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(numbers,DELIMITERS);
        while (stringTokenizer.hasMoreTokens()){
            integers.add(Integer.valueOf(stringTokenizer.nextToken()));
        }
        return integers;
    }
}
