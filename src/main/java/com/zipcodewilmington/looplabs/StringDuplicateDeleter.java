package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

        String [] stringArray = super.array;

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);

    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(super.array).filter(s -> (super.countOccurences(s, stringArray) < maxNumberOfDuplications)).toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(super.array).filter(s -> (super.countOccurences(s, stringArray) != exactNumberOfDuplications)).toArray(String[]::new);
    }
}
