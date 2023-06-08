public class Ring {
    Fighter g1;
    Fighter g2;

    int minWeight;
    int maxWeight;

    Ring(Fighter g1, Fighter g2,int minWeight, int maxWeight){
        this.g1 = g1;
        this.g2 = g2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if(checkWeight()){
            int round=1;
            while (true){
                System.out.println("====="+round+". Round=====");
                g2.health = g1.hit(g2);
                if (isWin()){break;}
                g1.health = g2.hit(g1);
                if(isWin()){break;}
                printScore();
                round++;
            }
        }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }

    }


    boolean checkWeight(){
        return (g1.weight >= minWeight && g1.weight <= maxWeight) && (g1.weight >= minWeight && g1.weight <= maxWeight);


    }

    boolean isWin(){
        if(g1.health==0){
            System.out.println("Maçı Kazanan : "+ g2.name);
            return true;
        }else if(g2.health==0){
            System.out.println("Maçı Kazanan : " + g1.name);
            return true;
        }
        return false;
    }

    void printScore(){
        System.out.println(g1.name + "Kalan Can \t:" + g1.health);
        System.out.println(g2.name + "Kalan Can \t:" + g2.health);


    }

}

