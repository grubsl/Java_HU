/****************************************************************************
* Gruber Lukas ; 4 AHELS
* Person - Basisklasse
* 17.12.2018 - Version 1
****************************************************************************/
import java.util.*;

public class Person 
{
	protected long svnr;
	protected String vorname, nachname;
	protected Date geburtsdatum; 
	protected String email;

	public String getNachname() 
	{
		return nachname;
	}
	public String getVorname() 
	{
		return vorname;
	}
	public Date getGeburtsdatum() 
	{
		return geburtsdatum;
	}
	public String getEmail() 
	{
		return email;
	}
	public long getSvnr() 
	{
		return svnr;
	}
}


