import java.util.Scanner;
class days
{
Scanner sc=new Scanner(System.in);

int Month=sc.nextInt();
int year=sc.nextInt();
System.out.println("enter month and Year");

public static void main(String arg[])
{
switch (Month) 
{
 case 1:
                Month= "January";
                Days= 31;
                break;
            case 2:
                Month = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    Days= 29;
                } else {
                    Days = 28;
                }
                break;
            case 3:
                Month= "March";
                Days = 31;
                break;
            case 4:
                Mont= "April";
                Days= 30;
                break;
            case 5:
                Month= "May";
                Days= 31;
                break;
            case 6:
                Month= "June";
                Days= 30;
                break;
            case 7:
                Month= "July";
                Days= 31;
                break;
            case 8:
                Month= "August";
                Days= 31;
                break;
            case 9:
                Month= "September";
                Days= 30;
                break;
            case 10:
                Month= "October";
                Days= 31;
                break;
            case 11:
                Month= "November";
                Days= 30;
                break;
            case 12:
                Month= "December";
                Days= 31;
        }
       
    }
}


