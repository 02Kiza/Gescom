package metier;

import java.util.*;

public class Client {
    private int idClient;
    private String raisonSociale;
    private double caClient;
    private List<Commande> lesCommandes;
    private Categorie categorie; // Ajout de l'attribut catégorie

    // Getters et setters
    public double getCaClient() {
        return caClient;
    }

    public void setCaClient(double caClient) {
        this.caClient = caClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public List<Commande> getLesCommandes() {
        return lesCommandes;
    }

    public void setLesCommandes(List<Commande> lesCommandes) {
        this.lesCommandes = lesCommandes;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    // Constructeur avec 3 paramètres
    public Client(int idClient, String raisonSociale, Categorie categorie) {
        this.idClient = idClient;
        this.raisonSociale = raisonSociale;
        this.categorie = categorie; // Initialisation de la catégorie
        this.lesCommandes = new ArrayList<>();
    }

    public void ajouterCommande(Commande uneCommande) {
        if (lesCommandes == null) {
            lesCommandes = new ArrayList<>();
        }
        if (!lesCommandes.contains(uneCommande)) {
            lesCommandes.add(uneCommande);
        }
    }

    public double cumulCA() {
        double total = 0;
        if (lesCommandes != null) {
            for (Commande commande : lesCommandes) {
                total += commande.valoriserCommande();
            }
        }
        return total;
    }

    public Commande getCommandeById(int idCommande) {
        if (lesCommandes != null) {
            for (Commande commande : lesCommandes) {
                if (commande.getIdCommande() == idCommande) {
                    return commande;
                }
            }
        }
        return null;
    }

    public void supprimerCommande(Commande uneCommande) {
        if (lesCommandes != null) {
            lesCommandes.remove(uneCommande);
        }
    }
}
