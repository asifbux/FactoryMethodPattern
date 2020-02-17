public class KnifeStoreApp {

    public static void main(String[] args) {

        BudgetKnifeStore aStore = new BudgetKnifeStore();

        // creation of a knife
        BudgetSteakKnife steakKnife;

        steakKnife = (BudgetSteakKnife) aStore.createKnife("steak");

        steakKnife.type();

        // Ordering the Knife
        BudgetSteakKnife steakKnife2 = (BudgetSteakKnife) aStore.orderKnife("steak");


    }
}
