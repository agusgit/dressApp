package com.dresapp.DressApp.model.clothes;

public enum Formality {
    HOME(0),
    SPORTS(1),
    INFORMAL(2),
    SEMIFORMAL(3),
    FORMAL(4),
    VERYFORMAL(5);

    private int level;

    Formality(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
