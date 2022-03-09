package warmups;

public class Guitar {
    private int strings;
    private String pickups;
    private String strap;
    private String inputJack;
    private int frets;
    private String bridge;
    private int volumeKnob;
    private int toneKnobs;

    public Guitar(int strings, String pickups, String strap, String inputJack, int frets, String bridge, int volumeKnob, int toneKnobs) {
        this.strings = strings;
        this.pickups = pickups;
        this.strap = strap;
        this.inputJack = inputJack;
        this.frets = frets;
        this.bridge = bridge;
        this.volumeKnob = volumeKnob;
        this.toneKnobs = toneKnobs;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String getPickups() {
        return pickups;
    }

    public void setPickups(String pickups) {
        this.pickups = pickups;
    }

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getInputJack() {
        return inputJack;
    }

    public void setInputJack(String inputJack) {
        this.inputJack = inputJack;
    }

    public int getFrets() {
        return frets;
    }

    public void setFrets(int frets) {
        this.frets = frets;
    }

    public String getBridge() {
        return bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge;
    }

    public int getVolumeKnob() {
        return volumeKnob;
    }

    public void setVolumeKnob(int volumeKnob) {
        this.volumeKnob = volumeKnob;
    }

    public int getToneKnobs() {
        return toneKnobs;
    }

    public void setToneKnobs(int toneKnobs) {
        this.toneKnobs = toneKnobs;
    }
}
