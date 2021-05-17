package com.sks.utils;

import com.sks.exception.DataCannotBeNull;

import java.util.ArrayList;

public class ConstructProduct implements IdaoProduit {

    public String getFunctionalName(String ean) {
        return null;
    }

    public String setFunctionalName( String natureProduit, String fournisseur, String caractéristiques) {
        StringBuilder sb=new StringBuilder();
        if (fournisseur==null || natureProduit==null || caractéristiques==null) {
            throw new DataCannotBeNull("one or more data is null");
        }
        sb.append(natureProduit).append(BLANC).append(fournisseur).append(BLANC).append(caractéristiques);
        return sb.toString();
    }

    public long getPrix(String ean) {
        return 0;
    }

    public ArrayList<String> getSecondaryEan(String ean) {
        return null;
    }

    public boolean isPrimaryEan(String ean) {
        return false;
    }
}
