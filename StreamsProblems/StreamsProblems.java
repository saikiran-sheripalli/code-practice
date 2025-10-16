package NewWorkSpace.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsProblems {
    public static void main(String[] args) {

        System.out.println("1. Given a list of words, use map() to convert each word to its length and collect the result into a List of Integers.");
        List<String> listOfWords = new ArrayList<>(Arrays.asList("apple","banana","orange","mango","grape","peach","cherry","lemon","kiwi","plum" ));
        System.out.println("words : "+listOfWords);
        List<Integer> result = listOfWords.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Length of words : "+result);

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("2. From a list of phrases, filter those with more than 10 characters and collect them into a Set.");
        List<String> listOfPhrases = new ArrayList<>(Arrays.asList("in the morning", "after the meeting", "during lunch", "at 7pm tim", "for the first time", "under the table","by car"));
        System.out.println("Phrases : "+listOfPhrases);
        System.out.println("Count of Phrases : "+listOfPhrases.stream().count());
        Set<String> moreThan10Characters = listOfPhrases.stream()
                                            .filter(item -> item.replaceAll("\\s+", "").length()>10)
                                            // .filter(item -> item)
                                            .collect(Collectors.toSet());
        System.out.println("moreThan10CharactersPhrases : "+moreThan10Characters);
        System.out.println("Count of moreThan10Characters : " + moreThan10Characters.stream().count());

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("3. Use reduce() to sum the values of a list of integers and print the result. ");
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(10,23,12,45,67,45,21));
        System.out.println("listOfIntegers : "+listOfIntegers);
        System.out.println("sum of listOfIntegers : "+listOfIntegers.stream().reduce(0,(a,b) -> a+b));

    }
}
