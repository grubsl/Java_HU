/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Lehrer - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Lehrer extends Mitarbeiter
{
	private String kuerzel;
	private Abteilung Abteilung;
	public boolean Aufgabe;

	private Klasse[] vorstand = new Klasse[2];
	
	private List<Abteilung> Abteilungen = new ArrayList<Abteilung>();
	private List<Fach> faecher = new ArrayList<Fach>();
	
	public Lehrer(){}
	public Lehrer(Long svnr, String vorname, String nachname, Date geburtsdatum, String email, String kuerzel,Abteilung Abteilung)
	{
		super(svnr, vorname, nachname, geburtsdatum, email);
		Aufgabe = false;
		this.kuerzel = kuerzel;
		this.Abteilung = Abteilung;
		vorstand[0]=null;
		vorstand[1]=null;
	}

	public String getKuerzel()
	{
		return kuerzel;
	}
	public void exportStundenplan()
	{

	}

	public Abteilung getAbteilung()
	{
		return Abteilung;
	}
	public void addAbteilungen(Abteilung A)
	{
		Abteilungen.add(A);
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
	public Klasse[] getVorstand()
	{
		return vorstand;
	}
}
