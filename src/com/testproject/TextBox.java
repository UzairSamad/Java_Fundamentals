package com.testproject;

public class  TextBox extends UIControl {
    private   String text ="Initial"; //this is field of a class
// inherting UI Control Class in it , first the Constructor of parent/super class will be called then sub class
//    a class which extends another class in it is a sub-class of that class
    public TextBox( ) {
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }
    public  void clear(){
        this.text = "";
    }
}