class engine
{
private String type'
private int horsepower;
engine(String type,int horsepower)
{
this.type=type;
this.horsepower=horsepower;
}
public String gettype()
{
return type;
}
public int horsepower()
{
return horsepower;
}
public void settype(String type)
{
this.type=type;
}
public void sethorsepower(int horsepower)
{
this.horsepower=horsepower;
}
}
public class car
{
private final String name;
private final Engine engine;
public car(String name,Engine engine)
{
this.name=name;
this.engine=engine;
}
public String getname()
{return name;
}
public Engine getengine()
{
return engine;
} 
}
public class test{
public static void main(String ar[])
{
engine engn=new engine("petrol",300);
car car=new car("benz",engn);
System.out.println("name of the car:" +car.getname()+) 