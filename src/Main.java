public class Main {
    public static void main(String[] args) {
        Food Apple = new Food("Apple", 10, 20,false, false, 2000);
        Steak Stek = new Steak("Filet Mignon",10, 20, true,false, 100, Steak.Rareness.EXTRA_RARE, Steak.Chef.CHEF);
        Cheese Cheddar = new Cheese("Cheddar", 10, 20, true,false, 100, true, true);
        System.out.println(Apple.toString());
        System.out.println(Stek.toString());
        System.out.println(Cheddar.toString());

    }

}