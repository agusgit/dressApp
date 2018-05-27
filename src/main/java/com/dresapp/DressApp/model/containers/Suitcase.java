package com.dresapp.DressApp.model.containers;

import com.dresapp.DressApp.model.containers.ClothesSuggester;

import java.time.LocalDate;

public class Suitcase extends ClothesSuggester {

    private String addressTO;
    private LocalDate fromDate;
    private LocalDate toDate;
    private boolean active;
}
