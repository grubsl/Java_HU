/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schüler - Subklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Schueler extends Person
{
	private int katalognummer;
	private boolean eigenberechtigt;
	private Date eintrittsdatum;
	private static int Schueleranz;
	
	public Schueler(){Schueleranz++;}
	public Schueler(int katalognummer,boolean eigenberechtigt,Date eintrittsdatum)
	{
		super();
		this.katalognummer = katalognummer;
		this.eigenberechtigt = eigenberechtigt;
		this.eintrittsdatum = eintrittsdatum;
		Schueleranz++;
	}
	
	public int getKatalognummer() 
	{
		return katalognummer;
	}
	public boolean isEigenberechtigt() 
	{
		return eigenberechtigt;
	}
	public Date getEintrittsdatum() 
	{
		return eintrittsdatum;
	}
}
