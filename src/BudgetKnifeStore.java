public class BudgetKnifeStore extends KnifeStore {

//    Concrete Creator that is responsible for concrete instantiation. The Concrete Creator inherits methods from the abstract Creator.
//    There should be a factoryMethod in the concrete creator subclass. Every time a Concrete Creator subclass is added to the design, the factoryMethod() must be defined to make the right products.
//    This is how the subclass “decides” to create objects.
//            Finally, the Product superclass generalizes the Concrete Products.
//The methods of the Concrete Creator class only operate on the general Product, never the Concrete Products. ????
// The Concrete Products are made by the Concrete Creator. The type of product made is decided by which Concrete Creator is made.
    @Override
    // Below is the FactoryMethod();
    protected Knife createKnife(String knifeType) {
        if(knifeType.equals("steak")) {
            System.out.println("Steak Knife has been created in the FactoryMethod");
            return new BudgetSteakKnife();
        }
        if(knifeType.equals("chefs")) {
            System.out.println("Chefs Knife has been created in the FactoryMethod");
            return new BudgetChefsKnife();
        }
        return null;
    }
}
