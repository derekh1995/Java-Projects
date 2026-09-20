// Derek Holbrook
// Assignment 16

package Module4;

import java.util.ArrayList;

public class Cereal {
    
    String name;
    String color;
    int caloriesPerServing;
    boolean hasGluten;

    public Cereal(String a, String b, int c, boolean d) {
        name = a;
        color = b;
        caloriesPerServing = c;
        hasGluten = d;
    }

    public Cereal(String a, int b) {
        name = a;
        caloriesPerServing = b;
        color = "yellow";
        hasGluten = false;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public boolean hasGluten() {
        return hasGluten;
    }

    public static void main(String[] args) {
        
        ArrayList<Cereal> myList = new ArrayList<>();

        Cereal myCereal1 = new Cereal("Cheerios", 100);
        myList.add(myCereal1);

        Cereal myCereal2 = new Cereal("Cookie Crisps", "brown", 140, true);
        myList.add(myCereal2);

        Cereal myCereal3 = new Cereal("Muesli", "tan", 500, true);
        myList.add(myCereal3);

        Cereal myCereal4 = new Cereal("Lucky Charms", "rainbow", 250, false);
        myList.add(myCereal4);

        Cereal myCereal5 = new Cereal("Honey Bunches of Oats", 150);
        myList.add(myCereal5);


        for (Cereal cereals : myList) {
            if (cereals.getCaloriesPerServing() > 200) {
                if (cereals.hasGluten()) {
                    System.out.println(cereals.getName() + " | " + cereals.getColor() + " | " + "!" + "*");
                }
                else if (!cereals.hasGluten()) {
                    System.out.println(cereals.getName() + " | " + cereals.getColor() + " | " + "!");
                }
                }
            
            else if (cereals.getCaloriesPerServing() < 200) {
                if (cereals.hasGluten()) {
                    System.out.println(cereals.getName() + " | " + cereals.getColor() + " | " + "+" + "*");
                }
                else if (!cereals.hasGluten()) {
                    System.out.println(cereals.getName() + " | " + cereals.getColor() + " | " + "+");
                }
                

            }
        }

    }

}
