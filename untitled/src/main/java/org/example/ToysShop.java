package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToysShop {

    private ArrayList<Toy> toys;
    private ArrayList<Toy> winnerToys;
    private String winnerFile;

    public ToysShop() {
        toys = new ArrayList<Toy>();
        winnerToys = new ArrayList<Toy>();
        winnerFile = "List_toys.txt";
    }



    public void changeToyFall(int id, double newFall) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setToyFall(newFall);
            }
        }
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public String toString() {
        return "ToysShop: \n" + toys ;
    }

    public void toyPrank() {
        winnerToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getToyFall()) {
                winnerToys.add(toy);
            }
        }
    }

    public Toy takeWinnerToy() {
        if(!winnerToys.isEmpty()) {
            Toy winnerToy = winnerToys.remove(0);
            winnerToy.setQuantity(winnerToy.getQuantity() - 1);

            try {
                FileWriter fw = new FileWriter(winnerFile, true);
                fw.write(winnerToy.getName() + "\n");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException("Невозможно записать наименование игрушки в файл");
            }
            return winnerToy;
        }
        else {
            System.out.println("Все игрушки разыграны!");
            return null;
        }
    }
}
