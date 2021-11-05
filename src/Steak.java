import java.util.*;

public class Steak extends Food {

    public enum Rareness {
        EXTRA_RARE(115), RARE(125), MEDIUM_RARE(130), MEDIUM(140), MEDIUM_WELL(150), WELL_DONE(160), BURNT(1000);

        private int temp;

        Rareness(int temp) {
            this.temp = temp;
        }

        public int getTemp() {
            return temp;
        }
    }

    public enum Chef {
        LORENZO(7), JOHNNY(12), MARKUS(25), EDWARD(97), CHEF(100);

        private int skill;

        Chef (int skill) {
            this.skill = skill;
        }

        public int getSkill() {
            return skill;
        }

        public void train(int i) {
            skill+= i;
        }

    }

    private Rareness rareness;
    private Chef chef;

    public Steak(String name, int amount, double weight, boolean isFresh, boolean isGood, int calories, boolean hasBeenEatenByRat, Rareness rareness, Chef chef) {
        super(name, amount, weight, isFresh, isGood, calories, hasBeenEatenByRat);
        this.rareness = rareness;
        this.chef = chef;
    }

    public Rareness getRareness() {
        return rareness;
    }

    public int getTemp() {
        return rareness.getTemp();
    }

    public Chef getChef() {
        return chef;
    }

    public int getChefSkill() {
        return chef.getSkill();
    }

    public void cook() {
        boolean temp = false;
        for (Rareness r : Rareness.values()) {
            if (temp) {
                rareness = r;
                break;
            }
            temp = r == rareness;
        }
    }

    public void freeze() {
        boolean temp = false;
        System.out.println(Arrays.toString(Rareness.values()));
        Rareness[] tempRare = Rareness.values();
        Collections.reverse(Arrays.asList(tempRare));
        for (Rareness r : tempRare) {
            if (temp) {
                rareness = r;
                break;
            }
            temp = r == rareness;
        }
    }

    @Override
    public boolean run(String command) {
        switch (command) {
            case "eat": eat(); return true;
            case "throw up": throwUp(); return true;
            case "feed rats": eatByRat(); return true;
            case "good": rate(true); return true;
            case "bad": rate(false); return true;
            case "cook": cook(); return true;
            case "freeze": freeze(); return true;
            case "help": System.out.println("Options: eat, throw up, feed rats, good, bad, cook, freeze"); return false;
            default: return false;
        }
    }

    @Override
    public boolean getIsGood() {
        return chef.getSkill() > 50;
    }

    @Override
    public String toString() {
        return "Name = \"" + getName() + '\"' +
                "\nChef: " + getChef() +
                "\nChef Skill: " + getChefSkill() +
                "\nRareness: " + getRareness() +
                "\nTemp: " + getTemp() +
                "\nAmount: " + getAmount() +
                "\nWeight: " + getWeight() +
                "\nIs Fresh: " + getIsFresh() +
                "\nIs Good: " + getIsGood() +
                "\nCalories: " + getCalories() +
                "\nEaten by rat 🐀: " + getHasBeenEatenByRat() + "\n";
    }
}