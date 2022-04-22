var chainOfResponsibility = new Hamster(new Cat(new Dog(null)));
var allBaits = new Dictionary<int, Bait>()
{
    {1, Bait.POPCORN},
    {2, Bait.SAUSAGE},
    {3, Bait.CHOCOLATE_CAKE},
};

Console.WriteLine($"What kind of bait do you want to use in your trap? (choose number from list)");
foreach (var bait in allBaits)
{
    Console.WriteLine($"{bait.Key} - {bait.Value}");
}

var chosenBait = 3;
Int32.TryParse(Console.ReadLine(), out chosenBait);
Console.WriteLine($"You chose to use bait {allBaits[chosenBait]}");

var response = chainOfResponsibility.HandleTrap(allBaits[chosenBait]);

Console.WriteLine($"The bait was taken! Trap contents: {response}");
