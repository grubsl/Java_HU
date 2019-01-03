import java.util.Date;

/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Nichtlehrpersonal - SubSubklasse
* 17.12.2018 - Version 1
****************************************************************************/

public class NichtLehrpersonal extends Mitarbeiter
{
	public NichtLehrpersonal(Long svnr, String vorname, String nachname, Date geburtsdatum, String email)
	{
		super(svnr, vorname, nachname, geburtsdatum, email);
	}
}