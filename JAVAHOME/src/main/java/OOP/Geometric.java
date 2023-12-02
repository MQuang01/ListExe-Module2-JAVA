package OOP;

import java.time.LocalDate;

public class Geometric {
    private String color;
    private boolean filled;
    private LocalDate dateCreated;
    public Geometric(){
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = LocalDate.now();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return String.format("Geometric: color - %s isFilled: %s dateCreated: %s", this.color, this.filled, this.dateCreated);
    }
}
