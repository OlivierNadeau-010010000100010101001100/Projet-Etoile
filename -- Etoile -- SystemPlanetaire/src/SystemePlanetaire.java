/*
 * Auteur : Olivier Nadeau
 * Fichier systemPlanetaire.java
 */

public class SystemePlanetaire {
    // Attributs
    private String nom;
    private int taille;
    private Etoile etoile;
    private int nombrePlanete;
    

    // Attibuts static
    private static String GALAXIE;
    private static int nombreSystemePlanetaire;

    // initialiser les attributs statics
    static{
        GALAXIE = "Voie Lactée";
        nombreSystemePlanetaire = 1;
    }
    

    // Constructeurs
    // constructeur par défault
    public SystemePlanetaire() {
        this.nom = " ";
        this.taille = 0;
        this.nombrePlanete = 0;
        nombreSystemePlanetaire++;
    }

    // constructeur paramétré sans nombreSystemePlantetaire
    public SystemePlanetaire(String nom, int taille, Etoile etoile, int nombrePlanete) {
        setNom(nom);
        setTaille(taille);
        setEtoile(etoile);
        setNombrePlanete(nombrePlanete);
        nombreSystemePlanetaire++;
    }

    // constructeur par défault avec modificateur étoile
    public SystemePlanetaire(Etoile soleil) {
        this.nom = " ";
        this.taille = 0;
        this.etoile = soleil;
        this.nombrePlanete = 0;
        nombreSystemePlanetaire++;
    }



    // set et get de ...
    // nom
    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    // taille
    public Integer getTaille() {
        return taille;
    }


    public void setTaille(Integer taille) {
        this.taille = taille;
    }
    
    // etoile
    public Etoile getEtoile() {
        return etoile;
    }

    public void setEtoile(Etoile etoile) {
        this.etoile = etoile;
    }

    // Nombre Planete
    public int getNombrePlanete() {
        return nombrePlanete;
    }


    public void setNombrePlanete(int nouveauNbrPlanete) {
        this.nombrePlanete = validationNombrePlanete(nouveauNbrPlanete);
    }

    // GALAXIE
    public String getGALAXIE() {
        return GALAXIE;
    }

    public void setGALAXIE(String _GALAXIE) {
        GALAXIE = _GALAXIE;
    }

    // Nombre de Systeme Planetaire
    public static int getNombreSystemePlanetaire() {
        return nombreSystemePlanetaire;
    }

    public static void setNombreSystemePlanetaire(int nombreSystemePlanetaire) {
        SystemePlanetaire.nombreSystemePlanetaire = nombreSystemePlanetaire;
    }
    
    // Méthodes privates
    private int validationNombrePlanete(int nbrPlanete){
        if(nbrPlanete <= 0){
            nbrPlanete = 0;
        } 
        return nbrPlanete;
    }



    // Méthodes publiques

    // ajout D'UNE planete
    public void ajoutUnePlanete(){
        setNombrePlanete(getNombrePlanete()+1);
    }  

    // enlever UNE planete
    public void enleverUnePlanete(){
        setNombrePlanete(getNombrePlanete()-1);
    }

    // ajouts plusieurs planete
    public void ajoutPlusieursPlanete(int nbrAjout){
        setNombrePlanete(getNombrePlanete()+nbrAjout);
    }  

    // enlever plusieurs planete
    public void enleverPlusieursPlanete(int nbrEnlever){
        setNombrePlanete(getNombrePlanete()-nbrEnlever);
    }


    public double calculAireMoyennePlanete(){
        double aireMoyenne;
        if(this.taille == 0 || this.nombrePlanete == 0){
            aireMoyenne = 0.0;
            System.out.println("19- La taille ou le nombre de planètes est de 0, le calcul est donc impossible mathématiquement"); // désoler pour le system out print mais je n'ais pas trouver d'autres moyens
        } else {
            aireMoyenne = ((double)this.taille/(double)this.nombrePlanete);
        }
        return aireMoyenne;
    }

    // le hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + taille;
        result = prime * result + ((etoile == null) ? 0 : etoile.hashCode());
        result = prime * result + nombrePlanete;
        return result;
    }
    /* Pistes pour le equals
     * private String nom;
    private int taille;
    private Etoile etoile;
    private int nombrePlanete;
     */
    // Le equals
    public boolean equals(SystemePlanetaire systemeSolaire) {
        
        return nom.equals(systemeSolaire.getNom()) && taille == systemeSolaire.getTaille() && etoile.equals(systemeSolaire.getEtoile()) && nombrePlanete == systemeSolaire.getNombrePlanete();
    }

    // Méthode toString
    public String toString() {
        return "Le nom du système planétaire est : " + nom + ",\n sa taille est de : " + taille + ",\n son étoile est : " + etoile + ",\n son nombre de planète est de : "
        + nombrePlanete + ".";
    }

    
}
