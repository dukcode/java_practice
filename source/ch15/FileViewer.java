package ch15;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileViewer
 */
public class FileViewer {

    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream(args[0]);
        int data = 0;
        while ((data = fls.read()) != -1) {
            char c = (char) data;
            System.out.print(c);
        }

        fls.close();
    }
}
