package create.single.v1;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++){
            int finalI = i;
            new Thread(() ->{
                try {
                    Logger log = new Logger();
                    log.log( ""+finalI );
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
