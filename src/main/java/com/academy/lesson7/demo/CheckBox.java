package com.academy.lesson7.demo;
import com.academy.lesson6.Demo.component.Button;
public class CheckBox extends Button {
    private boolean checked;

    public CheckBox(int height, int width) {
        super(height, width);
    }

    public CheckBox(int height, int width, boolean checked) {
//        super();
        super(height, width);
//        setHeight(height);
//        setWidth(width);
        this.checked = checked;
    }
}