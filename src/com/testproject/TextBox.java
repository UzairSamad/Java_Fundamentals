package com.testproject;

public class  TextBox extends UIControl {
    private   String text ="Initial"; //this is field of a class

// inherting UI Control Class in it , first the Constructor of parent/super class will be called then sub class
//    a class which extends another class in it is a sub-class of that class

    public TextBox( ) {
//        if our super class had any parameters in its constructor we should pass it in supper keyword
//        here calling the constructor of a super-class with super method and pass parameters
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }
    public  void clear(){
        this.text = "";
    }
}