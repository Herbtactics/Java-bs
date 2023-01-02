package youtube;

import java.io.File;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        try (Scanner dirInput = new Scanner(System.in)) {
            System.out.println("Enter directory");

            String userName = dirInput.nextLine();
            File directory = new File(userName);
            File[] list = directory.listFiles();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
                
            }
        }
    }
}

// create a java program that can play music in the background given a folder of music videos(for android phone)