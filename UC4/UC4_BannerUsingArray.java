public class UC4_BannerUsingArray {

    public static void main(String[] args) {

        // Step 1: Store banner lines in a String array
        String[] bannerLines = {
                String.join("", "*  * ***** *     *     *****"),
                String.join("", "*  * *     *     *     *   *"),
                String.join("", "**** ***** *     *     *   *"),
                String.join("", "*  * *     *     *     *   *"),
                String.join("", "*  * ***** ***** ***** *****")
        };

        // Step 2: Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
