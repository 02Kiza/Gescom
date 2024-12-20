package metier;

import java.util.*;

public class Representant {
    private int idRepresentant;
    private String prenom;
    private String nom;
    private List<Client> lesClients;

    // Getters et setters
    public int getIdRepresentant() {
        return idRepresentant;
    }

    public void setIdRepresentant(int idRepresentant) {
        this.idRepresentant = idRepresentant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Client> getLesClients() {
        return lesClients;
    }

    public void setLesClients(List<Client> lesClients) {
        this.lesClients = lesClients;
    }


    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        this.idRepresentant = idRepresentant;
        this.prenom = prenom;
        this.nom = nom;
        this.lesClients = lesClients;
    }


    public Representant(int idRepresentant, String prenom, String nom) {
        this(idRepresentant, prenom, nom, new ArrayList<>());
    }

    public Client getClientById(int idClient) {
        if (lesClients != null) {
            for (Client client : lesClients) {
                if (client.getIdClient() == idClient) {
                    return client;
                }
            }
        }
        return null;
    }
}
