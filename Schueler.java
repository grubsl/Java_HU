/****************************************************************************
* Gruber Lukas ; 4 AHELS
* Schüler - Subklasse
* 17.12.2018 - Version 1
****************************************************************************/
import java.util.*;

public class Schueler extends Person
{
	private int katalognummer;
	private boolean eigenberechtigung;
	private Date eintrittsdatum;
	
	public int getKatalognummer() 
	{
		return katalognummer;
	}
	public void setKatalognummer(int katalognummer) 
	{
		this.katalognummer = katalognummer;
	}
	
	public boolean isEigenberechtigung() 
	{
		return eigenberechtigung;
	}
	public void setEigenberechtigung(boolean eigenberechtigung) {
		this.eigenberechtigung = eigenberechtigung;
	}
	
	public Date getEintrittsdatum() 
	{
		return eintrittsdatum;
	}
	public void setEintrittsdatum(Date eintrittsdatum) 
	{
		this.eintrittsdatum = eintrittsdatum;
	}
	
	Schueler()
	{
		super();
	}
}
