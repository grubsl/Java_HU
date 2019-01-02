
public class Raum 
{	
	private String raumNummer="";
	private int maxSitzplaetze=0;
	private Raumtyp raumtyp;
	
	
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
