import java.io.*;
import java.util.concurrent.*;

// import java.io.*;

public class Test {
    static void timeout() {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  
    }
    public static void main(String[] args) {
        System.out.println("Opening Steam...");

        String[] cmdArray = new String[1];
        cmdArray[0] = "taskkill /IM steam.exe";
        // String [] envp = new String[2];
        // envp[0] = "taskkill";
        // envp[1] = "/IM";
        // cmdArray[0] = "C:\\Program Files (x86)\\Steam\\steam.exe";
        File file = new File("C:\\Program Files (x86)\\Steam\\steam.exe");

        // try {
        //     FileInputStream input = new FileInputStream(file);
        //     input.close();
        // } catch (IOException e) {
        //     System.out.println(e);
        // }
        try {
            Runtime runtime = Runtime.getRuntime();
            // Process process = runtime.exec(cmdArray); 
            runtime.exec(cmdArray, null, file);
            // timeout();
            System.out.println("egg");
            // process.destroy();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
