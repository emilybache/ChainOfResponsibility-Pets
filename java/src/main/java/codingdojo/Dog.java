package codingdojo;

public class Dog extends Pet {
    public Dog(Pet nextPet) {
        super(nextPet);
    }

    @Override
    public String handleTrap(Bait bait) {
        // dogs eat anything
        return "fat, sleeping dog";
    }
}
