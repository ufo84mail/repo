public class Vodeno
{
    public static void main(String[] args)
    {
        int arg1 = 6;//Integer.parseInt(args[0]);
        int arg2 = 4;//Integer.parseInt(args[1]);

        int[] result = calc(arg1, arg2);
    }

    public static int[] calc(int arg1, int arg2)
    {
        int[] result = new int[3];

        int multiplication = arg1 * arg2;
        result[0] = multiplication;

        int divide = arg1 / arg2;
        result[1] = divide;

        int modulo = arg1 % arg2;
        result[2] = modulo;

        return result;
    }
}
