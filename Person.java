/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Person - Basisklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public abstract class Person 
{
	protected Long svnr;
	protected String vorname, nachname;
	protected Date geburtsdatum; 
	protected String email;
	
	public Person(){}
	public Person(Long svnr, String vorname, String nachname, Date geburtsdatum, String email) 
	{
		this.svnr = svnr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
	}
	
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
	public Long getSvnr() 
	{
		return svnr;
	}
}


