package org.example;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double toyFall;

    public Toy(int id, String name, int quantity, double toyFall) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.toyFall = toyFall;
    }

    @Override
    public String toString() {
        return "Toy: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", toyFall=" + toyFall +
                ";\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getToyFall() {
        return toyFall;
    }

    public void setToyFall(double toyFall) {
        this.toyFall = toyFall;
    }
}
