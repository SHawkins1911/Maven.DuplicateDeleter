package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    Integer [] input = super.array;


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays.stream(super.array).filter(i -> (super.countOccurences(i, input) < maxNumberOfDuplications)).toArray(Integer[]::new);
    }

//    @Override
//    public Integer[] removeDuplicates(Integer[] intArray, int maxNumberOfDuplications) {
//        Arrays.stream(intArray).distinct().collect(Collectors.toList());
//        return new Integer[0];
//    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(super.array).filter(i -> (super.countOccurences(i, input) != exactNumberOfDuplications)).toArray(Integer[]::new);
    }
}
