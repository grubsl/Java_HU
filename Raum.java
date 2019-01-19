import java.util.ArrayList;
import java.util.List;

/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Raum - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Raum 
{		
	private String raumNummer="";
	private int maxSitzplaetze=0;
	private Raumtyp Raumtyp;
	private Klasse Stammklasse;
	
	private List<Belegung> belegungen = new ArrayList<Belegung>();
	
	public Raum() {}
	public Raum(String raumNummer, int maxSitzplaetze, Raumtyp Raumtyp) 
	{
		this.raumNummer = raumNummer;
		this.maxSitzplaetze = maxSitzplaetze;
		this.Raumtyp = Raumtyp;
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
	public Raumtyp getRaumtyp() 
	{
		return Raumtyp;
	}
	public void addBelegung(int unterrichtsEinheit, Fach Fach)
	{
		belegungen.add(new Belegung(unterrichtsEinheit, Fach));
	}
	public List<Belegung> getBelegungen() 
	{
		return belegungen;
	}
	public void setStammklasse(Klasse k)
	{
		Stammklasse=k;
	}
	public Klasse getStammklasse() 
	{
		return Stammklasse;
	}
}
