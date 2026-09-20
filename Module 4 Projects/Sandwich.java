// Derek Holbrook
// Assignment 15

package Module4;

public class Sandwich {
    
    String meat;
    String cheese;
    String bread;
    String extras;

    public Sandwich(String a, String b, String c, String d) {
        meat = a;
        cheese = b;
        bread = c;
        extras = d;
    }

    public Sandwich(String a, String b) {
        meat = a;
        cheese = b;
        bread = "white";
        extras = "";
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getBread() {
        return bread;
    }

    public String getExtras() {
        return extras;
    }

    public String toString() {
        return "Sandwich with " + bread + " bread, " + meat + " meat, " + cheese + " cheese, and " + extras + " for extras.";
    }


    public static void main(String[] args) {
        
        Sandwich mySandwich = new Sandwich("ham", "cheddar");
        System.out.println(mySandwich);

        Sandwich myOtherSandwich = new Sandwich("pastrami", "provolone", "rye", "pickles and mustard");
        System.out.println(myOtherSandwich);

    }

}
