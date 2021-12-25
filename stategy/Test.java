/* 
    There are 4 parts in this code
    1. Interfaces
    2. Helper classes (that implement interfaces)
    3. The Main parent class (for which we are writing code, that includes object of helper classes)
    4. The children classes that extend the parent class

    5. and then public static void main ke lye class :)
 */

/* Interfaces */
interface EatBehaviour {
    public void eat();
}
interface BarkBehaviour {
    public void bark();
}

/* Helper classes */
class ProteinDiet implements EatBehaviour {
    @Override
    public void eat(){
        System.out.println("Protein");
    }
}
class NoDiet implements EatBehaviour {
    @Override
    public void eat(){
        System.out.println("No foood");
    }
}

class LoudBark implements BarkBehaviour {
    @Override
    public void bark(){
        System.out.println("VERYYY LOUD");
    }
}
class QuietBark implements BarkBehaviour {
    @Override
    public void bark(){
        System.out.println("smol sound");
    }
}

/* Super class (ek hi hai)*/
abstract class Dog {
    EatBehaviour eatBehaviour;
    BarkBehaviour barkBehaviour;

    public void bark(){
        barkBehaviour.bark();
    }

    public void eat(){
        eatBehaviour.eat();
    }
}

/* Child classes */
class Labrador extends Dog{
    Labrador(){
        eatBehaviour = new ProteinDiet();
        barkBehaviour = new LoudBark();
    }
}
class RobotDog extends Dog{
    RobotDog() {
        eatBehaviour = new NoDiet();
        barkBehaviour = new QuietBark();
    }
}



public class Test {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        RobotDog ultron = new RobotDog();

        lab.bark();
        ultron.bark();
    }
}