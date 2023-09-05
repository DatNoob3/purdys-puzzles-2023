public class SeptemberTests {
    public static void main(String[] args) {
        String test = "Dear Ole Flour Bluff High School,\nWe pay you honor today.\nWe will tell the world that your honor will stay.\nAll hail to those who came before us,\nAnd made us so strong.\nWe will never falter or DO YOU WRONG.";
        System.out.println("Total number of 1s in the binary ASCII representation of: ");
        System.out.println("___");
        System.out.println(test);
        System.out.println("___");
        System.out.println(countOnes(AsciiToBinary(test)));
        /**
         * String test1 =
         * "DearOleFlourBluffHighSchoolWepayyouhonortodayWewilltelltheworldthatyourhonorwillstayAllhailtothosewhocamebeforeusAndmadeussostrongWewillneverfalterorDOYOUWRONG";
         * // 5 /n - 10 =
         * // 36 spaces - 32 =
         * // 2 commas - 44 =
         * // 4 periods - 46 =
         * test1 = AsciiToBinary(test1);
         * int string = countOnes(test1);
         * int newLines = count1(Integer.parseInt(Integer.toBinaryString(10))) * 5;
         * int spaces = count1(Integer.parseInt(Integer.toBinaryString(32))) * 36;
         * int commas = count1(Integer.parseInt(Integer.toBinaryString(44))) * 2;
         * int periods = count1(Integer.parseInt(Integer.toBinaryString(46))) * 4;
         * int total = string + newLines + spaces + commas + periods;
         * System.out.println(total);
         */

    }

    public static String AsciiToBinary(String asciiString) {
        byte[] bytes = asciiString.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            // binary.append(' ');
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

    /**
     * public static int count1(int num) {
     * int count = 0;
     * String number = Integer.toString(num);
     * String[] nums = number.split("");
     * for (String n : nums) {
     * if (Integer.parseInt(n) == 1) {
     * count++;
     * }
     * }
     * return count;
     * 
     * }
     */

}