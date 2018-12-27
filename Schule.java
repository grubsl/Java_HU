/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schule - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Schule
{	
	private String name;
	private Long schulkennzahl;
	private String schultyp;

	Schule(){}
	Schule(String name,String schultyp,Long schulkennzahl)
	{
		this.schultyp = schultyp;
		this.name = name;
		this.schulkennzahl = schulkennzahl;
	}
	
	public boolean addPersonal(NichtLehrpersonal personal)
	{
		return true;
	}	
	public Abteilung addAbteilung(String name, String kuerzel)
	{
		Abteilung Elektronik = null;
		
		return Elektronik; 
	}
	
	public boolean setDirektor(Lehrer lehrer)
	{
		return false;
	}
		
	public Long getSchulkennzahl() 
	{
		return schulkennzahl;
	}
	public String getSchultyp() 
	{
		return schultyp;
	}
	public String getName() 
	{
		return name;
	}
}
