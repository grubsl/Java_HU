/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Raum - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Raum 
{	
	private enum RAUMTYP
	{
		KLASSENZIMMER,LABORRAUM
	}
	
	private String raumNummer="";
	private int maxSitzplaetze=0;
	private Raumtyp raumtyp;
	
	
	public Raum() {}
	public Raum(String raumNummer, int maxSitzplaetze, Raumtyp raumtyp) 
	{
		this.raumNummer = raumNummer;
		this.maxSitzplaetze = maxSitzplaetze;
		this.raumtyp = raumtyp;
	}
	
	
	public String getRaumNummer() 
	{
		return raumNummer;
	}
	public void setRaumNummer(String raumNummer)
	{
		this.raumNummer = raumNummer;
	}
	public int getMaxSitzplaetze()
	{
		return maxSitzplaetze;
	}
	public void setMaxSitzplaetze(int maxSitzplaetze)
	{
		this.maxSitzplaetze = maxSitzplaetze;
	}
}
