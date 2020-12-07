package Java_Core_Homework_1;

import Java_Core_Homework_1.Hurdle;

public class Track extends Hurdle {
    protected int length;

    public Track (String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getLength() {
        return this.length;
    }
}
