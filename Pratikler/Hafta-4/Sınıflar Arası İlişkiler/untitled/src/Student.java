import java.util.SimpleTimeZone;

public class Student {
    private String name;
    private String surname;

    private String idno;
    private String adress;
    private int note;

    public Student(String name, String surname, String idno, String adress,int note){
        this.name = name;
        this.surname = surname;
        this.idno= idno;
        this.adress= adress;
        if(this.note < 0 || this.note >100){
            this.note =0;
        }
        this.note= note;
    }

    public String getName(){
        return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }



}
