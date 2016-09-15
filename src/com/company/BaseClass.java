package com.company;

/**
 * Created by mtsurenko on 9/14/2016.
 */
public class BaseClass {
    //2.1.
    public void method1 () {
        System.out.println ("printing 1st method line: ");

     //2.2.
        BaseClass invokingMethod2 = new BaseClass();
        invokingMethod2.method2();
    };

    public static void method2 (){
        String str2 = "printing 2nd method line";
        System.out.println (str2);
    };




}
    //2.3.
class subBaseClass extends  BaseClass{


        public static void method2 (){
            String str2 = "printing 2nd methid line from subclass";
            System.out.println (str2);
        };

        //2.4
       // subBaseClass invSub = new subBaseClass();
        //BaseClass base = invSub;

    }

