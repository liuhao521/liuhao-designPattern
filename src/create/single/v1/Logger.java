package create.single.v1;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private Writer fileWriter;

    public Logger() throws IOException {
        File file = new File("d://1.txt");
        this.fileWriter = new FileWriter(file,true);
    }

    public void log(String msg) throws IOException {
        fileWriter.write(msg);
        fileWriter.write("\n");
        fileWriter.flush();
    }

}
