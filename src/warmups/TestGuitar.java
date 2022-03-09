package warmups;

public class TestGuitar {
    public static void main(String[] args) {
        Stratocaster strat = new Stratocaster(6, "It has 3 pickups", "Secures the guitar", "Connects the amplifier",22, "Holds strings taut", 3,2);
        strat.setStrings(6);
        strat.setPickups("The strat has 3 pickups");
        strat.setToneKnobs(2);
        strat.setVolumeKnob(1);
        strat.setFrets(22);
        System.out.printf("The strat has %d strings\n", strat.getStrings());
        System.out.printf("The strat has %d tone knobs\n", strat.getToneKnobs());
        System.out.printf("The strat has %d volume knob\n", strat.getVolumeKnob());
        System.out.printf("The strat has %d frets", strat.getFrets());
    }
}
