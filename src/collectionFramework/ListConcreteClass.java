package collectionFramework;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class ListConcreteClass {
    public static void main(String[] args) {
        LinkedList<News> news = new LinkedList<>();
        //news.add(null);
        news.add(new News("Title A", "Description A", LocalDate.of(2024, Month.APRIL,4)));
        news.add(new News("Title B", "Description B", LocalDate.of(2024, Month.APRIL,2)));
        news.add(new News("Title C", "Description C", LocalDate.of(2024, Month.APRIL,5)));
        news.add(new News("Title D", "Description D", LocalDate.of(2024, Month.APRIL,5)));
        news.add(new News("Title D", "Description D", LocalDate.of(2024, Month.APRIL,5)));

        System.out.println(news);

       // news.add(2, new News("ADV 1", "Adv1 descrtiption", LocalDate.of(2024,Month.APRIL,4)));

     //   HashSet<News> newsHashSet =  new HashSet<>(news);
      //  System.out.println(newsHashSet);

       /* for(News print : newsHashSet){
            System.out.println(print);
        }*/

        TreeSet<News> newsTreeSet = new TreeSet<>(news);
        for(News sortedNews : newsTreeSet){
            System.out.println(sortedNews);
        }
        System.out.println("*** TreeSet sorted and no duplicate value *********");
        TreeSet<News> newsTreeSet1 = new TreeSet<>((o1,o2)->o1.getPublishedDate().compareTo(o2.getPublishedDate()));
        newsTreeSet1.addAll(news);

        for(News sortedNews : newsTreeSet1){
            System.out.println(sortedNews);
        }
       // System.out.println(newsTreeSet);

        System.out.println("+++++++ ArrayDeque +++++++++");
        ArrayDeque<News> arrayDeque =new ArrayDeque(news);
        for(News  printArrayDeque : arrayDeque){
            System.out.println(printArrayDeque);
        }
        System.out.println("==getFirst  ====");
        System.out.println(arrayDeque.getFirst());

        System.out.println("== getLast  ====");
        System.out.println(arrayDeque.getLast());

        System.out.println("=== pop ===");
        System.out.println(arrayDeque.pop());

        System.out.println("*** Print all ***");
        for(News  printArrayDeque : arrayDeque){
            System.out.println(printArrayDeque);
        }

        // Priority Queue
        System.out.println("\n+++ PriorityQueue ++++");
        PriorityQueue<News> priorityQueue = new PriorityQueue<>(news);
        for(News printPriority : news){
            System.out.println(printPriority);
        }

        System.out.println("\n ==== Sorting on published date ====");

        PriorityQueue<News> priorityQueue1 =new PriorityQueue<>((o1,o2)->-o1.getPublishedDate().compareTo(o2.getPublishedDate()));
        priorityQueue1.addAll(news);
        for(News sortedPriority : priorityQueue1){
            System.out.println(sortedPriority);
        }

    }
}
