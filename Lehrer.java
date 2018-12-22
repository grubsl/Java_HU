/****************************************************************************
* Gruber Lukas ; 4 AHELS
* Lehrer - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Lehrer extends Mitarbeiter
{
	private String kuerzel;

	public String getKuerzel() {
		return kuerzel;
	}

	public void setKuerzel(String kuerzel) {
		this.kuerzel = kuerzel;
	}
	
	public void exportStundenplan()
	{
		
	}

	Lehrer()
	{
		super();
	}
}