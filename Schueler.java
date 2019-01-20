/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schüler - Subklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Schueler extends Person
{
	private int katalognummer;
	private boolean eigenberechtigt;
	private Date eintrittsdatum;
	private Klasse Klasse;
	private static long schueleranz = 0;
	private static long schueler_id;
	
	public Schueler(){schueleranz++;}
	public Schueler(Klasse Klasse,Long svnr, String vorname, String nachname, Date geburtsdatum, String email, Adresse Adresse, 
					boolean eigenberechtigt,Date eintrittsdatum)
	{
		super(svnr, vorname, nachname, geburtsdatum, email, Adresse);
		this.Klasse = Klasse;
		schueleranz++;
		schueler_id = schueleranz;
		this.eigenberechtigt = eigenberechtigt;
		this.eintrittsdatum = eintrittsdatum;
	}
	
	public int getKatalognummer() 
	{
		return katalognummer;
	}
	public boolean isEigenberechtigt() 
	{
		return eigenberechtigt;
	}
	public Date getEintrittsdatum() 
	{
		return eintrittsdatum;
	}
	public static long getSchueleranz() 
	{
		return schueleranz;
	}
	public static long getSchueler_id() 
	{
		return schueler_id;
	}
	public Klasse getKlasse() 
	{
		return Klasse;
	}
	public void setKatalognummer(int katalognummer) 
	{
		this.katalognummer = katalognummer;
	}
}
