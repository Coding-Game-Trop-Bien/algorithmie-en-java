package com.lower.price;

import java.util.Scanner;

public class PrixLePlusBas {
    public static void main(String[] args) {
        String product="", current="";
        int line=0, total=0, lowerPrice=0, price=0;
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            total=sc.nextInt();
        }

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        if(sc.hasNext()){
            product=sc.next();
        }

        while(line++<total){

            sc.nextLine();

            if(sc.hasNext()){
                current=sc.next();
            }

            if(sc.hasNextInt()){
                price=sc.nextInt();
                lowerPrice=(product.equals(current) && (price<lowerPrice || lowerPrice==0)) ? price : lowerPrice;
            }

        }

        sc.close();
        System.out.println(lowerPrice);
    }
}
