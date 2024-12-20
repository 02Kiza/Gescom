package metier;

import java.util.*;

public class Famille {
    private int idFamille;
    private String libFamille;

    // Getters et setters
    public int getIdFamille() {
        return idFamille;
    }

    public void setIdFamille(int idFamille) {
        this.idFamille = idFamille;
    }

    public String getLibFamille() {
        return libFamille;
    }

    public void setLibFamille(String libFamille) {
        this.libFamille = libFamille;
    }

    public Famille(int idFamille, String libFamille) {
        this.idFamille = idFamille;
        this.libFamille = libFamille;
    }
}