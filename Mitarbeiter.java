/****************************************************************************
* Gruber Lukas ; 4 AHELS
* Mitarbeiter - Subklasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Mitarbeiter extends Person 
{
	static private int anzahl;

	public static int getAnzahl() 
	{
		return anzahl;
	}
	public static void setAnzahl(int anzahl) 
	{
		Mitarbeiter.anzahl = anzahl;
	}
	
	Mitarbeiter()
	{
		super();
		Mitarbeiter.anzahl++;
	}
}
