/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Test - main methode
* 17.12.2018 - Version 1
****************************************************************************/

public class Klassendiagramm_HTL 
{
	public static void main(String[] args) 
	{
		Schule HTL = new Schule("HTL St.Pölten", "technische", 1120234446248L);	//add L for type Long
		
		HTL.addAbteilung("Elektrotechnik", "ET");
		
		System.out.print(HTL.getName()+"\n");
		Abteilung ET = HTL.addAbteilung("Elektrotechnik", "ET");
		System.out.print(ET.getName());	//ist Abteilung geschachtelte Klasse?
	}
}
