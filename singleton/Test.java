/* Singleton is actually very ez

   It is a way to restrict the number of instances of a class, to one.
   
   The important parts to the class is
        1. private constructor
        2. static instance member of itself within the class
        3. a public function to return that instance
        
 */

class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    /* All the remaining necessary functions for the class can be put below as needed */
    public void speak(){
        System.out.println("lonely...im so lonely....ive nobody.... :(");
    }
}

class Test {
    public static void main(String[] args) {
        Singleton alone = Singleton.getInstance();
        alone.speak();
    }
}