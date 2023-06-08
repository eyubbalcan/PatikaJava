public class Main {
    public static void main(String[] args) {
        Fighter john = new Fighter("John" , 17 , 100, 88, 14);
        Fighter under = new Fighter("Under" , 23 , 100, 90, 16);
        Ring r = new Ring(john,under , 80 , 100);
        r.run();
    }
}
