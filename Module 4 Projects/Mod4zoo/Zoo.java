// Derek Holbrook
// Assignment 17

package Module4.Mod4zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> myZoo = new ArrayList<>();
  
	public void addAnimal(Animal myAnimal) {
    	myZoo.add(myAnimal);
    }  
  
  	public int getSize() {
    	return myZoo.size();
    }
  
  	public void print() {
    	for (Animal myAnimal : myZoo) {
            //System.out.println("Class is: " + myAnimal.getClass().getSimpleName());
            //System.out.println("Sound is: " + myAnimal.getSound());
            System.out.println(myAnimal.getClass().getSimpleName() + " " + myAnimal.getSound());
        }
    }

    public static void main(String[] args) {
        
        Zoo myZoo = new Zoo();

        myZoo.addAnimal(new Catfish(20.11));
        myZoo.addAnimal(new Cheetah(12));
        myZoo.addAnimal(new Catfish(6.03));
        myZoo.addAnimal(new Cheetah(11));
        myZoo.addAnimal(new Catfish(3));
        myZoo.addAnimal(new Cheetah(3));
        myZoo.addAnimal(new Catfish(13.08));
        myZoo.addAnimal(new Cheetah(1));
        myZoo.addAnimal(new Catfish(11.10));
        myZoo.addAnimal(new Cheetah(8));

        myZoo.print();

    }

}

// .getName() showed package name, replaced with .getSimpleName() which just shows class.
