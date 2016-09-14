package com.company;

/**
 * Created by mtsurenko on 9/14/2016.
 */
public class Main {
    public static void main(String[] args) {
        ;

        //1.4

        ConnectionManager invokingConnManager = new ConnectionManager();
        invokingConnManager.GetConnection();

        BaseClass b = new subBaseClass();
        b.method1();

    }

}
