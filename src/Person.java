/**
 * Created by Adryan Eka Vandra on 12/22/2017.
 */
public class Person {

    private Character idPerson;
    private String nama;


    public Person(Character idPerson, String nama){
        this.idPerson = idPerson;
        this.nama   = nama;
    }

    public Character getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Character idPerson) {
        this.idPerson = idPerson;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
