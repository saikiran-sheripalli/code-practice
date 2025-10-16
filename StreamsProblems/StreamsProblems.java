import StreamsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsProblems {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Given a list of words, use map() to convert each word to its length and collect the result into a List of Integers.");
        System.out.println("----------------------------------------------------------------------------\n");
        List<String> listOfWords = new ArrayList<>(Arrays.asList("apple","banana","orange","mango","grape","peach","cherry","lemon","kiwi","plum" ));
        System.out.println("words : "+listOfWords);
        List<Integer> result = listOfWords.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Length of words : "+result);
        System.out.println();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("2. From a list of phrases, filter those with more than 10 characters and collect them into a Set.");
        System.out.println("----------------------------------------------------------------------------\n");
        List<String> listOfPhrases = new ArrayList<>(Arrays.asList("in the morning", "after the meeting", "during lunch", "at 7pm tim", "for the first time", "under the table","by car"));
        System.out.println("Phrases : "+listOfPhrases);
        System.out.println("Count of Phrases : "+listOfPhrases.stream().count());
        Set<String> moreThan10Characters = listOfPhrases.stream()
                                            .filter(item -> item.replaceAll("\\s+", "").length()>10)
                                            // .filter(item -> item)
                                            .collect(Collectors.toSet());
        System.out.println("moreThan10CharactersPhrases : "+moreThan10Characters);
        System.out.println("Count of moreThan10Characters : " + moreThan10Characters.stream().count());
        System.out.println();


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("3. Use reduce() to sum the values of a list of integers and print the result. ");
        System.out.println("----------------------------------------------------------------------------\n");
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(10,23,12,45,67,45,21));
        System.out.println("listOfIntegers : "+listOfIntegers);
        System.out.println("sum of listOfIntegers : "+listOfIntegers.stream().reduce(2,(a,b) -> a+b));
        System.out.println();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("4. use streams to create a new list containing only phrases longer than 7 characters, and convert those phrases to uppercase");
        System.out.println("----------------------------------------------------------------------------\n");
        System.out.println("Phrases : "+listOfPhrases);
        List<String> upperCasePhrases = listOfPhrases.stream().filter(item -> item.replaceAll("\\s+", "").length()<7).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Converted to UpperCasePhrases less than 7 characters: "+upperCasePhrases);
        System.out.println();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("5. List<Integer> numbers = Arrays.asList(10, 25, 5, 38, 15), use streams to find the largest number.");
        System.out.println("----------------------------------------------------------------------------\n");
        List<Integer> numbers = Arrays.asList(10, 25, 5, 38, 15);
        //one way using reduce intermediate operation
        Integer operation1Max = numbers.stream().reduce(Integer::max).orElseThrow();
        System.out.println("Largest number using reduce operation : "+operation1Max);
        //other way is using max terminal operation
        Integer operation2Max = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Largest number using max operation : "+operation2Max);
        System.out.println();


    }
}
