package com.academy.lesson12.Task2;

import com.academy.lesson12.Task2.NoSuchElementException;
import com.academy.lesson12.Task2.Queue;


public class QueueImpl<T> implements Queue<T> {
    private T[] array;
    private int pointer = -1;



    public QueueImpl(T[]array){
        this.array=array;
    }

    @Override
    public boolean add(T element) {
        if (pointer >= -1){
            array [++pointer] = element;
            return true;}
        else
            return false;
    }

    @Override
    public T poll() {
        if (pointer >= 0){
            pointer--;
            return array[0];
        }
        else
            return null;
    }

    @Override
    public T remove() throws NoSuchElementException {
        if (pointer >= 0) {
            pointer--;
            return array[0];
        }
        else throw new NoSuchElementException();
    }

    @Override
    public T peek() {
        if (pointer >= 0){
            return array[0];
        }
        else
            return null;
    }

    @Override
    public T element() throws NoSuchElementException {
        if (pointer >= 0) {
            return array[0];
        } else throw new NoSuchElementException();
    }
}
