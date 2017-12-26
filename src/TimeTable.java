import java.util.HashMap;

/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class TimeTable {


    private final HashMap<Integer, TimeSlot> timeslot;
    private final HashMap<Character, Person> person;

    public TimeTable(){
        this.timeslot = new HashMap<>();
        this.person = new HashMap<>();

    }

    public TimeTable(TimeTable clonable){
        this.timeslot = clonable.timeslot;
        this.person = clonable.person;
    }

    public HashMap<Integer, TimeSlot> getTimeslot() {
        return this.timeslot;
    }

    public HashMap<Character, Person> getPerson() {
        return this.person;
    }

    public void addTimeSlot(Integer timeslotId, String timeslot){
        this.timeslot.put(timeslotId, new TimeSlot(timeslotId,timeslot));
    }
    public void addPerson(Character personId, String personName){
        this.person.put(personId, new Person(personId,personName));
    }

    public Person getRandomPerson(){
        Object[] personArray = this.person.values().toArray();
        Person person = (Person) personArray[(int) (personArray.length * Math.random())];
        return person;
    }

    public int calcClashes(){
        int clashes = 0;

        //cek apakah ada orang yg sama dalam 1 hari


        //cek apakah bentrok dengan jadwal kuliah

        return clashes;
    }
}
