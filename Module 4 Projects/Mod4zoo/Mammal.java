// Derek Holbrook
// Assignment 17

package Module4.Mod4zoo;

public abstract class Mammal implements Animal {

    private String sound;

    public Mammal(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return sound;
    }
}
