package arraysAndHashing.encodeAndDecodeString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("World");
        Codec codec = new Codec();
        String encoded = codec.encode(strs);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: ");
        for (String str : decoded) {
            System.out.println(str);
        }

    }
}
