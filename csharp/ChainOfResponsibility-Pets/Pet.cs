public class Pet
{
    protected Pet nextPet;

    public Pet NextPet
    {
        get => nextPet;
        set => nextPet = value ?? throw new ArgumentNullException(nameof(value));
    }

    public Pet(Pet nextPet)
    {
        this.nextPet = nextPet;
    }

    public virtual string HandleTrap(Bait bait)
    {
        throw new NotImplementedException();
    }


}