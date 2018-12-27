/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Adresse - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Adresse
{	
	private String ort;
	private String strasse;
	private Integer hausnummer;
	private Integer plz;
	
	Adresse(String ort,String strasse,Integer hausnummer,Integer plz)
	{
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
	}
	
	public String getOrt() 
	{
		return ort;
	}

	public String getStrasse() 
	{
		return strasse;
	}

	public Integer getHausnummer() 
	{
		return hausnummer;
	}

	public Integer getPlz() 
	{
		return plz;
	}
}
