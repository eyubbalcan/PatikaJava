
public class Main {
    public static void main(String[] args) {
        //Burada çalışan bilgileri alınır.
        Emplooyee factory = new Emplooyee("Ali Yılmaz", 2000, 45,2017);

        factory.tax();
        factory.bonus();
        factory.raiseSalary();
        //Kullanıcı bilgileri ekrana yazdırılır.
        System.out.println(factory.toString());
        }
}
