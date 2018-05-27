package com.dresapp.DressApp.model.containers;

import java.util.List;

public class Wardrobe extends ClothesSuggester {

    private List<Suitcase> suitcaseList;
    private boolean visible;
    private WardrobeMode wardrobeMode;


    public Suitcase generateSuitcase(){
        return new Suitcase();
    }
}
