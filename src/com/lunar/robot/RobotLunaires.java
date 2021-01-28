package com.lunar.robot;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class RobotLunaires {
    public static void main(String[] args) throws FileNotFoundException {

        InputStream inputStream=RobotLunaires
                .class
                .getResourceAsStream("/resources/lunar-robot/exemple.txt");
        Scanner sc = new Scanner(inputStream);

        int x_top=0, y_top=0, x=0, y=0;
        String orientation="";
        String instructions="";

        x_top=sc.nextInt();
        y_top=sc.nextInt();
        sc.nextLine();

        while(sc.hasNextLine()) {

            x=sc.nextInt();
            y=sc.nextInt();
            orientation=sc.next();

            sc.nextLine();
            instructions=sc.nextLine();

            Robot rbt=new Robot(x, y, Orientation.valueOf(orientation));
            System.out.println(rbt.toString());

            for(int i=0; i<instructions.length(); i++){
                String rotation=String.valueOf(instructions.charAt(i));
                switch(Movement.valueOf(rotation)){
                    case M:
                        rbt.moveForward();
                        break;
                    case L:
                        rbt.turnLeft();
                        break;
                    case R:
                        rbt.turnRight();
                        break;
                    default:
                        break;
                }
                System.out.println(rbt.toString());
            }

            System.out.println(rbt.toString());

        }
    }
}
