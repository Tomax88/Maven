package com.academy.lesson12.Task1;

public interface Stack<T> {
    void push(T element) throws FullStackException; // кладет элемент в вершину стэка
    T pop() throws EmptyStackException;		 // удаляет элемент из вершины стэка и возвращает его. Если стэк пустой - возвращает EmptyStackException
    T peek() throws EmptyStackException;; 		 // возвращает элемент из вершины стэка, но не удаляет его
}
