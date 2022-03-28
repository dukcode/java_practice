package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStreamEx3
 */
public class DataOutputStreamEx3 {

    public static void main(String[] args) {
        int[] score = new int[] {100, 95, 90, 85, 80, 50};

        try {
            FileOutputStream fos = new FileOutputStream("score.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 0; i < score.length; ++i) {
                dos.writeInt(score[i]);
            }

            dos.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
