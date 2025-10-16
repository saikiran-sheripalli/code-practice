import NewWorkSpace.dao.PrintJob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {

        // Write a program to sort an ArrayList of Strings alphabetically.
        List<String> strings = new ArrayList<>(Arrays.asList("satya","akshay","pranay","john","brad","dribble"));
        System.out.println("List : "+strings);
        System.out.println("Alphabetical Order List : "+strings.stream().sorted().collect(Collectors.toList()));

        System.out.println("----------------------------------------------------------------------------");
        // Write a program to find the maximum element from an ArrayList of Integers.
        List<Integer> integers = new ArrayList<>(Arrays.asList(10,1,3,12,15,98,45,17,42,55));
        System.out.println("List : " + integers);
        System.out.println("Maximum Element : "+integers.stream().max(Integer::compareTo).get());     

        System.out.println("----------------------------------------------------------------------------");
        // Write a program to remove all duplicate elements from an ArrayList.
        List<Integer> integers1 = new ArrayList<>(Arrays.asList(10,55,1,3,12,15,98,45,17,42,55,12,15,98));
        System.out.println("List : " + integers1);
        System.out.println("Duplicate removed elements  : "+integers1.stream().distinct().collect(Collectors.toList()));

        System.out.println("----------------------------------------------------------------------------");
        // Create a LinkedList and perform various operations like add, remove, and iterate over it.
        LinkedList<PrintJob> jobsQueue = new LinkedList<>();
        jobsQueue.add(new PrintJob(101,"print invoice", 1));
        jobsQueue.add(new PrintJob(102,"print reports", 2));
        jobsQueue.add(new PrintJob(103,"print salary slips", 3));
        jobsQueue.add(new PrintJob(104,"print certificates", 4));
        jobsQueue.add(new PrintJob(105,"print image", 5));

        // jobsQueue.stream().filter(n -> n.getJobId()%2 == 0).forEach(System.out::println);
        jobsQueue.stream().map(n -> n.getJobId()%2 == 0).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(jobsQueue);

    }
    
}