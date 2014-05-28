package jgarage;
//
//

import java.sql.*;

//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Stock.java
//  @ Date : 20/11/2012
//  @ Author : Axel Ajavon
//  @ Author : Indy De Deken
//
//


/** */
public class Stock
{
    private int idStock;
    /** Permet de stocker le prix du stock */
    private int prix;	
    /** Permet de stocker la quantité du stock*/
    private int quantite;   
    private String type;

    /* Variable de classes */ 
    private static String query;
    private static int resultat;

    public Stock()
    {
        this.idStock = 0;
        this.prix = 0;
        this.quantite = 0;
        this.type = "Inconnu";
    }

    
    public Stock(int idStock,int prix, int quantite,String type) {

        this.idStock = idStock;
        this.prix = prix;
        this.quantite = quantite;
        this.type = type;

    }

    /** */
    public void calculer()
    {

    }

    /* Méthodes de classes */
    public int alerter(Connection con, Stock s) throws Exception
    {
        int quantite=0;

        //Création du statement
        Statement instruction = con.createStatement();                                         
        // Entre ta requete ici
        query = "Select quantite from Stock where type = '" +s.getType()+ "';";
        //Exécution de ta requete avec retour de resultat
        ResultSet resultat = instruction.executeQuery(query);

        while (resultat.next()) {
            quantite=resultat.getInt("quantite");
        }

        return quantite;
     }

    /* Getter */
    public String getType() {
        return type;
    }
    
    public int getIdStock() {
        return idStock;
    }

    public int getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }
}
