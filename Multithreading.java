class Person extends Thread {
    Person(String name){
        super(name);
    }
    Person(){
        super();
    }

    @Override
    public void run(){
        System.out.println(this.getName() + " Thread");
    }
}



class Multithreading {
    public static void main (String[] args) {
        Person p1 = new Person("Tikesh");
        Person p2 = new Person("Shashank");

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
    }
}