/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Lehrer - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Lehrer extends Mitarbeiter
{
	private String kuerzel;
	private Abteilung Abteilung;
	public boolean Aufgabe;

	private List<Abteilung> Abteilungen =new ArrayList<Abteilung>();

	public Lehrer(){}
	public Lehrer(String kuerzel,Abteilung Abteilung)
	{
		super();
		Aufgabe = false;
		this.kuerzel = kuerzel;
		this.Abteilung = Abteilung;
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
