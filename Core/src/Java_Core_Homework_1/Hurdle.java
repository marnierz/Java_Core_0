package Java_Core_Homework_1;

public abstract class Hurdle {
    protected String name;

    public abstract int getHeight();
    public abstract int getLength();

    public Hurdle(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
