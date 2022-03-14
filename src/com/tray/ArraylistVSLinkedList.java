package com.tray;
import java.util.HashMap;
import java.util.Scanner;


public class ArraylistVSLinkedList{



    public static void outImeiBox(){
        HashMap<Integer, Integer> imei = new HashMap<>(89000);
        int  forCheck = 30000;
        int boxNumber = 1;
        while(forCheck <= 89000){
            imei.put(forCheck,boxNumber);
            forCheck++;
            boxNumber++;
            if(boxNumber > 8){
                boxNumber = 1;
            }
        }

        /*
        HashSet<Map.Entry<Integer,Integer>> mySet = new HashSet<>(imei.entrySet());
        for(Map.Entry<Integer, Integer> a: mySet){
            System.out.println(a);
            }*/

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the key");
            int fromUser = in.nextInt();
            if(fromUser < 30000  || fromUser > 89000){
                System.out.println("There is no IMEI with this number in the box");
                continue;
            }
            if(imei.get(fromUser) == null){
                System.out.println("You already had used this IMEI");
                continue;
            }
            System.out.println(imei.get(fromUser));
            imei.remove(fromUser);
        }

    }

}
