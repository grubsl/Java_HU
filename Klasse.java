/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Klasse - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Klasse
{
	private int schulstufe;
	private String bezeichnung;
	
	Klasse(){}
	Klasse(int schulstufe,String bezeichnung)
	{
		this.schulstufe = schulstufe;
		this.bezeichnung = bezeichnung;
	}
	
	public int getSchulstufe() 
	{
		return schulstufe;
	}
	public String getBezeichnung() 
	{
		return bezeichnung;
	}
}
