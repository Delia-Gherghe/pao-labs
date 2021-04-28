package ro.unibuc.lab10.stream.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Collecting:
 * The reduction can also be provided by the collect() method of type Stream.
 * This operation is very handy in case of converting a stream to a Collection or a Map and
 * representing a stream in form of a single string.
 * There is a utility class Collectors which provide a solution for almost all typical collecting
 * operations.
 */
public class StreamCollectingExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "I", "love", "tennis");

        System.out.println(words.stream().collect(Collectors.joining(" ")));


    }
}
