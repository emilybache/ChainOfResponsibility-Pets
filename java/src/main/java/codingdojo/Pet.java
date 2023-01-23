package codingdojo;

import org.apache.commons.lang3.NotImplementedException;

public class Pet {
    protected Pet nextPet;
    public Pet(Pet nextPet) {
        this.nextPet = nextPet;
    }
    public String handleTrap(Bait bait) {
        throw new NotImplementedException("That is an unknown pet");
    }
}
