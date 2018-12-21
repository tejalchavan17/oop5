import java.io.*;
class Posting
{   
    public int t1;
    public int t2;
    public int t3;
    private int courseWork;
    private int AptTest;
    private int TechTest;
    private int interview;
    /* Constructor Overloading */
    public Posting(int courseWork,int AptTest,int TechTest,int interview)
    {
        this.courseWork=courseWork;
        this.AptTest=AptTest;
        this.TechTest=TechTest;
        this.interview=interview;
        t1= courseWork+AptTest+TechTest+interview;
        if(t1>=80)
               System.out.println("Employee is eliglible for post of Programmer");
        else
               System.out.println("Not eliglible for post of Programmer because total score is less then 80");
    }
    public Posting(int TechTest,int interview)
    {
        this.TechTest=TechTest;
        this.interview=interview;
        t2=TechTest+interview;
        if(t2>=85)
            System.out.println("Employee is eliglible for post of Team Leader");
        else
            System.out.println("Not eliglible for post of Team Leader because total score is less then 85");
    }
    public Posting(int interview)
    {
        t3=interview;
        if(t3>=90)
            System.out.println("Employee is eliglible for post of Project Manager");
        else
            System.out.println("Not eliglible for post of Project Manager because total score is less then 90");
    }
}
class Post
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch;
        System.out.println("1.Programmer");
        System.out.println("2.Team Leader");
        System.out.println("3.Project Manager");
        System.out.println("Enter your Choice");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:  System.out.println("Enter marks of coursework");
                    int cw=Integer.parseInt(br.readLine());
                    System.out.println("Enter marks of apttest");
                    int at=Integer.parseInt(br.readLine());
                    System.out.println("Enter marks of techtest");
                    int tt=Integer.parseInt(br.readLine());
                    System.out.println("Enter marks of interview");
                    int i=Integer.parseInt(br.readLine());
                    Posting p1=new Posting(cw,at,tt,i);
                    break;
            case 2: 
                    System.out.println("Enter marks of techtest");
                    int tt1=Integer.parseInt(br.readLine());
                    System.out.println("Enter marks of interview");
                    int i1=Integer.parseInt(br.readLine());
                    Posting p2=new Posting(tt1,i1);
                    break;
            case 3: 
                    System.out.println("Enter marks of interview");
                    int i2=Integer.parseInt(br.readLine());
                    Posting p3=new Posting(i2);
                    break;
            default: System.out.println("wrong choice");
                
        }
    }
}

output:

C:\prog>javac Post.java

C:\prog>java Post
1.Programmer
2.Team Leader
3.Project Manager
Enter your Choice
1
Enter marks of coursework
10
Enter marks of apttest
20
Enter marks of techtest
30
Enter marks of interview
20
Employee is eliglible for post of Programmer

2nd output:
C:\prog>java Post
1.Programmer
2.Team Leader
3.Project Manager
Enter your Choice
2
Enter marks of techtest
40
Enter marks of interview
40
Not eliglible for post of Team Leader because total score is less then 85

3rd output:
C:\prog>java Post
1.Programmer
2.Team Leader
3.Project Manager
Enter your Choice
3
Enter marks of interview
90
Employee is eliglible for post of Project Manager

