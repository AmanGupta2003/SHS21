package test3;

import java.util.*;


public class Test3 {
    public static void main(final String[] args) {

        String cmd = "";
        do {
            Scanner scan = new Scanner(System.in);
            cmd = scan.nextLine();
            executeCommand(cmd);

        } while (!cmd.equals("quit"));

    }

    public static void executeCommand(final String cmd)
    {
        System.out.println("Executing command: " + cmd);
    }
}