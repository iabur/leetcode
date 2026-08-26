package tree.SerializeAndDeserializeBinaryTree;

import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        Codec codec = new Codec();

        String sample = "1,2,N,N,3,4,N,N,5,N,N";

        String roundTrip = codec.serialize(codec.deserialize(sample));

        System.out.println("Input : " + sample);
        System.out.println("Output: " + roundTrip);
    }

}

