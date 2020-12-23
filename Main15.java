import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main15 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "бла бла бла";
        byte[] b = a.getBytes(StandardCharsets.UTF_16);
        int d = b.length;
        System.out.println(d);
    }
}
