package Abstract;

public interface Audi {
void wheel();
void engine();
void brek();
}
class Audi_4 implements Audi
{
	public void wheel()
	{
		System.out.println("super wheel");
	}
	public void engine()
	{
		System.out.println("alloy engine");
	}
	public void brek()
	{
		System.out.println("Break");
	}
}

