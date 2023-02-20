public class PracticingWithStrings {
    public static void main(String[] args) {

        String greeting = "hola como estas?";

        System.out.println(""); // Blank for space

        System.out.println("This will turn into UpperCase: " + greeting.toUpperCase());
        System.out.println("This will count the total letter & symbols: " + greeting.length());
        System.out.println(
                "This count the order of the letter placements for example letter 'h' is " + greeting.indexOf('h'));
        System.out.println("The charAT(5) is " + greeting.charAt(5));

        System.out.println(""); // Blank for space

        System.out.println("Now we will use the charAt() to count spaces by their location");
        for (int x = 0; x < greeting.length(); ++x) {
            if (greeting.charAt(x) == ' ') {
                System.out.print(x + "  ");
            }
        }
        System.out.println(""); // Blank for space
        String replaceGreeting = greeting.replace('?', '!');
        System.out.println("This will replace ? to !: " + replaceGreeting);
    }
}
