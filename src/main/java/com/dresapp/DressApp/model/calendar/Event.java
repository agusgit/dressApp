package com.dresapp.DressApp.model.calendar;

import com.dresapp.DressApp.model.clothes.ColdResistance;
import com.dresapp.DressApp.model.clothes.Formality;
import com.dresapp.DressApp.model.outfits.Outfit;

import java.time.LocalDate;

public class Event {

    private String description;
    private LocalDate date;
    private Formality formality;
    private ColdResistance coldResistance;
    private Outfit outfit;
}
