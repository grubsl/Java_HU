/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Belegung - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Belegung 
{
	private int unterrichtsEinheit;
	private Fach x;
	
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
	public void setFach(String name, int wochenstunden, Raumtyp raumanforderung)
	{
		x=new Fach(name,wochenstunden,raumanforderung);
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
