package OOP;

public class Rectangle extends Geometric {
    protected long width;
    protected long height;

    public Rectangle(long width, long height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("width: %s height: %s", this.width, this.height);
    }

    public long Area(){
        return this.width * this.height;
    }
}
