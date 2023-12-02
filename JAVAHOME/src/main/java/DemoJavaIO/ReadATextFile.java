package DemoJavaIO;
import java.io.*;

public class ReadATextFile {
    public static void main(String[] args) {

        try {
            File inFile = new File("Hello.txt");
            FileReader fileReader = new FileReader(inFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
