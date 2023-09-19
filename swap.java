// Write a Java program to swap two numbers with the help of a third variable.
public class swap
{
    public static void main (String[] args)
    {
        int number = 2;
        int value = 3;
        int temp = number;
        number = value;
        value= temp;
        System.out.print(number+" "+value);

    }
}
