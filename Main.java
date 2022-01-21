public class Main
{
    public static void main(String[] args) {
        String str = "Hellooo!";
        System.out.println("Source: " + str);

        HuffmanCoding h = new HuffmanCoding().process(str);
        String encoded = h.encode();
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + h.decode(encoded));
    }
}
