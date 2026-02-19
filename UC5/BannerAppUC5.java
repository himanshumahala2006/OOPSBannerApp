public class BannerAppUC5 {

    public static void main(String[] args) {

        // UC5: Array declaration + initialization using String.join()
        String[] banner = {
                String.join(" ", "*", "*", "*", "*", "*", "*", "*"),
                String.join(" ", "*", " ", " ", " ", " ", " ", "*"),
                String.join(" ", "*", " ", "OOPS", "BANNER", " ", "*"),
                String.join(" ", "*", " ", "UC5", "ARRAY", " ", "*"),
                String.join(" ", "*", " ", "STRING.JOIN", " ", "*"),
                String.join(" ", "*", " ", " ", " ", " ", " ", "*"),
                String.join(" ", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
