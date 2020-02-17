public class BudgetSteakKnife extends Knife {

    // Type of Product

    public void type() {
        System.out.println("I am a steak knife");
    }

    @Override
    public void sharpen() {
        System.out.print("Steak ");
        super.sharpen();
    }

    @Override
    public void polish() {
        System.out.print("Steak ");
        super.polish();
    }

    @Override
    public void packageKnife() {
        System.out.print("Steak ");
        super.packageKnife();
    }
}
