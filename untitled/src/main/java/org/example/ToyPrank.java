package org.example;

public class ToyPrank {
    public static void main(String[] args) {
        ToysShop shop = new ToysShop();
        Toy delphine = new Toy(1, "Дельфиненок", 5, 20);
        Toy spidey = new Toy(2,"Человек-паук", 15, 30);
        Toy mouse = new Toy(3, "Микки Маус", 30, 60);
        Toy dino = new Toy(4, "Динозавр", 20, 95);
        Toy tank = new Toy(5, "Танк", 50, 60);
        Toy ball = new Toy(6, "Футбольный мяч", 10, 10);
        Toy waterGun = new Toy(7, "Водяной пистолет", 40, 90);

        shop.addToy(delphine);
        shop.addToy(spidey);
        shop.addToy(mouse);
        shop.addToy(dino);
        shop.addToy(tank);
        shop.addToy(ball);
        shop.addToy(waterGun);


        System.out.println("Добро пожаловать в наш магазин игрушек!\n" + shop.toString());

        shop.toyPrank();

        Toy winnerToy = shop.takeWinnerToy();
        if(winnerToy != null) {
            System.out.println("Вы выиграли: " + winnerToy.getName());
        }
    }
}
