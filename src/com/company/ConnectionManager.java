package com.company;

/**
 * Created by mtsurenko on 9/14/2016.
 */
public class ConnectionManager {

    public static int numberOfArrayElements = 6;
    public static Connection[] array = new Connection[numberOfArrayElements];

    //1.2.
    ConnectionManager() {

        for (int i = 0; i < numberOfArrayElements; i++) {
            array[i] = new Connection();
        }

    };

    //1.3

    public static void GetConnection() {

        int arrayLength;
        arrayLength = array.length;
        /*for (int i = 1; i < arrayLength + 1; i++)
        {System.out.println("Array's element #: "+ i + "  " + array[i-1] + "  " + arrayLength);
          if (i == arrayLength + 1)
          {System.out.println ("no more elements in array");
          break;}
        }*/

    for (int i = 1; i <= arrayLength; i++) {
        System.out.println("Array's element #: " + i + "  " + array[i - 1] + "  lenght is " + arrayLength);
        for (int j = 1; j < arrayLength + 1 ; j++) {

            if (i == arrayLength && j == arrayLength) {
                System.out.println("no more elements in array, here's your null");
                break;
            }
        }
    }

    }
}