/* Abstract factory design pattern involves a family of products, each family having all different variants 
    It must be possible to make a grid of families vs variants.
    lets assume that there are 'n' families and 'm' variants for each family

    A product is a specific variant of a specific family

    think of family as a column of grid cells and variant as a row of grid cells
    The product hance becomes a specific grid cell.
    
    The way it works is:
        1. Make a Factory class for each variant (m classes)
        2. Make a Product class for each product (n * m classes)
        3. Make a Factory producer class that can make any of the Factory class

    Look at the main function to understand clearly how all different parts come together

    PS: implementation code  is omitted on purpose, so that it gets easier to see the whole picture
    PSS: all the functions except describe and main function basically just implement an if/else according to the function argument
*/

/* ======================================= Factory producer class ======================================= */
public class FactoryProducer {
    public static Factory getFactory(String variantName){}
}

/* ======================================= Abstract factory class and its concrete variant classes ======================================= */
public abstract class Factory {
    public Product getProduct(String familyName){}
}

public class Variant1_Factory extends Factory {
    @Override
    public Product getProduct(String familyName){}
}
public class Variant2_Factory extends Factory {
    @Override
    public Product getProduct(String familyName){}
}

/* ======================================= Product interface and its concrete classes' implementation ======================================= */
interface Product {
    public void describe(){}
}

public class Product1_Variant1 implements Product {
    @Override
    public void describe(){}
}
public class Product1_Variant2 implements Product {
    @Override
    public void describe(){}
}
public class Product2_Variant1 implements Product {
    @Override
    public void describe(){}
}
public class Product2_Variant2 implements Product {
    @Override
    public void describe(){}
}


/* ================================================ public static void main ================================================ */
class Test {
    public static void main (String args[]) {
        final String VARIANT1 = "variant1";
        final String VARIANT2 = "variant2";
        final String FAMILY1 = "family1";
        final String FAMILY2 = "family2";

        FactoryProducer fp = new FactoryProducer();
        Factory variant1 = fp.getFactory(VARIANT1);
        Factory variant2 = fp.getFactory(VARIANT2);

        Product family1variant1 = variant1.getProduct(FAMILY1);
        Product family1variant2 = variant2.getProduct(FAMILY1);
        Product family2variant1 = variant1.getProduct(FAMILY2);
        Product family2variant2 = variant2.getProduct(FAMILY2);

        family1variant1.describe();
        family1variant2.describe();
        family2variant1.describe();
        family2variant2.describe();
    }
}