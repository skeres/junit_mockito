package com.sks.utils;

import java.util.ArrayList;

public interface IdaoProduit {

    public static final String BLANC=" ";

    public String getFunctionalName(String ean);
    public String setFunctionalName(String fournisseur, String natureProduit, String caractéristiques);
    public long getPrix(String ean);
    public ArrayList<String> getSecondaryEan(String ean);
    public boolean isPrimaryEan(String ean);
}
