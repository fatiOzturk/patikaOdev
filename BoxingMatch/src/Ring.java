public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    int round = 0;

    public void run() {
        Fighter first = firstStart();
        Fighter second = first == f1 ? f2 : f1;
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                round += 1;
                System.out.println("======== ROUND " + round + " ===========");
                second.health = first.hit(second);
                if (isWin()) {
                    break;
                }
                first.health = second.hit(first);
                if (isWin()) {
                    break;
                }
                if (isPointWin()) {
                    break;
                }
            }
            printScore();
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    Fighter firstStart() {
        double r = Math.random() * 100;
        return r <= 50 ? f1 : f2;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    public boolean isPointWin() {  // 10 raund olmasına rağmen nakavt olan çıkmazsa kazananı belirlemek için
        if (round == 10) {
            if (f1.health < f2.health) {
                System.out.println("10 Raund bitti. Kalan cana göre maçı kazanan : " + f2.name);
                return true;
            } else if (f1.health > f2.health) {
                System.out.println("10 Raund bitti. Kalan cana göre maçı kazanan : " + f1.name);
                return true;

            } else {
                System.out.println("Maç berabere bitti!");
                return true;
            }
        } else {
            return false;
        }

    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}