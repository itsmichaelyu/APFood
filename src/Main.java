public class Main {
    public static void main(String[] args) {
//        test
        Food Apple = new Food("Apple", 10, 20.12,true, false, 2000, false);
        Steak Stek = new Steak("Filet Mignon",1, 2.23, true,true, 1000, true, Steak.Rareness.EXTRA_RARE, Steak.Chef.CHEF);
        Cheese Cheddar = new Cheese("Cheddar", 5, 20.93, false,false, 1500, true, false, true);
        System.out.println(Apple.toString());
        System.out.println(Stek.toString());
        System.out.println(Cheddar.toString());

    }

}