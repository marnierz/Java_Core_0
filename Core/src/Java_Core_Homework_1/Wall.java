package Java_Core_Homework_1;

import Java_Core_Homework_1.Hurdle;

public class Wall extends Hurdle {
    protected int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }
    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getLength() {
        return 0;
    }

}
