/*
 * Auteur : Olivier Nadeau
 * Fichier : TestSystemPlanetaireEtoile.java
 */
public class TestSystemPlanetaireEtoile {
    public static void main(String[] args) throws Exception {
        
        //1- Créez un nouvel objet du nom de systemeSolaire  ( type SystemePlanetaire ) 
        //Te servir du constructeur par défaut.
        SystemePlanetaire systemeSolaire = new SystemePlanetaire();
        System.out.println ("1------------------------------------------------------------------------");

        //    2- Créez un nouvel objet du nom de soleil ( type Etoile) 
        //       Nom : Soleil, Taille : 696 340 et Âge : 4 603 000 000 
        /*
         * J'ai mis l'âge du soleil à 460 300 000 ans, puisque lorsque je rajoutait le dernier zéro, ça me disait que je dépassait la valeur des integer,
         * cependant j'ai essayer de le mettre en double/Long pour pouvoir faire rentrer la valeur dans la variable, cependant rien n'asvoulu fonctionner :)
         */
        Etoile soleil = new Etoile("Soleil","", 696340, 460300000 );
        System.out.println ("2------------------------------------------------------------------------");

        // 3-   Affectez le soleil au systèmeSolaire
        systemeSolaire.setEtoile(soleil);
        System.out.println ("3------------------------------------------------------------------------");

        // 4-   Assignez arc-en-ciel comme couleur à l’objet soleil.    
        soleil.setCouleur("arc-en-ciel");
        System.out.println ("4------------------------------------------------------------------------");

        // 5-   Affichez le contenu de l'objet de type SystemePlanetaire.
        System.out.println("5- Le contenu de l'objet : "+systemeSolaire);
        System.out.println  ("5------------------------------------------------------------------------");

        /* 6- Créez un objet type SystemePlanetaire, du nom de alphaDuCentaure, avec les informations suivantes : nom : Alpha du Centaure, nombre de planètes : 4, taille : 2130, créer une nouvelle étoile nommée ‘’ RigilKentaurus’’ qui aura les caractéristiques suivantes (nom : Rigil Kentaurus, couleur : jaune, Taille : 2 130, âge : 4 850 000) qui sera ajouté au système planétaire AlphaDuCentaure. */
        Etoile RigilKentaurus = new Etoile("RigilKentaurus", "jaune", 2130, 4850000); // création nouvelle étoile
        SystemePlanetaire alphaDuCentaure = new SystemePlanetaire("Alpha du Centaure", 4 ,RigilKentaurus, 2130); // création nouveau systeme planetaire
        System.out.println ("6-------------------------------------------------------------------------");

        // 7- Affichez les informations du systèmes planétaires alphaDuCentaure
        System.out.println ("7- Les informations de Alpha du Centaure sont : "  + alphaDuCentaure);       
        System.out.println ("7-------------------------------------------------------------------------");

        // 8-     Créer une autre étoile acb. Ces caractéristiques seront (nom : ACB, Couleur : orange, Âge : 4 850 000)
        Etoile acb = new Etoile("ACB", "orange", 0, 4850000);
        System.out.println ("8-------------------------------------------------------------------------");

        // 9- Créer un troisième objet Système planétaire du nom de liche. Il aura comme nom Liche, Taille : 710, nombre de planètes : 4, l’étoile utilisera le constructeur par défaut)
        Etoile parDefault1 = new Etoile(); // créer une etoile par default
        SystemePlanetaire liche = new SystemePlanetaire("Liche", 710,parDefault1,4);
        System.out.println ("9---------------------------------------------------------------------");		

        // 10- Affichez seulement le nombre de planètes de liche à partir de l’objet de type SystèmePlanétaire. 
        System.out.println ( "10- nombre de planètes de liche: "  + liche.getNombrePlanete());
        System.out.println ( "10----------------------------------------------------------------------");

        //  11- On vient de découvrir une nouvelle planète dans le système Liche.
        //       Ajouter une planète à l’objet liche en utilisant la méthode appropriée et affichée le nombre de planètes.
        liche.ajoutUnePlanete();
        System.out.println("Le nombre de planètes de Liche est rendue à : "+ liche.getNombrePlanete());
        System.out.println ("11---------------------------------------------------------------------");

        // 12- Changez l’étoile de l’objet alphaDuCentaure. Son étoile sera maintenant acb.
        alphaDuCentaure = new SystemePlanetaire("Alpha du Centaure", 4 ,acb, 2130);
        System.out.println ("12---------------------------------------------------------------------");

        System.out.println("À REVENIR :"); //******************************************************************************************************************************************************************** */
        // 13- Affichez seulement le nom de l’étoile d’alphaDuCentaure, mais à partir de l’objet de type, SystèmePlanétaire aphaDuCentaure.  
        System.out.println ( "13- Nom de l’étoile après le changement: "     + alphaDuCentaure.getNom()) ;
        System.out.println ("13--------------------------------------------------------------------");

        // 14- Assignez les propriétés suivantes à l'objet Pegase51 de type SystemePlanétaire.  
        //	Assignez ‘’51 de Pégase’’ comme nom.
        //	Assignez 12 comme nombre de planètes pour Pegase51
        //	Assignez l’Object Soleil comme étoile
        //	Assignez 64648 comme taille

        //	Affichez l’objet Pegase51
        SystemePlanetaire pegase51 = new SystemePlanetaire("51 de Pégase",64648,soleil,12);
        System.out.println ( "14- Pegase51 = "   + pegase51);
        System.out.println ("14-----------------------------------------------------------------");

        // 15- Assignez -2 comme nombre de planètes au Système planétaire Pegase51.
        pegase51.setNombrePlanete(-2);
        //      Affichez Pegase51
        System.out.println ("15- Pegase51 = "   +   pegase51);
        System.out.println ("15------------------------------------------------------------------");

        // 16- Créez un nouvel objet du nom de gliese581 de type SystemePlanetaire (const. par défaut ).
        //       Assignez-lui le soleil comme étoile
        SystemePlanetaire gliese581 = new SystemePlanetaire(soleil);
        //       Affichez ces informations.
        System.out.println ( "16- Gliese 581= "   +  gliese581);
        System.out.println ("16----------------------------------------------------------------------");

        // 17- Enlever 2 planètes à l’objet gliese581 en utilisant la méthode appropriée.
        gliese581.enleverPlusieursPlanete(2);
        //        Affichez ses infos.
        System.out.println ("17- gliese581 = "   +  gliese581);
        System.out.println ("17--------------------------------------------------------------------");

        // 18- Ajoutez une planète à gliese581.
        // Affichez seulement les attributs pour connaître le nombre de planètes de gliese581ainsi que sa Galaxie.
        System.out.println ( "18- Gliese 581 = "   +" le nbr de planètes est : "+ gliese581.getNombrePlanete() +" dans la galaxie "+ gliese581.getGALAXIE());
        System.out.println ("18--------------------------------------------------------------------");
            

        // 19- Calculez l’aire des planètes de gliese581 et affichez le résultat.
        System.out.println ( "19- Aire des planètes de gliese581 = "   + gliese581.calculAireMoyennePlanete());
        System.out.println ("19--------------------------------------------------------------------");

        // 20-  Creez 2 objets SystemePlanetaire en utilisant le constructeur par défaut qui seront appelés titawin et ran.
        /*
         * J'ai rajouter l'attribut soleil dans le constructeur par défault puisque j'avais un blanc pour initier le soleil automatiquement dans constructeur par défault, donc il prend la classe avec 1 paramètre dedans
         */
        SystemePlanetaire titawin = new SystemePlanetaire(soleil);
        // 20- ----------------------------------------------------------------------------------------------------
        SystemePlanetaire ran = new SystemePlanetaire(soleil);
        // 21 -   Inscrivez la commande qui vérifie si les 2 objets, titawin et ran sont égaux.
        System.out.println ("21-  titawin et ran =  " +    titawin.equals(ran)) ;

        // 22 –   Augmentez le nombre de planètes de titawin de 1.     
        titawin.ajoutUnePlanete();
        // Inscrivez la commande qui vérifie si les 2 objets, titawin et ran sont égaux.
        System.out.println ("22-  titawin et ran =  " +  titawin.equals(ran)) ;

        // 23 -   Inscrivez la commande qui vérifie si les 2 objets, ran et alphaDuCentaure sont égaux.	         
        System.out.println ("23- ran et alphaDuCentaure =  " +    ran.equals(alphaDuCentaure)) ;

        // 24- Affichez toutes les informations sur alphaDuCentaure par rapport à son étoile.
        // (note personnelle) : doit prendre l'étoile attitré à alpha et le mettre en String
        System.out.println ( "24-  info de l’étoile d’Alpha du Centaure = "  +  ((alphaDuCentaure.getEtoile()).toString())       );
        System.out.println ("24------------------------------------------------------------------");   

        // 25 -  Affichez le nombre de systèmes planétaires qui ont été créés
        System.out.println ( "25- Le nombre de systèmes planétaires est: "  +  SystemePlanetaire.getNombreSystemePlanetaire());
        System.out.println ("25-------------------------------------------------------------------");

        System.exit(0);
    }
}
