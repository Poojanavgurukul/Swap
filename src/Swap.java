import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4);
        System.out.println(swap(numbers,0,1));
    }
    public static List<Integer>swap(List<Integer> numbers, int i, int j){
        int elementI = numbers.get(i);
        int elementJ=numbers.get(j);
        numbers.set(i,elementJ);
        numbers.set(j,elementI);
        return numbers;
    }
}
