package ObjectclassHashcode;

public class Arrayobject {
String name;
int eid;
Arrayobject(String name,int eid)
{
	this.name=name;
	this.eid=eid;
}
public static void main(String[] args) {
 	Arrayobject	 a1=new Arrayobject("sadhana",123);
 	Arrayobject a2=new Arrayobject("Raksha",143);
 	Arrayobject a[]=new Arrayobject[2];
 	a[0]=a1;
 	a[1]=a2;
 	for(int i=0; i<a.length; i++)
 	{
 		System.out.println(a[i].name+" "+a[i].eid);
 	}
}
}
