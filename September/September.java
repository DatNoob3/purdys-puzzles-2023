public class September {
    public static void main(String[] args) {
        String test = "Dear Ole Flour Bluff High School,\nWe pay you honor today.\nWe will tell the world that your honor will stay.\nAll hail to those who came before us,\nAnd made us so strong.\nWe will never falter or DO YOU WRONG.";
        System.out.println("Total number of 1s in the binary ASCII representation of: ");
        System.out.println("___");
        System.out.println(test);
        System.out.println("___");
        System.out.println(countOnes(AsciiToBinary(test)));
    }

    // copied from StackOverflow
    public static String AsciiToBinary(String asciiString) {
        byte[] bytes = asciiString.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
        }
        return binary.toString();
    }

    public static int countOnes(String binary) {
        int count = 0;
        String[] nums = binary.split("");
        for (String n : nums) {
            if (Integer.parseInt(n) == 1) {
                count++;
            }
        }
        return count;
    }
}
