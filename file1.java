/*streams:sequence of data,in java stream is form of Bytes its called a stream because it is in frorm  of continues flow of values.

java I/O-->input gets process and user get the output
two types of streams
1)INput Stream:reads the data from source()
2)Output Stream:: write the data to destination(file,array,collections,sockats,etc)
o/p is a abstract class
-->Syste.in
System.out,system.err
two types of the data

byte oreinted data1:
Character oriented data:

*/
import java.io.*;
class file1
{

public static void main(String ar[])
{
try
{
FileOutputStream fo =new FileOutputStream("out.txt");
fo.write(65);
fo.close();
System.out.println("file created");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}