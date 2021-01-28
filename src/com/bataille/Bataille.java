package com.bataille;

import java.util.*;

public class Bataille {

    public void main() {

        int tour=0, tours=0, a=0, b=0, aTot=0, bTot=0;
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextLine()){
            tours=Integer.valueOf(sc.nextLine());
        }

        aTot=0; bTot=0;
        while(tour++<tours) {
            a=sc.nextInt();
            b=sc.nextInt();

            if(a>b){
                aTot++;
            } else if(b>a) {
                bTot++;
            }

            sc.nextLine();
        }

        sc.close();
        System.out.println(aTot > bTot ? "A" : "B");

    }
}

