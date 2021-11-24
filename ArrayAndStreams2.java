package chapter17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAndStreams2 {
    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "yellow", "green", "blue", "indigo", "violet"};

        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        System.out.printf("strings in uppercase: %s%n",
                 Arrays.stream(strings)
                .collect(Collectors.toList()));

        System.out.printf("strings less than n sorted ascending: %s%n",
                 Arrays.stream(strings)
                 .filter(s -> s.compareToIgnoreCase("n") < 0)
                 .collect(Collectors.toList()));

         System.out.printf("strings less than n sorted descending: %s%n",
                        Arrays.stream(strings)
                         .filter(s -> s.compareToIgnoreCase("n") < 0)
                         .collect(Collectors.toList()));
    }
}
