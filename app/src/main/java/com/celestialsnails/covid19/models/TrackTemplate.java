package com.celestialsnails.covid19.models;

/**
 * Created by aerozero on 12/21/17.
 */

public class TrackTemplate {

    private String name;
    private String longName;
    private boolean isMultiPart;

    private int part1Resource;
    private int part2Resource;
    private int buttonId;
    private int spacerId;

    public TrackTemplate(String name, String longName, int part1Resource, int part2Resource) {

        this.name = name;
        this.longName = longName;
        this.part1Resource = part1Resource;

        try {
            if (part2Resource != 0) {
                this.part2Resource = part2Resource;
                this.isMultiPart = true;
            } else {
                this.isMultiPart = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isMultiPart() {
        return isMultiPart;
    }

    public int getPart1Resource() {
        return part1Resource;
    }

    public int getPart2Resource() {
        return part2Resource;
    }

    public String getName() { return name; }

    public String getLongName() { return longName; }

    public int getButtonId() {
        return buttonId;
    }

    public void setButtonId(int buttonId) {
        this.buttonId = buttonId;
    }

    public int getSpacerId() {
        return spacerId;
    }

    public void setSpacerId(int spacerId) {
        this.spacerId = spacerId;
    }


}
