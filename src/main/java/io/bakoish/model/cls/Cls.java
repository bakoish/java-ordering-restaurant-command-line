package io.bakoish.model.cls;

import java.io.IOException;

public class Cls {
    public static void cls(){ //clear console (not working in IDE)
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ignored) {}
    }
}
