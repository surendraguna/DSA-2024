package sorting;

import java.util.Arrays;

public class Event {
    int s, e;
    Event (int s, int e){
        this.s = s;
        this.e = e;
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 2, 5};
        int end[] = {2, 4, 3, 6};
        Event[] event = new Event[start.length];
        for(int i = 0; i < event.length; i++)
            event[i] = new Event(start[i], end[i]);
        Arrays.sort(event, (s, e) -> {
            return Integer.compare(s.e, e.e);
        });
        for(Event e : event){
            System.out.print(e.s + " " + e.e + " "); 
            System.out.println();
        }
    }
}
