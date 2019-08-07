package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        Integer calo;
                        Float energy;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	calo = cal.calculateCalories(bread);
                        	System.out.println(4.1868 * calo + " kJ of energy generated from " + (float)calo+ " calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	calo = cal.calculateCalories(bread, jam);
                        	System.out.println(4.1868 * calo + " kJ of energy generated from " + (float)calo+ " calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	calo = cal.calculateCalories(bread, jam, butter);
                        	System.out.println(4.1868 * calo + " kJ of energy generated from " + (float)calo+ " calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            int calculateCalories(int bread) {
            	return 74 * bread;
            }
            
            int calculateCalories(int bread, int jam) {
                	return (74 * bread) + (26 * jam);
                }
            
            int calculateCalories(int bread, int jam, int butter) {
                	return (74 * bread) + (26 * jam) + (102 * butter);
                }
            
            
            
}