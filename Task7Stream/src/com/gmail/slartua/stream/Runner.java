package com.gmail.slartua.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run(){

        List<Integer> integerList = Stream.iterate(10, n -> n + 10)
                .limit(10)
                .map(n -> n / 2)
                .collect(Collectors.toList());
        System.out.println("List: " + integerList);

        List<Person> people = createList();
        System.out.println("Before");
        people.stream().forEach(System.out::println);
        System.out.println("After");
        people.stream()
                .filter(obj -> obj.getSex() == Person.Sex.MALE && obj.getAge() >= 18 && obj.getAge() <= 55)
                .forEach(System.out::println);
        System.out.println(people.stream().filter(obj -> obj.getSex() == Person.Sex.FEMALE)
                .mapToInt(Person::getAge)
                .average().getAsDouble());

    }

    private List<Person> createList(){
        return Arrays.asList(
                new Person("Oleg", 34, Person.Sex.MALE),
                new Person("IVan", 24, Person.Sex.MALE),
                new Person("Olya", 15, Person.Sex.FEMALE),
                new Person("Petya", 18, Person.Sex.MALE),
                new Person("Grisha", 17, Person.Sex.MALE),
                new Person("Artem", 30, Person.Sex.MALE),
                new Person("Katya", 25, Person.Sex.FEMALE),
                new Person("Sveta", 15, Person.Sex.FEMALE),
                new Person("Vova", 70, Person.Sex.MALE),
                new Person("Oleg2", 50, Person.Sex.MALE)
        );
    }
}
