import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int base;
        int converted;
        int base10 = 0;
        int base8 = 0;
        int nvalue;
        int ncount = 0;

        System.out.println("Base Conversions!");
        System.out.println("What base are you choosing?");
        base = in.nextInt();
        System.out.println("What is your n value?");
        nvalue = in.nextInt();

        if(base == 2)
        {
            for(int i = 0; i< 1000; i++)
            {
                if(ncount == nvalue)
                {
                    break;
                }
                else
                {
                    if(i != 0 && i !=1)
                    {

                    }
                    ncount++;
                }
            }
        }
        else if(base == 8)
        {
            for(int i = 0; i< 1000; i++)
            {
                if(ncount == nvalue)
                {
                    break;
                }
                else
                {

                }
            }
        }
        else if(base == 10)
        {
            for(int i = 0; i< 1000; i++)
            {
                if(ncount == nvalue)
                {
                    break;
                }
                else
                {

                }
            }
        }
        else
        {
            System.out.println("Invalid Base!");
        }
    }
}