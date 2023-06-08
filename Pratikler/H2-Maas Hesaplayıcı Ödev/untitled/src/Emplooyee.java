import java.util.SimpleTimeZone;

public class Emplooyee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Emplooyee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary= salary;
        this.workHours=workHours;
        this.hireYear= hireYear;
    }
     double tax(){//Vergi dilimi hesaplanması yapılıyor
        if(this.salary < 1000){
           return 0;
        }else {
            return salary*0.03;
        }

    }
    double bonus(){//Çalışma saatine  göre prim hesaplanıyor

        if(this.workHours > 40){
            int extraHours=workHours-40;
            return extraHours*30;
        }else {
        return 0;
        }
    }

    void raiseSalary(){//Burada yıla göre maaş zam oranı hesaplanıyor

        int raise = 2021-hireYear;

        if(raise>10){
            salary*=1.05;
        } else if (raise>=9&&raise<20) {
            salary*=1.1;
        }else {
            salary*=1.15;
        }


    }

    public String toString(){//Burada ekrana aktarım için method kullanılıyor
        return " \n Adı: " + name + "\n " +
                "Başlangıç Yılı: " + hireYear+"\n " +
                "Haftalık Çalışma Saati: " + workHours +"\n " +
                "Vergi:"+tax()+"\n " +
                "Bonus:" +bonus()+
                "\n Maaşı: " + salary ;
    }
}
