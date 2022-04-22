public class Hamster : Pet
{
    public override string HandleTrap(Bait bait)
    {
        if (bait == Bait.POPCORN)
            return "happy hamster";
        else
            return nextPet.HandleTrap(bait);
    }

    public Hamster(Pet nextPet) : base(nextPet)
    {
    }
}