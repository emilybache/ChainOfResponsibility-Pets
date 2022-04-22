public class Cat : Pet
{
    public override string HandleTrap(Bait bait)
    {
        if (bait == Bait.SAUSAGE)
            return "purring cat";
        else
            return nextPet.HandleTrap(bait);
    }

    public Cat(Pet nextPet) : base(nextPet)
    {
    }
}