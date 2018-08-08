package com.academy.lesson12.Task2;


import com.academy.lesson12.Task2.NoSuchElementException;

public interface Queue<T> {
    boolean add(T element); // помещает элемент в конец очереди
    // достает и удаляет элемент из очереди, который зашел самым первым.
    T poll();
    // достает и удаляет элемент из очереди, который зашел самым первым.Если очередь пуста - бросает NoSuchElementException
    T remove()throws NoSuchElementException;
    // выдает первый элемент на очереди, но не удаляет его.Если очередь пуста - возвращает null
    T peek();
    // выдает первый элемент на очереди, но не удаляет его.Если очередь пуста - бросает NoSuchElementException
    T element() throws NoSuchElementException;

}
