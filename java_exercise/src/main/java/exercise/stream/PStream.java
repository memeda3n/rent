package exercise.stream;

import java.util.Arrays;
import java.util.List;

public class PStream {


    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(123,2321,23,122,2332,2123);
        integers.parallelStream().sorted();
        System.out.println(integers.parallelStream().sorted());
        integers.parallelStream().findAny();
        System.out.println( integers.parallelStream().findAny());
    }




}
