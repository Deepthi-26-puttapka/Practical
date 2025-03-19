import java.util.ArrayList;

 class student {

    String name;
    int id;
    int roolno;
    student(String name,int id,int roolno)
    {
        this.name=name;
        this.roolno=roolno;
        this.id=id;
    }
}
  class adddata
{
    ArrayList<student> studentData()
    {
        student s1=new student("deepu",1289,01);
        student s2=new student("divya",1200,02);
        student s3=new student("puja",1300,03);


        ArrayList<student> studentlist=new ArrayList<student>();

                studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        return studentlist;
    }
}
public class retrivestudents
{
    public static void main(String ar[])
    {
        adddata data=new adddata();
        ArrayList<student> li=data.studentData();
                for(student st:li)
                {
                    System.out.println("students name:"+st.name);
                    System.out.println("students id:"+st.id);
                    System.out.println("students rollno:"+st.roolno);
                }
    }
}
