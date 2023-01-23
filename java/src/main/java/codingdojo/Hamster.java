package codingdojo;

public class Hamster extends Pet {
    public Hamster(Pet nextPet) {
        super(nextPet);
    }

    @Override
    public String handleTrap(Bait bait) {
        if (bait == Bait.POPCORN)
            return "happy hamster";
        else
            return nextPet.handleTrap(bait);
    }
}
