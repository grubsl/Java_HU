import java.util.Date;

/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Mitarbeiter - Subklasse
* 17.12.2018 - Version 1
****************************************************************************/

public abstract class Mitarbeiter extends Person 
{
	static private int anzahl;

	public static int getAnzahl() 
	{
		return anzahl;
	}
	
	public Mitarbeiter()
	{
		super();
		Mitarbeiter.anzahl++;
	}
	public Mitarbeiter(Long svnr, String vorname, String nachname, Date geburtsdatum, String email, Adresse Adresse)
	{
		super(svnr, vorname, nachname, geburtsdatum, email, Adresse);
		Mitarbeiter.anzahl++;
	}
}
