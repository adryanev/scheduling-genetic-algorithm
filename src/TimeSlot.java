/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class TimeSlot {

    private int idTimeSlot;
    private String namaTimeSlot;

    public TimeSlot(int idTimeSlot, String namaTimeSlot) {
        this.idTimeSlot = idTimeSlot;
        this.namaTimeSlot = namaTimeSlot;
    }

    public int getIdTimeSlot() {
        return idTimeSlot;
    }

    public void setIdTimeSlot(int idTimeSlot) {
        this.idTimeSlot = idTimeSlot;
    }

    public String getNamaTimeSlot() {
        return namaTimeSlot;
    }

    public void setNamaTimeSlot(String namaTimeSlot) {
        this.namaTimeSlot = namaTimeSlot;
    }
}
