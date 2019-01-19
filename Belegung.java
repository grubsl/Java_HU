/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Belegung - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Belegung 
{
	private int unterrichtsEinheit;
	private Fach Fach;
	
	public Belegung(){}
	public Belegung(int unterrichtsEinheit, Fach Fach)
	{
		this.Fach = Fach;
		this.unterrichtsEinheit=unterrichtsEinheit;
	}
	
	public Unterrichtstag getWochentag()
	{
		return Unterrichtstag.DIENSTAG;
	}
	public int getUnterrichtsEinheit() 
	{
		return unterrichtsEinheit;
	}
	public Fach getFach() 
	{
		return Fach;
	}

	/*public Klasse getKlasse()
	{
		return this.Klasse;
	}
	
	public Lehrer getLehrer()
	{
		return this.Lehrer;
	}*/
}
