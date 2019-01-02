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
	private Schule Schule;
	private Abteilung Abteilung;
	public boolean Aufgabe;

	private List<Abteilung> Abteilungen =new ArrayList<Abteilung>();

	public Lehrer(){}
	public Lehrer(String kuerzel,Schule Schule,Abteilung Abteilung)
	{
		super();
		Aufgabe = false;
		this.kuerzel = kuerzel;
		this.Abteilung = Abteilung;
		this.Schule = Schule;
	}

	public String getKuerzel()
	{
		return kuerzel;
	}
	public void exportStundenplan()
	{

	}

	public Abteilung getAbteilung()
	{
		return Abteilung;
	}
	public void addAbteilungen(Abteilung A)
	{
		Abteilungen.add(A);
	}
}
