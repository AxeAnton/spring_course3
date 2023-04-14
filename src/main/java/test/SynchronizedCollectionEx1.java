package test;

import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SynchronizedCollectionEx1 {
    public void SynchronizedCollectionEx1Start (){
        System.out.println("SynchronizedCollectionEx1Start");
    }
    public static <Results> void main(String[] args) throws InterruptedException {

//
//        Stream integerStream = Stream.of(-560, 312, 12, -1, 45, 0, 0, 23, -2, 221);
//        integerStream.mapToInt(x -> (int) x).filter(x -> x > 3).forEach(System.out::println);



//        SynchronizedCollectionEx1 synchronizedCollectionEx1 = new SynchronizedCollectionEx1();
//        synchronizedCollectionEx1.SynchronizedCollectionEx1Start();

        ArrayList<Integer> sours = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sours.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> synchList.addAll(sours);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}


