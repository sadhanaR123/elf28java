package ObjectclassHashcode;

class Driver
{
	String name;
	int eid;
	Driver(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
}
public class Emp {
	public static void main(String[] args) {
		Driver d1=new Driver("sadhana",23);
		Driver d2=new Driver("Pachhu",345);
		Driver e[]=new Driver[2];
		e[0]=d1;
		e[1]=d2;
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i].name+" "+e[i].eid);
		}
		
	}

}
