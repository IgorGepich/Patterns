package ua.hillel;

import java.net.SocketPermission;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
