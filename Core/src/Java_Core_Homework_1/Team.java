package Java_Core_Homework_1;

import com.sun.applet2.Applet2Context;

public class Team {
    protected String name;
    protected int jumpLimit;
    protected int runLimit;


    public Team(String name, int jumpLimit, int runLimit) {
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }


    public void jump(Applet2Context wallForJump) {
        if (wallForJump.getHeight() >= this.jumpLimit ) {
            System.out.println(this.name + " не перепрыгнул/a " + wallForJump.getName());
        } else {
            System.out.println(this.name + " перепрыгнул/a " + wallForJump.getName());

        }
    }
    public void run(Track trackForRun) {
        if (trackForRun.getLength() >= this.runLimit) {
            System.out.println(this.name + " не пробежал/a " + trackForRun.getName());
        } else {
            System.out.println(this.name + " пробежал/а " + trackForRun.getName());
        }
    }
}
