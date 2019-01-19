/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Abteilung - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Abteilung
{
	private String kuerzel;
	private String name;
	
	private Lehrer Av;
	private Schueler Abteilungssprecher;
	private Schule Schule;
	
	private List<Lehrer> lehrer = new ArrayList<Lehrer>();
	private List<Klasse> klassen = new ArrayList<Klasse>();

	public Abteilung(){}
	public Abteilung(String name,String kuerzel,Schule Schule)
	{
		this.kuerzel = kuerzel;
		this.name = name;
		this.Schule = Schule;
	//	addKlasse(new Klasse(new Abteilung(name,kuerzel),"1","Start"));
	}

	public boolean addLehrer(Lehrer L)
	{
		lehrer.add(L);
		return true;
	}
	public boolean addKlasse(Klasse klasse)
	{
		klassen.add(klasse);
		return true;
	}

	public boolean setAbteilungsvorstand(Lehrer Eule)
	{
		if(Eule.Aufgabe == false)
		{
			if(Eule != null)
			{
				Av = Eule;
				return true;
			}
		}
		return false;
	}

	public List<Schueler> getSchueler()
	{
	    List<Schueler> alleschueler = new ArrayList<>();
	    
	    Klasse hilf;
	    
	    for(Iterator<Klasse> iterator = (this.klassen).iterator();iterator.hasNext();)
		{
        	hilf = iterator.next();
        	alleschueler.addAll(hilf.getSchueler());
		}
	    
		return alleschueler;
	}

	public String getKuerzel()
	{
		return kuerzel;
	}
	public String getName()
	{
		return name;
	}
	public Lehrer getAv()
	{
		return Av;
	}
	public List<Lehrer> getLehrer()
	{
		return lehrer;
	}
	public List<Klasse> getKlassen()
	{
		return klassen;
	}
	public String getAbteilungssprecher() 
	{
		if(this.Abteilungssprecher == null)
		{
			return "Keiner Zugewiesen";
		}
		else
		{
			return this.Abteilungssprecher.getVorname() + " " + this.Abteilungssprecher.getNachname();
		}
	}
	public boolean setAbteilungssprecher(Schueler Abteilungssprecher) 
	{
		try 
		{
			this.Abteilungssprecher = Abteilungssprecher;
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	public Schule getSchule() 
	{
		return Schule;
	}
}
