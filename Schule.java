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
	private long schulsprecher_ID;
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

	public boolean addAbteilung(String name, String kuerzel)
	{
		Abteilung abteilung = new Abteilung(name,kuerzel);
		this.abteilungen.add(abteilung);
		
		return true;
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

	public long getSchulsprecher_ID()
	{
		return schulsprecher_ID;
	}
	public void setSchulsprecher_ID(long Schulsprecher_ID)
	{
		this.schulsprecher_ID = Schulsprecher_ID;
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
	public boolean addRaum(Raum Raum) 
	{
		this.raeume.add(Raum);
		return true;
	}
}
