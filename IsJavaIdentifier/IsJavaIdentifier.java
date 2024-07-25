public class IsJavaIdentifier
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 128; i++)
        {
            boolean isStart = Character.isJavaIdentifierStart(i);
            boolean isPart = Character.isJavaIdentifierPart(i);
            System.out.print((char)i);
            System.out.print(" ");
            System.out.print(isStart);
            System.out.print(" ");
            System.out.println(isPart);
        }
        char zmienna = '\uu0081';
        System.out.println(zmienna);

        double iloraz = 18.5/2;
        System.out.println(iloraz);

        System.out.println(StrictMath.log(3));

        short a = 2;
        short b = 3;
        var wynik = a + b;
    }
}