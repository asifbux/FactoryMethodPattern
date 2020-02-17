public class BudgetChefsKnife extends Knife {

    // Type of Product

    @Override
    public void type() {
        System.out.println("I am Chefs Knife");
    }

    @Override
    public void sharpen() {
        System.out.print("Chefs ");
        super.sharpen();
    }

    @Override
    public void polish() {
        System.out.print("Chefs ");
        super.polish();
    }

    @Override
    public void packageKnife() {
        System.out.print("Chefs ");
        super.packageKnife();
    }
}
