/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Abteilung - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Abteilung
{	
	private String kuerzel;
	private String name;
	private Lehrer Av;
	
	public Abteilung(){}
	public Abteilung(String name,String kuerzel)
	{
		this.kuerzel = kuerzel;
		this.name = name;
	}
	
	public boolean addLehrer(Lehrer Eule)
	{
		return false;
	}
	
	public boolean setAbteilungsvorstand(Lehrer Eule)
	{
		if(Eule.Aufgabe == false)
		{
			if(Eule != null)
			{
				Av = Eule;
				return true;
			}
		}
		return false;
	}
	
	public String getSchueler() 
	{
		return "Not done yet!";
	}
	
	public String getKuerzel() 
	{
		return kuerzel;
	}
	public String getName() 
	{
		return name;
	}
	public Lehrer getAv() 
	{
		return Av;
	}		
}
