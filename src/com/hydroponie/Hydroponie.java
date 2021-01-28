package com.hydroponie;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hydroponie {
    public static void main(String[] args) {

        String f1="au_centre.txt";
        String f2="au_bord.txt";
        String f3="au_bord_oppose.txt";
        String f4="en_couple.txt";
        String f5="moyen.txt";
        String f6="grand.txt";


        InputStream fStream= Hydroponie
                .class
                .getResourceAsStream("/resources/hydroponie/en_couple.txt");

        Scanner sc = new Scanner(fStream);

        int n=0;
        while (sc.hasNextInt()){
            n=sc.nextInt();
            sc.nextLine();
        }

        System.out.println("width :"+n);

        List<Part> parts=new ArrayList<Part>(n*n);

        int j=0;
        String line="";
        while (sc.hasNextLine()){
            line=sc.nextLine();

            for (int i=0; i<n; i++) {
                String identifier=String.valueOf(line.charAt(i));
                Part part=new Part(identifier);
                parts.add(n*j+i, part);
            }

            j++;
        }

        for (int u=0; u<parts.size(); u++) {
            Part part=parts.get(u);
            if (part.getCltrType().equals(CltrType.E)) {
                System.out.println("evap :"+u);
                List<Integer> neighbours=new ArrayList<>();

                if(u%n!=0){
                    neighbours.add(u - n - 1);
                    neighbours.add(u - 1);
                    neighbours.add(u + n - 1);
                }

                if(u%n!=n-1){
                    neighbours.add(u - n + 1);
                    neighbours.add(u + 1);
                    neighbours.add(u + n + 1);
                }

                if (u-n>=0){
                    neighbours.add(u - n);
                }

                if (u+n<parts.size()){
                    neighbours.add(u + n);
                }

                for (int neighbourIdx:neighbours) {
                    if (neighbourIdx>=0 && neighbourIdx<parts.size()) {
                        Part neighbour=parts.get(neighbourIdx);
                        neighbour.setCultive(neighbour.getCltrType().equals(CltrType.C));
                    }
                }
            }
        }

        long cultivable=parts.stream()
                .filter(part -> part.isCultive())
                .count();

        System.out.println(cultivable);
    }
}
