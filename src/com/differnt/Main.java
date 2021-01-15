package com.differnt;
import com.testproject.*;
public class Main {

    public static void main(String[] args) {
        Console console =  new Console();
        console.readNumber("Different :",2,100);

//        you can not access console.Name becuase its is a protected member which only accesebile with in the mo.testproject package
//           System.out.println(console.Name); <========== it will through error

    }

}
