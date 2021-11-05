import org.jetbrains.annotations.NotNull;

public class Food{

    private String name;
    private int amount;
    private double weight;
    private boolean isFresh;
    private boolean isGood;
    private int calories;
    private boolean hasBeenEatenByRat;

    public Food(String name, int amount, double weight, boolean isFresh, boolean isGood, int calories, boolean hasBeenEatenByRat) {
        this.name = name;
        this.amount = amount;
        this.weight = weight;
        this.isFresh = isFresh;
        this.isGood = isGood;
        this.calories = calories;
        this.hasBeenEatenByRat = hasBeenEatenByRat;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getIsFresh() {
        return isFresh;
    }

    public boolean getIsGood(){
        return isGood;
    }

    public int getCalories() {
        return calories;
    }

    public boolean getHasBeenEatenByRat() {
        return hasBeenEatenByRat;
    }

    public void eat(){
        weight-=weight/=amount;
        calories-=calories/=amount;
        amount--;
    }

    public void throwUp(){
        weight+=weight/=amount;
        calories-=calories/=amount;
        amount++;
        isGood = false;
        isFresh = false;
    }

    public void eatByRat(){
        hasBeenEatenByRat = true;
    }

    public void rate(boolean isGood){
        this.isGood = isGood;
    }

    public boolean run(String command) {
        switch (command) {
            case "eat": eat(); return true;
            case "throw up": throwUp(); return true;
            case "feed rats": eatByRat(); return true;
            case "good": rate(true); return true;
            case "bad": rate(false); return true;
            case "help": System.out.println("Options: eat, throw up, feed rats, good, bad"); return false;
            default: return false;
        }
    }

    public String toString(){
        return "Name: \"" + getName() + "\"" +
                "\nAmount: " + getAmount() +
                "\nWeight: " + getWeight() +
                "\nFresh: " + getIsFresh() +
                "\nGood: " + getIsGood() +
                "\nCalories: " + getCalories() +
                "\nEaten by rat 🐀: " + getHasBeenEatenByRat() + "\n";
    }


}