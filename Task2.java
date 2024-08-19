import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        System.out.println("welcome to Grade Calculator");
        System.out.println("enter your marks out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.print(" MATHS:");
        int a = sc.nextInt();
        System.out.print(" english:");
        int b = sc.nextInt();
        System.out.print(" science:");
        int c = sc.nextInt();
        System.out.print(" gujarati:");
        int d = sc.nextInt();
        System.out.print(" hindi:");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        int avg = sum/5;
        System.out.print("the sum of all subjects is(out of 500):");
        System.out.println(sum);
        System.out.print("the average percentage is:");
        System.out.println(avg);
        if(avg>90)
        {
            System.out.println("congratulations! you got A grade");
        }
        else if (avg<=90 && avg>70)
        {
            System.out.println("keep it up:) you got B grade");
        }
        else if (avg<=70 && avg>50)
        {
            System.out.println("well done! you got C grade");
        }
        else if (avg<=50 && avg>=33)
        {
            System.out.println("nice try! you got D grade");
        }
        else
        {
            System.out.println("sorry,you did not pass! try next time");
        }
    }
}

