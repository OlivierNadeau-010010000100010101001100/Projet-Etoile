/*
 * Auteur : Olivier Nadeau
 * Fichier Etoile.java
 */
public class Etoile {
    // Attributs
    private String nom;
    private String couleur;
    private int taille;
    private long age;
    

    // constructeur par défault
    public Etoile() {
        this.nom = "";
        this.couleur = "";
        this.taille = 0;
        this.age = 0;
    }

    // constructeur pramétré
    public Etoile(String nom, String couleur, int taille, long age) {
        this.nom = nom;
        this.couleur = couleur;
        this.taille = taille;
        this.age = age;
    }


    // set et get
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    // Méthode toString
    public String toString() {
        return "Le nom de l'étoile est : " + nom + ", sa couleur est : " + couleur + ", sa taille est de : " + taille + " et son âge est de : " + age + ".";
    }

    
}
