package metier;

import java.util.*;

public class Ligne {
    private Article unArticle;
    private int qteCommande;

    // Getters et setters
    public Article getUnArticle() {
        return unArticle;
    }

    public void setUnArticle(Article unArticle) {
        this.unArticle = unArticle;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public Ligne(Article unArticle, int qteCommande) {
        this.unArticle = unArticle;
        this.qteCommande = qteCommande;
    }
}