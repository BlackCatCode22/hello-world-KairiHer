public class App {
    public static void main(String [] args){

        String phrase = "Giraffe Academy";

        System.out.println( phrase.toUpperCase() );
        System.out.println( phrase.toLowerCase() );
        System.out.println( phrase.length() );
        System.out.println( phrase.contains("Academy") );
        System.out.println( phrase.contains("Doge") );
        System.out.println( phrase.charAt(1) );
        System.out.println( phrase.indexOf("a") );
        System.out.println( phrase.lastIndexOf("affe") );
        System.out.println( phrase.substring(8, 11) );
        System.out.println( phrase.substring(8, phrase.indexOf(" ")) );

        System.out.println("Giraffe Academy");
        System.out.println("Giraffe \n Academy");
        System.out.println("Giraffe \"Academy\"");
        System.out.println("Giraffe \\ Academy");

    }
}
