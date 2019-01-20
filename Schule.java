/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schule - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Schule
{
	private String name;
	private Long schulkennzahl;
	private String schultyp;
	
	private Adresse Ort = new Adresse();
	private Schueler Schulsprecher;
	private Lehrer Direktor;
	
	private List<Abteilung> abteilungen = new ArrayList<>();
	private List<Mitarbeiter> mitarbeiter = new ArrayList<>();
	private List<Raum> raeume = new ArrayList<>();
	
	public Schule(){}
	public Schule(String name,String schultyp,Long schulkennzahl,
			String ort,String strasse,Integer nr,Integer plz)
	{
		this.schultyp = schultyp;
		this.name = name;
		this.schulkennzahl = schulkennzahl;
		Ort = new Adresse(ort,strasse,nr,plz);
	}

	public Abteilung addAbteilung(String name, String kuerzel, Schule Schule)
	{
		Abteilung abteilung = new Abteilung(name,kuerzel,Schule);
		this.abteilungen.add(abteilung);
		
		return abteilung;
	}

	public boolean setDirektor(Lehrer Lehrer)
	{
		if(Lehrer.Aufgabe == false)
		{
			if(Lehrer != null)
			{
				Lehrer = Direktor;
				return true;
			}
		}
		return false;
	}

	public Long getSchulkennzahl()
	{
		return schulkennzahl;
	}
	public String getSchultyp()
	{
		return schultyp;
	}
	public String getName()
	{
		return name;
	}
	public void printOrt()
	{
		Ort.printAdresse();
	}
	public List<Abteilung> getAbteilungen() 
	{
		return abteilungen;
	}
	public List<Mitarbeiter> getPersonal()
	{
		return mitarbeiter;
	}
	public List<Schueler> getSchueler()
	{
	    List<Schueler> alleschueler = new ArrayList<>();
	    
	    Abteilung hilf;
	    
	    for(Iterator<Abteilung> iterator = (this.abteilungen).iterator();iterator.hasNext();)
		{
        	hilf = iterator.next();
        	alleschueler.addAll(hilf.getSchueler());
		}
	    
		return alleschueler;
	}
	public int getAnzahlSchueler()
	{
		return 1;
	}
	public boolean addPersonal(NichtLehrpersonal personal)
	{
		try 
		{
			mitarbeiter.add(personal);
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
	public List<Raum> getRaeume() 
	{
		return raeume;
	}
	public Raum addRaum(Raum Raum) 
	{
		try 
		{
			this.raeume.add(Raum);
			return Raum;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	public String getSchulsprecher() 
	{
		if(this.Schulsprecher == null)
		{
			return "Keiner Zugewiesen";
		}
		else
		{
			return this.Schulsprecher.getVorname() + " " + this.Schulsprecher.getNachname();
		}
	}
	public boolean setSchulsprecher(Schueler Schulsprecher) 
	{
		try 
		{
			this.Schulsprecher = Schulsprecher;
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	public boolean setStammklasse(Abteilung Abteilung, String Klasse, String Raum)
	{  
	    Klasse hilf = null;
	    
	    for(Iterator<Klasse> iterator = (Abteilung.getKlassen()).iterator();iterator.hasNext();)
		{
        	hilf = iterator.next();
        	if (hilf.getBezeichnung().equals(Klasse))
        	{
        	    Raum hilf2 = null;
        	    
        	    for(Iterator<Raum> iterator2 = raeume.iterator();iterator.hasNext();)
        		{
        	    	hilf2 = iterator2.next();
                	if (hilf2.getRaumNummer().equals(Raum))
                	{
                		if(hilf2.setStammklasse(hilf) != true) return false;
                		if(Abteilung.setStammklasse(hilf,hilf2) != true) return false;
                		return true;
                	}
        		}
        	}
		}
	    return false;
	}
}
