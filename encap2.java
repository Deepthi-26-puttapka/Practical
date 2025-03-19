class encap1
{
private String name;
private double salary;
void setname(String name)
{
this.name=name;
}
void setsalary(double salary)
{
this.salary=salary;
}
String getname()
{
return name;
}
double getsalary()
{
return salary;
}
}
class encap2
{
public static void main(String a[])
{
encap1 e1=new encap1();
e1.setname("depti");
e1.setsalary(500000);
System.out.println("name="+e1.getname());
System.out.println("salary="+e1.getsalary());
}
}



