package codingdojo;

public class Cat extends Pet {
    public Cat(Pet nextPet) {
        super(nextPet);
    }

    @Override
    public String handleTrap(Bait bait) {
        if (bait == Bait.SAUSAGE)
            return "purring cat";
        else
            return nextPet.handleTrap(bait);
    }
}
