/**
 * UC4: Displays a decorative banner using a String array for storage
 * 
 * This program demonstrates the use of arrays to store multiple lines of
 * ASCII art. Each line of the banner is stored as a separate array element,
 * making the code more maintainable and scalable.
 */
public class UC4_BannerUsingArray {

    public static void main(String[] args) {

        // Step 1: Create and initialize a String array containing all banner lines
        // Each array element represents one complete row of the banner pattern
        String[] bannerLines = {
                String.join("", "*  * ***** *     *     *****"),
                String.join("", "*  * *     *     *     *   *"),
                String.join("", "**** ***** *     *     *   *"),
                String.join("", "*  * *     *     *     *   *"),
                String.join("", "*  * ***** ***** ***** *****")
        };

        // Step 2: Iterate through the array using an enhanced for-loop and print each banner line
        // The enhanced for-loop automatically iterates through all array elements
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
