import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Food Apple = new Food("Apple", 10, 20.12,true, false, 2000, false);
        Steak Stek = new Steak("Filet Mignon",1, 2.23, true,true, 1000, true, Steak.Rareness.EXTRA_RARE, Steak.Chef.CHEF);
        Cheese Cheddar = new Cheese("Cheddar Cheese", 5, 20.93, false,false, 1500, true, false, true);

        System.out.println(Apple.toString());
        System.out.println(Stek.toString());
        System.out.println(Cheddar.toString());

        Food[] list = {Apple, Stek, Cheddar};
        int foodNum = -1;

        while (true) {
                foodNum = -1;
                while (foodNum == -1){
                    System.out.println("Enter food type (apple, stek, cheddar): ");
                    switch (scan.nextLine()) {
                        case "apple":
                            foodNum = 0;
                            break;
                        case "stek":
                            foodNum = 1;
                            break;
                        case "cheddar":
                            foodNum = 2;
                            break;
                        }
                }
                String temp = "";
                while (!list[foodNum].run(temp)) {
                    System.out.println("Enter a command (type \"help\" for more options):");
                    temp = scan.nextLine();
                };
                System.out.println("\n"+list[foodNum].toString());

        }

    }

}