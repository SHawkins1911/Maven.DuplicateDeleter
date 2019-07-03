package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;



    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    public Integer countOccurences(T numTOCount, T[] input){
        Integer count =0;
        for (int i = 0; i<input.length; i++){
            if (input[i].equals(numTOCount)){
                count++;
            }
        } return count;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}
