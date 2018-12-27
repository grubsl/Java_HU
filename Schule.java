/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schule - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Schule
{	
	private String name="";
	private int schulkennzahl=0;
	private String schultyp="";
			

	public boolean addPersonal(NichtLehrpersonal personal)
	{
		return true;
	}
		
	public void addAbteilung(String name, String kuerzel)
	{
			
	}
		
	public void getSchulkennzahl(int zahl)
	{
		zahl = schulkennzahl;
	}
	
	public void getSchultyp(String schultyph)
	{
		
	}

	public String getSchultyp() 
	{
		return schultyp;
	}

	public void setSchultyp(String schultyp) 
	{
		this.schultyp = schultyp;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}
