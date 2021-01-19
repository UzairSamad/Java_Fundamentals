package com.testproject;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//      calling renderMethod according to the class
        UIControl[] controls = {new TextBox(), new CheckBox()};
        Arrays.stream(controls).forEach(UIControl::render);
    }
}
