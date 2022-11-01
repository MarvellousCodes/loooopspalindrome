public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        int leftDigit = 0;
        int rightDigit = 0;

        for (int i = 100; i <= 999; i++)
        {
            leftDigit = i / 100;
            rightDigit = i % 10;

            if (leftDigit == rightDigit)
            {
                count++;
                System.out.print(i + "\t");
            }

        }
        System.out.println("\n There are " + count + " three digit palindrome.");
    }
}
