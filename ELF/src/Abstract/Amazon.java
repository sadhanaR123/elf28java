package Abstract;

public interface Amazon {
void buy();
}
class Cloths implements Amazon
{
	public void buy()
	{
		System.out.println("Buy cloths");
	}
}
class Shoe implements Amazon
{
	public void buy()
	{
		System.out.println("buy shoe");
	}
}
