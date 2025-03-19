//DeadLock---> not realsing the lock also not give chance to other thread

class abc
{
void display(abc obj1)
{
System.out.println("thread1 is waiting for thread2 relase the lock");
synchronized(obj1)
{
System.out.println("DeadLock Occured");
}
}

void display1(abc obj2)
{
System.out.println("thread2 is waiting for thread1 relase the lock");
synchronized(obj2)
{
System.out.println("DeadLock Occured");
}
}
}

class bcd extends Thread
{
abc obj1,obj2;
bcd(abc obj1,abc obj2)
{
this.obj1=obj1;
this.obj2=obj2;
}
public void run()
{
synchronized(obj1)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
obj2.display1(obj2);
}
}
}
class def extends Thread
{
abc obj1,obj2;
def(abc obj1,abc obj2)
{
this.obj1=obj1;
this.obj2=obj2;
}
public void run()
{
synchronized(obj2)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
obj1.display(obj1);
}
}
}
class Dead
{
public static void main(String ar[])
{
abc obj1=new abc();
abc obj2=new abc();
bcd t1=new bcd(obj1,obj2);
def t2=new def(obj1,obj2);
t1.start();
t2.start();
}
}


