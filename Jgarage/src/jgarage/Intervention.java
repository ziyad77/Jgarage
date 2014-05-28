package jgarage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

 

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Intervention.java
//  @ Date : 20/11/2012
//  @ Author : Axel Ajavon
//  @ Author : Indy De Deken
//
//


/** */
public class Intervention
{
    /** Variables d'instances */
    private int idIntervention;
    private int idVehicule;
    private String nature;
    private int prix;
    private String date_debut;
    private String date_fin;
    
    // Constructeur par défaut
    public Intervention()
    {        
        this.idIntervention = 0;
        this.idVehicule = 0;
        this.nature = "";
        this.prix = 0;
        this.date_debut = "";
        this.date_fin = "";
    }   
    
    /**
        * Constructeur d'un objet Intervention
        *
    */
    public Intervention(int idIntervention,int idVehicule,String nature,int prix,String date_debut,String date_fin)
    {        
        this.idIntervention = idIntervention;
        this.idVehicule = idVehicule;
        this.nature = nature;
        this.prix = prix;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }       
    
    /* getter */
    public int getidIntervention() 
    {
        return this.idIntervention;
    }
    public int getidVehicule() 
    {
        return this.idVehicule;
    } 
    public String getNature() 
    {
        return this.nature;
    } 
    public int getPrix() 
    {
        return this.prix;
    } 
    public String getDate_debut() 
    {
        return this.date_debut;
    } 
    public String getDate_fin() 
    {
        return this.date_fin;
    } 
       
    
    /* setter */
    private void setNature(String nature) 
    {
        this.nature = nature;
    } 
    private void setPrix(int prix) 
    {
        this.prix = prix;
    } 
    private void setDate_debut(String date_debut) 
    {
        this.date_debut = date_debut;
    } 
    private void setDate_fin(String date_fin) 
    {
        this.date_fin = date_fin;
    }   
    
    

}