package stream.inputStream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        int alpha;

        alpha = System.in.read(); // read : 한바이트씩 읽는
        System.out.println((char) alpha);
    }
}
