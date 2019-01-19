/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Nichtlehrpersonal - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class NichtLehrpersonal extends Mitarbeiter
{
	Schule Schule;
	
	public NichtLehrpersonal(){super();}
	public NichtLehrpersonal(Long svnr, String vorname, String nachname, Date geburtsdatum, String email, Adresse Adresse, Schule Schule)
	{
		super(svnr, vorname, nachname, geburtsdatum, email, Adresse);
		this.Schule = Schule;
	}
}