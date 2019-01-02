/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Lehrer - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Lehrer extends Mitarbeiter
{
	private String kuerzel;

	public Lehrer(){}
	public Lehrer(String kuerzel)
	{
		super();
		this.kuerzel = kuerzel;
	}
	
	public String getKuerzel() 
	{
		return kuerzel;
	}
	public void exportStundenplan()
	{
		
	}
}