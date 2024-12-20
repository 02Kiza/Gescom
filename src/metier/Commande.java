
package metier;

import dao.BdD;
import java.util.*;

public class Commande {
    private int idCommande;
    private Date dateCommande;
    private List<Ligne> lesLignes;

    // Getters et setters

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Commande(int idCommande, Date dateCommande) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.lesLignes = new ArrayList<>();
    }

    public void ajouterLigne(Article unArticle, int qteCde) {
        if (lesLignes == null) {
            lesLignes = new ArrayList<>();
        }
        Ligne uneLigne = new Ligne(unArticle, qteCde);
        lesLignes.add(uneLigne);
    }



    public double valoriserCommande() {
        double total = 0;
        if (lesLignes != null) {
            for (Ligne ligne : lesLignes) {
                total += ligne.getUnArticle().getPrix() * ligne.getQteCommande();
            }
        }
        return total;
    }



}