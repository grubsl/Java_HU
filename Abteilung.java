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
	private List<Lehrer> lehrer = new ArrayList<Lehrer>();
	private Set<Klasse> klassen = new TreeSet<Klasse>();
	
	

	public Abteilung(){}
	public Abteilung(String name,String kuerzel)
	{
		this.kuerzel = kuerzel;
		this.name = name;
	}

	public void addLehrer(Lehrer L)
	{
		lehrer.add(L);
	}
	public void addKlasse(Abteilung abteilung,int schulstufe,String bezeichnung,Lehrer Klassenvorstand)
	{
		klassen.add(new Klasse(abteilung,schulstufe,bezeichnung,Klassenvorstand));
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
	    Abteilung hilfsabteilung;
	    
	    for(Iterator<Abteilung> iterator = (HTL.getPersonal()).iterator();iterator.hasNext();)
		{
        	hilfsabteilung = iterator.next();
			System.out.print("\n Mitarbeiter: " + hilfs.getVorname() + " " + hilfs.getNachname()+"\n Geburtsdatum: "+ hilfs.getGeburtsdatum());
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
	public Set<Klasse> getKlassen()
	{
		return klassen;
	}
	public void addKlasse(Klasse k)
	{
		klassen.add(k);
	}
}
