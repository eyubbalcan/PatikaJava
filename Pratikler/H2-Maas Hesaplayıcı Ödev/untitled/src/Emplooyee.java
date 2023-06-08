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
    int tax(Emplooyee salary){
        if(this.salary < 1000){
           return this.salary = this.salary;
        }else {
            int tax =(this.salary /100)*3;
            return  this.salary = this.salary-tax;
        }

    }
    int bonus(Emplooyee workHours){
        int bonus=1;
        if(this.workHours >= 40){
            this.workHours = this.workHours - 40;
            return bonus = this.workHours*30;
        }
        return 0;
    }
    int raise = 2021-this.hireYear;
    int raiseSalary(Emplooyee hireYear){
        int raise = 2021-this.hireYear;
        int interestValue = this.salary /100;
        if(raise>10){
            return this.salary += interestValue * 5;
        }
        if(raise>=9&&raise<20){
            return this.salary += interestValue *10;
        }
        if(raise>=19){
            return this.salary += interestValue *15;
        }
        return 0;
    }

    void toString(Emplooyee bilgi){
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı  :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + raise);
        System.out.println("Vergi :" + this.name);
        System.out.println("Bonus  :" + this.name);
        System.out.println("Maaş Artışı :" + raiseSalary(this.hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + this.name);
        System.out.println("Toplam Maaş :" + this.name);


    }
}
