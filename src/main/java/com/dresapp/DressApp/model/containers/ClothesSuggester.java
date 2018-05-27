package com.dresapp.DressApp.model.containers;

import com.dresapp.DressApp.model.clothes.Clothes;
import com.dresapp.DressApp.model.outfits.Outfit;

import java.util.HashMap;
import java.util.List;

public abstract class ClothesSuggester extends ClothesManager {

    private List<Outfit> outfitList;

    public Outfit generateSuggestion(HashMap<String,String> filters){
        return new Outfit();
    }

    public Clothes generateClothSuggestion(){
        return new Clothes();
    }
}
