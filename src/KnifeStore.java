public abstract class KnifeStore {

//    creator class that contains methods that only operate on generalizations.
//    The Factory Method is declared by the Creator abstractly, so that each Concrete
//        Creator class is obliged to provide a Factory Method

    //This only requires changing code in the Factory, or
    //to the concrete instantiation, and not in this client method.

    //https://medium.com/swlh/creational-design-pattern-factory-method-2bf56676111b

    public Knife orderKnife(String knifeType) {
        Knife theKnife;
        theKnife = createKnife(knifeType);
        theKnife.sharpen();
        theKnife.polish();
        theKnife.packageKnife();

        return theKnife;
    }

    protected abstract Knife createKnife(String knifeType);


}
