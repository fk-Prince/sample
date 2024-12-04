/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product type: ");
        String type = sc.nextLine();

        System.out.println("Enter product type: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter percentage: ");
        double percentage = Double.parseDouble(sc.nextLine());

        updateProduct(type, id, percentage);
    }

    public static void updateProduct(String type, int id, double percentage) {
        try {
            File file = new File("Product.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
         
            while ((line = br.readLine()) != null) {
                String[] lines = line.split(",");
                //double newSellingPrice = Double.parseDouble(lines[4]) * (1 + (percentage / 100.0));   markup ni 
                //double newSellingPrice = Double.parseDouble(lines[4]) * (1 - (percentage / 100.0));   markdwn ni
                if (type.equals(lines[0]) && id == Integer.parseInt(lines[1])) {

                    
                } else {
                  
                }
            }

          
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
