import java.util.Objects;

public class Reservation {
    Passenger first;
    Passenger last;
    int total;

    public boolean isEmpty(){
        return first == null && last == null;
    }

    public void reserveSeat(String name){
        Passenger newPassenger = new Passenger(name);
        if(isEmpty()){
            first = newPassenger;
            last = newPassenger;
        }else{
            last.next = newPassenger;
            last = newPassenger;
        }
        total++;
        System.out.println(name +" has reserved a seat..");
    }

    public void removeSeat(String name){
        if(isEmpty()) {
            System.out.println("All seats are already empty..");
            return;
        }

        Passenger curr = first;
        Passenger prev = null;


        if(Objects.equals(first.name,name)){
            first = first.next;
            total--;
            System.out.println(first.name + "'s first seat is removed..");
            return;
        }


        while(curr != null){
            if(Objects.equals(curr.name,name)){
                prev.next = curr.next;
                if(prev.next == null){
                    last = prev;
                }
                total--;
                System.out.println(curr.name+"'s seat is removed..");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void display(){
        Passenger curr = first;
        System.out.println("Passengers : ");
        while(curr != null){
            System.out.print(curr.name+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void check(String pName){
        if(isEmpty()){
            System.out.println("Empty..");
            return;
        }
        Passenger temp = first;
        while(temp != null){
            if(Objects.equals(temp.name,pName)){
                System.out.println(temp.name+" has a seat reserved..");
                return;
            }
            temp = temp.next;
        }
        System.out.println(pName+" Not found..");
    }

}
