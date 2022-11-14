import java.awt.Desktop;
import java.io.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Opening EVGA Precision X1");
      File file = new File("C:\\Program Files\\EVGA\\Precision X1\\PrecisionX_x64.exe");
      if(!Desktop.isDesktopSupported()) {
        System.out.println("not supported");  
        return;
      }
      Desktop desktop = Desktop.getDesktop();
      if(file.exists());
        try {
            desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}