import java.util.*;
/* There are 2 parts in observer
    1. Subject (attention seeker)
    2. Observer (attention giver) 
    3. Message content

    Subject has the reponsibility of informing all the observers

    The observer has the reponsibility of updating itself with new information, when it comes
*/

/* ================================================= Subject (The class that all the observers are looking at) ================================================= */
interface Subjected {
    public void informAll(Message msg);
    public void addObserver(Observer ob);
    public void removeObserver(Observer ob);

}
class Subject implements Subjected {
    public ArrayList<Observer> observers;
    Subject(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void informAll(Message msg){
        for(Observer ob:observers)
            ob.update(msg);
    }

    @Override
    public void addObserver(Observer ob){
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob){
        observers.remove(ob);
    }
}

/* ================================================= Observer ================================================= */
interface Observes {
    public void update(Message m);
}
class Observer implements Observes {
    public Message msg;

    @Override
    public void update(Message m){
        msg = m;
        System.out.println(m.contents);
    }
}

/* ================================================= Message content ================================================= */
class Message {
    public String contents;
    Message(String data){
        contents = data;
    }
}


class Test {
    public static void main(String[] args){
        Subject sub = new Subject();

        Observer ob1 = new Observer();
        Observer ob2 = new Observer();
        Observer ob3 = new Observer();
        Observer ob4 = new Observer();

        sub.addObserver(ob1);
        sub.addObserver(ob2);
        sub.addObserver(ob3);
        sub.addObserver(ob4);

        Message msg = new Message("RUN!");
        sub.informAll(msg);

        sub.removeObserver(ob2);
        sub.removeObserver(ob1);

        msg = new Message("STOP!");
        sub.informAll(msg);
    }
}