//synchorized block creste instanec class
class data
{
void dispaly(int n)
{
synchronized(this)
{
try{
for(int i=1;i<n;i++)
{
System.out.println(i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class thread1 extends Thread
{
data d;
thread1(data d)
{
this.d=d;
}
public void run()
{
d.display(10);
}
}

class thread2 extends Thread
{
data d1;
thread1(data d1)
{
this.d1=d;
}
public void run()
{
d1.display(5);
}
}

class block
{
public static void main(String ar[])
{
data d=new data();
thread1 ob=new thread1();
thread2 obj=new thread2();
ob.start();
obj.start();
}
}


