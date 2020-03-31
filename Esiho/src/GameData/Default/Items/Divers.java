package GameData.Default.Items;

import java.awt.*;

public class Divers extends Item{//Ce type d'objet réfère aux objets sans fonctions
    private String id;
    private String nom;
    private Integer valeur;
    private Image image;

    public Divers(String id, String nom, Integer valeur, Image image){
        this.id=id;
        this.nom=nom;
        this.valeur=valeur;
        this.image=image;
    }

    public void useItem(){
        //À compléter
        //Faire un envoi de message comme quoi ça ne s'utilise pas
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
