import java.util.Scanner;

public class Player {
    private int damage;
    private int healt;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);


    public Player(String playerName) {
        this.name = name;
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-------------------------------------------------");
        for (GameChar gamechar : charList) {
            System.out.println("Id :" + gamechar.getId() + " \tKahraman : " + gamechar.getName() +
                    "\t     Hasar : " + gamechar.getDamage() +
                    "\t Can : " + gamechar.getHealt() +
                    " \tPara : " + gamechar.getMoney());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Karakteri seçiniz.");
        int selectcharhar = input.nextInt();
        switch (selectcharhar) {
            case 1:
                InitPlayer(new Samurai());
                break;
            case 2:
                InitPlayer(new Archer());
            case 3:
                InitPlayer(new Knight());
            default:
                System.out.println("Yanlış girdiniz.");

        }
    }

    public void InitPlayer(GameChar gameChar) {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
