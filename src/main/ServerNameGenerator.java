package main;

public class ServerNameGenerator {

    public static void main (String[] args) {

        String [] adjectives = {"sweet", "holy", "focused", "ugly", "wise", "frolicking", "singed", "sweaty", "fermented", "lazy"};
        String [] nouns = {"guitar", "cat", "squirrel", "goat", "rainbow", "moose", "dump truck", "model", "European", "snail"};
        System.out.println(nameGenerator(adjectives, nouns));
    }


    public static String nameGenerator(String [] describers, String [] objects) {
        double randomizer = Math.random() * describers.length;
        int rounded = (int) Math.round(randomizer);
        String nameMasher = describers[rounded] + "-" + objects[rounded];
        return "Here is your server name: \n" + nameMasher;
    }


}
