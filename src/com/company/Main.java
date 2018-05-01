package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//method reference help to point to methods by their names by ": :" for, static,instance methods and
    //constructors using NEW operator(TreeSet::new). syntax for lambda that executes just 1 method
    //syntax: ObjectType :: instanceMethod // Object :: methodName // Class :: staticMethod

    /*    List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 55, 99, 44, 192, 47);//list of integers
        numbers.stream()
                .filter(e -> e%2 == 0)//find even numbers
                .map(e -> e * 2)//calculate even number *2
                .forEach(e -> System.out.println(e));*/


        //with method reference: .filter(NameOfClass :: NameOfMethod)
        List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 55, 99, 44, 192, 47);//list of integers
            numbers.stream()
            .filter(Main :: findEvenNumber)//we are putting whole method
            .map(Main :: doubbleNumbeer)//calculate even number *2
            .forEach(System.out::println);

    }

    public static boolean findEvenNumber(int e){
        if (e%2==0){
        return true;
            }
            else{
                return false;
            }
        }

        public static int doubbleNumbeer(int e){
            return e * 2;
        }
    }
