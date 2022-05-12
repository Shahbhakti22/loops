import java.util.Scanner;

public class loop_ip_from_user {

    public static void main (String args[])
    {

        System.out.println("enter starting point n ending point:");
        Scanner sc=new Scanner(System.in);

        int a,b;
        System.out.println("enter starting point:");
        a= sc.nextInt();
        System.out.println("enter ending point:");
        b= sc.nextInt();

        for (int i=a;i<=b;i++)
        {
            System.out.println(i);
        }

    }
}
