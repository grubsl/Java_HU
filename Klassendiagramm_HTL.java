/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Test - main methode
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Klassendiagramm_HTL 
{	
	enum Auswahl 
	{
		SCHULE,ABTEILUNG,ADRESSE,
		PERSONAL,MITARBEITER,LEHRER,NICHTLEHRPERSONAL,SCHUELER,
		KLASSE,FACH,Raum,BELEGUNG,
		ABBRECHEN
	}
	
	public static void main(String[] args) 
	{		
		Schule HTL = new Schule("HTL St.Pölten", "technische", 1120234446248L);	//add L for type Long
		
		Abteilung ET = HTL.addAbteilung("Elektrotechnik", "ET");
		
		System.out.print("\n Informationsseite:" +
						 "\n  Schule \t [1]" +
						 "\n  Abteilung \t [2]" + 
						 "\n  Adresse \t [3]");
		try
		{
			int option;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Eingabe: ");
			option = scan.nextInt() - 1;
						
			switch(Auswahl.values()[option])	// values liefert Array mit enum Konstanten, n.Element = n.Konstante 
			{
			case SCHULE:
				System.out.print(
						"\n" + HTL.getName() + "\t" +
						HTL.getSchulkennzahl() + "\n" +
						HTL.getSchultyp());				
				break;
			case ABTEILUNG:
				System.out.print(
						"\n" + ET.getName() + "\t" +
						ET.getKuerzel());		
				break;

			case ABBRECHEN:
				System.out.println("Programm wurde beendet.");
				scan.close();
				System.exit(0);
			default:
				System.out.println("Fehlerhafte Eingabe");  
				break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Eingabe Abgebrochen");
			
		}
		catch(NumberFormatException e) // falls String eingegeben wird
		{
			System.out.println("1.Auswahl nicht verfügbar!");
		}
		catch(Exception e) 
		{
			System.out.println("Fehler");
		}
	}
}
