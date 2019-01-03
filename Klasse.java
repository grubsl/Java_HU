/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Klasse - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Klasse
{
	private int schulstufe;
	private String bezeichnung;
	private Abteilung abteilung;
	
	public Klasse(){}
	public Klasse(Abteilung abteilung,int schulstufe,String bezeichnung)
	{
		this.abteilung = abteilung;
		this.schulstufe = schulstufe;
		this.bezeichnung = bezeichnung;
	}
	
	public boolean setKlassensprecher(Schueler schueler)
	{
		return false;
	}
	public boolean addSchueler(Schueler schueler)
	{
		return false;
	}
	public void exportStundenplan()
	{
		System.out.println("\n !!! 0 !!! \n"); 
	}
	
	public float getDurschnittsalter()
	{
		return (float) 1.0;
	}
	public int getSchulstufe() 
	{
		return schulstufe;
	}
	public String getBezeichnung() 
	{
		return bezeichnung;
	}
	public Abteilung getAbteilung() 
	{
		return abteilung;
	}
}
