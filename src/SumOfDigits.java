public class SumOfDigits {
    static int Sum(int n)
    {
        int sum = 0;

        while (n != 0)
        {
            sum +=  n % 10;
            n = n/10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int n = 687;

        System.out.println(Sum(n));
    }
}
