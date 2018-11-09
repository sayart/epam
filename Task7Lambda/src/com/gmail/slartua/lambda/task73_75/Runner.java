package com.gmail.slartua.lambda.task73_75;

import java.util.*;
import java.util.function.Predicate;

public class Runner {
    public void run(){
        Integer[] arrInt = createArrayInt(12);
        System.out.println("Array: " + Arrays.toString(arrInt));
//        Arrays.sort(arrInt, (obj1, obj2) -> obj2.compareTo(obj1));
        Arrays.sort(arrInt, Comparator.reverseOrder());
        System.out.println("Array: " + Arrays.toString(arrInt));

        List<String> stringList = createListStrings();
        System.out.println("List: " + stringList );
        Collections.sort(stringList, Comparator.reverseOrder());
        System.out.println("List: " + stringList );

        System.out.println();
        System.out.println("sum= " + sum(arrInt, x -> x % 2 == 0));
        System.out.println();
        System.out.println("List: " + selectString(stringList, x -> x.startsWith("a")));

        System.out.println();
        updateListString(stringList, x -> x.toUpperCase());
        System.out.println("List:" + stringList);
        List<String> list = Arrays.asList("", null, "  ", "  asd");
        updateListString(list, String::toUpperCase);
        System.out.println(list);


    }

    private Integer[] createArrayInt(int size){
        Integer[] array = new Integer[size];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private List<String> createListStrings(){
        List<String> list = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z' ; ch++) {
            list.add("" + ch + ch);
        }
        Collections.shuffle(list);
        return list;
    }

    private int sum(Integer[] array, Predicate<Integer> filter){
        int ss = 0;
        for (Integer value : array) {
            if(filter.test(value)){
                ss += value;
            }
        }
        return ss;
    }

    private List<String> selectString(List<String> list, Predicate<String> filter){
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (filter.test(str)) {
                newList.add(str);
            }
        }
        return newList;
    }
    private void updateListString(List<String> list, ConvertString convertString){
        for (int i = 0; i < list.size(); i++){
            if( !convertString.isNull(list.get(i))) list.set(i, convertString.convert(list.get(i)));

        }
    }
}
