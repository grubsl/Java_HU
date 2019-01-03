/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Belegung - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Belegung 
{
	private int unterrichtsEinheit;
	
	public Belegung(){}
	public Belegung(int unterrichtsEinheit)
	{
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
	
	/*public Klasse getKlasse()
	{
		return this.Klasse;
	}
	
	public Lehrer getLehrer()
	{
		return this.Lehrer;
	}*/
}
