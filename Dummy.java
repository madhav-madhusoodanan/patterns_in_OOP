
/* ==================================================== Subject ==================================================== */
class Subject {
    ArrayList<Observes> observers;

    Subject(){
        observers = new ArrayList<Observes>();
    }

    public void subscribe(Observes ob){
        observers.add(ob);
    }
    public void unsubscribe(Observes ob){
        observers.remove(ob);
    }

    public void informAll(Message msg){
        for (Observes ob:observers) 
            ob.update(msg);
    }
}

/* ==================================================== Observer / Subscriber ==================================================== */
interface Observes {
    public void update(Message msg)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ;
}

abstract class Observer implements Observes {
    Message contents;
    @Override
    public void update(Message msg){
        contents = msg;
        System.out.println(contents.data);
    }
}

class ObserverSmthing extends Observer {}
class Observer123 extends Observer {}
class ObserverStudent extends Observer {}
/* ..... */

/* All the Observer classes */
/* ==================================================== Message ==================================================== */
class Message {
    public String data;
    Message(String info){
        data = info;
    }
}





class Dummy {
    public static void main(String[] args){

    }
}