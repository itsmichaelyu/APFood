public class Cheese extends Food{

    private boolean isMoldy;
    private boolean hasHoles;

    public Cheese (String name, int amount, double weight, boolean isFresh, boolean isGood, int calories, boolean hasBeenEatenByRat, boolean isMoldy, boolean hasHoles) {
        super(name, amount, weight, isFresh, isGood, calories, hasBeenEatenByRat);
        this.isMoldy = isMoldy;
        this.hasHoles = hasHoles;
    }

    public boolean getIsMoldy() {
        return isMoldy;
    }

    public boolean getHasHoles() {
        return hasHoles;
    }

    public void age() {
        isMoldy = true;
    }

    public void addHoles() {
        hasHoles = true;
    }

    @Override
    public boolean getIsGood() {
        return getIsMoldy() ? Math.random() > 0.5 : false;
    }

    @Override
    public String toString() {
        return "name = \"" + getName() + '\"' +
                "\nIs Moldy: " + getIsMoldy() +
                "\nHas Holes: " + getHasHoles() +
                "\nAmount: " + getAmount() +
                "\nWeight: " + getWeight() +
                "\nIs Fresh: " + getIsFresh() +
                "\nIs Good: " + getIsGood() +
                "\nCalories: " + getCalories() +
                "\nEaten by rat 🐀: " + getHasBeenEatenByRat() + "\n";
    }
}