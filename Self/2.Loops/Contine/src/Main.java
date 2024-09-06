public class Main {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  //skiping a itearation
            }
            System.out.println(i);
            //System.out.println("Hello world!");
        }
    }
}