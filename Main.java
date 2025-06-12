public class Main {
    public static void main(String[] args) {
        System.out.println(" Welcome to CS 112!");
        
        System.out.println("Your new number is: " + Main.returnNum(3));

        Butterfly butterfly = new Butterfly();
        Butterfly butterfly1 = new Butterfly("Red Admiral", 4);

        System.out.println(butterfly);
        System.out.println(butterfly1);
    }


    public static void nonmain() {
        
        System.out.println("Hellooooo, this is my first lab for CS 112!");

    }



    public static int returnNum(int num)
    {
        return(num+1);
    }

}
