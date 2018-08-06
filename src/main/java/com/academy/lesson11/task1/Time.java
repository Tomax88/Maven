package com.academy.lesson11.task1;

public interface Time {
    void setTime(int hours , int minutes , int seconds) throws Exception; // устанавливает значение времени
    String getTime(TimeFormat timeFormat);		// выдает строковое представление
}