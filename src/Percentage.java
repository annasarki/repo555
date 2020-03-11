public class Percentage {
    static int per(int a, int b)
    {
        float result =0;
        result =((b - a) * 100) / a;

        return (int)result;
    }
    public static void main(String[] args)
    {
        int a =20, b =25;

        System.out.println(per(a,b)+"%");
    }
}
