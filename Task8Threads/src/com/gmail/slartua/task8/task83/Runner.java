package com.gmail.slartua.task8.task83;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {
    private Map<Integer, Integer> map ;
    private Map<Integer, Integer> cmap;
    final int COUNT = 10000;

    public void run(){
       testHashMap();
       testConcurrentHashMap();

    }
    private void testHashMap(){
        map = new HashMap<>();
        Thread[] threadsWrite = new Thread[COUNT];
        Thread[] threadsRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int j = i;
            threadsWrite[i] = new Thread( () ->{
//                synchronized (this.map) {
                    map.put(j, j);
//                }
            });
            threadsRead[i]= new Thread( () ->{
//                synchronized (this.map){
//                    System.out.println(map.get(j));
                    map.get(j);
//                }
            });
        }
        long start = System.nanoTime();

        for (int i = 0; i < COUNT; i++) {
            threadsWrite[i].start();
            threadsRead[i].start();
        }
        for (int i = 0; i < COUNT; i++) {
            try{
                threadsWrite[i].join();
                threadsRead[i].join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        long end = System.nanoTime();
        System.out.println("/nTime = " + (end - start) / 1000000000.0);

    }
    private void testConcurrentHashMap(){
        map = new ConcurrentHashMap<>();
        Thread[] threadsWrite = new Thread[COUNT];
        Thread[] threadsRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int j = i;
            threadsWrite[i] = new Thread( () ->{
                synchronized (this.map) {
                    map.put(j, j);
                }
            });
            threadsRead[i]= new Thread( () ->{
                synchronized (this.map){
//                    System.out.println(map.get(j));
                    map.get(j);
                }
            });
        }
        long start = System.nanoTime();

        for (int i = 0; i < COUNT; i++) {
            threadsWrite[i].start();
            threadsRead[i].start();
        }
        for (int i = 0; i < COUNT; i++) {
            try{
                threadsWrite[i].join();
                threadsRead[i].join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        long end = System.nanoTime();
        System.out.println("/nTime = " + (end - start) / 1000000000.0);

    }


}
