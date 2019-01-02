import java.util.ArrayList;
import java.util.List;

/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Lehrer - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Lehrer extends Mitarbeiter
{
	private String kuerzel;
	private List<Abteilung> Abteilungen =new ArrayList<Abteilung>();

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
	public void addAbteilungen(Abteilung A)
	{
		Abteilungen.add(A);
	}
}