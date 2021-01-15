package com.testproject;

public class  TextBox extends UIControl {
    private   String text ="Initial"; //this is field of a class



    public TextBox( ) {

        super(true);
//        Inherited from UI Control Class
        System.out.println(overRideValue);
    }

//    over-riding setOverRideValue method of superclass
//    in super class it was just setting hard code values you can see it in UI Control
//    after overriding here we maked it parameter based dynamic
    @Override
    public void setOverRideValue(String value) {
        this.overRideValue = value;
    }


    public void setText(String text){
        this.text = text;
    }
    public  void clear(){
        this.text = "";
    }
}