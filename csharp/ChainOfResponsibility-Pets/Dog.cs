public class Dog : Pet
{
    public override string HandleTrap(Bait bait)
    {
        // dogs eat anything
        return "fat, sleeping dog";
    }

    public Dog(Pet nextPet) : base(nextPet)
    {
    }
}