import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void star(){
        System.out.println("Merhabalar Macera Oyununa Hoşgeldiniz...");
        System.out.print("İsim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Oyun Başlıyooooooor, Dikkaliii olll!!!");
        player.selectChar();
      //  int selectChar =input.nextInt();

    }
}
