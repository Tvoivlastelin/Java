package HWsem6;

import java.util.Objects;

public class Notebook {
    private String name;
    private int SSD;
    private String color;
    private Double price;
    private int RAM ;
    private Double diagonal;

    public Notebook(String name, String color, double diagonal, double price, int SSD,int RAM) {
        this.name = name;
        this.color = color;
        this.diagonal = diagonal;
        this.SSD = SSD;
        this.price = price;
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "name='" + name + '\'' +
                ", SSD=" + SSD + " ГБ" +
                ", color='" + color + '\'' +
                ", price=" + price +" $" +
                ", RAM=" + RAM + " ГБ" +
                ", diagonal=" + diagonal + "''" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return SSD == notebook.SSD || RAM == notebook.RAM || Objects.equals(name, notebook.name) || Objects.equals(color, notebook.color) || Objects.equals(price, notebook.price) || Objects.equals(diagonal, notebook.diagonal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, SSD, color, price, RAM, diagonal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }
}
