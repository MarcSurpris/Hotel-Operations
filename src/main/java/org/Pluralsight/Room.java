package org.Pluralsight;

public class Room {
    // Attributes
    private int getNumberOfBeds;
    private double getPrice;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int getNumberOfBeds, double getPrice, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return getNumberOfBeds;
    }

    public void setGetNumberOfBeds(int getNumberOfBeds) {
        this.getNumberOfBeds = getNumberOfBeds;
    }

    public double getPrice() {
        return getPrice;
    }

    public void setGetPrice(int getPrice) {
        this.getPrice = getPrice;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setGetIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
