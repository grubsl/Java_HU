/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Lehrer - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Lehrer extends Mitarbeiter
{
	private String kuerzel;
	public boolean Aufgabe;
	private Schule Schule;

	private Abteilung Aufgabe_Abteilung;
	private Klasse[] vorstand = new Klasse[2];

	private List<Abteilung> Abteilungen = new ArrayList<Abteilung>();

	private List<Fach> faecher = new ArrayList<Fach>();

	public Lehrer(){super();}
	public Lehrer(	Long svnr, String vorname, String nachname, Date geburtsdatum, String email, Adresse Adresse,
					String kuerzel,Abteilung Abteilung, Fach fach, Schule Schule)
	{
		super(svnr, vorname, nachname, geburtsdatum, email, Adresse);
		this.Schule = Schule;
		Aufgabe = false;
		this.kuerzel = kuerzel;
		addAbteilungen(Abteilung);
		this.Aufgabe_Abteilung = null;
		vorstand[0]=null;
		vorstand[1]=null;
		faecher.add(fach);
	}

	public String getKuerzel()
	{
		return kuerzel;
	}
	public void exportStundenplan()
	{

	}
	public boolean addAbteilungen(Abteilung A)
	{
		if(this.Abteilungen.contains(A))
		{
			return false;
		}
		Abteilungen.add(A);
		return true;
	}
	public List<Abteilung> getAbteilungen()
	{
		return Abteilungen;
	}
	public void addFach(String name,int wochenstunden,Raumtyp raumanforderung)
	{
		faecher.add(new Fach(name,wochenstunden,raumanforderung));
	}
	public boolean addVorstand(Klasse klasse)
	{
		try
		{
			if(this.vorstand[0] == null)
			{
				vorstand[0] = klasse;
			}
			else if(this.vorstand[1] == null)
			{
				vorstand[1] = klasse;
			}
			else
			{
				return false;
			}
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public void rmVorstand(boolean b)
	{
		if(b)this.vorstand[0] = null;
		else this.vorstand[1] = null;
	}
	public Klasse[] getVorstand()
	{
		return vorstand;
	}

	public List<Fach> getFaecher()
	{
		return faecher;
	}
	public boolean addFach(Fach fach)
	{
		Fach hf=new Fach();
		for (Iterator<Fach> iterator = (this.getFaecher()).iterator(); iterator.hasNext();)
		{
			hf = iterator.next();
			if(hf==fach)
			{
				System.out.println("Fach wird bereits unterrichtet");
				return false;
			}
		}
		faecher.add(fach);
		return true;
	}
	public Abteilung getAufgabe_Abteilung()
	{
		return Aufgabe_Abteilung;
	}
	public void setAufgabe_Abteilung(Abteilung aufgabe_Abteilung)
	{
		Aufgabe_Abteilung = aufgabe_Abteilung;

	}
	public Schule getSchule() 
	{
		return Schule;
	}
	public void setSchule(Schule schule) 
	{
		Schule = schule;
	}
}
