package com.company;

/**
 * Created by mtsurenko on 9/14/2016.
 */
public class Connection {

    //1.1.
    Connection ()
    {int n;};

    String str11 = "This is a field";

    public void method11 () {

        System.out.println ("printing what's in the field: " + str11);

    };

    public void method11 (String str11){
        String str2 = "result of 2nd overloaded method";

    };
}
