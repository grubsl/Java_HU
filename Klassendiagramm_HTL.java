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
		KLASSE,FACH,RAUM,BELEGUNG,
		ABBRECHEN
	}
	
	public static void main(String[] args) 
	{		
		Schule HTL= new Schule(	"HTL St.Pölten ", "Höhere Technische Lehranstalt" , 1120234446248L, 
								"St.Pölten","Waldstraße",3,3100);	//add L for type Long 
		
		
		//Test der Funktionen add und get Schueler
		/*HTL.addSchuelerTest1();
		HTL.getSchueler();
		Schueler hs =new Schueler();
		for(Iterator<Schueler> iterator = (HTL.getSchueler()).iterator();iterator.hasNext();)
		{
        	hs = iterator.next();
			System.out.print("\n Schueler: " + hs.getVorname() + " " + hs.getNachname()+"\n Geburtsdatum: "+ hs.getGeburtsdatum());
		}*/
		
		HTL.addAbteilung("Elektrotechnik", "ET");
		HTL.addAbteilung("Elektronik    ", "EL");
		HTL.addAbteilung("Maschinenbau  ", "MB");
		Schueler alex = new Schueler();
		
		System.out.print("\n Informationsseite:" +
						 "\n  Schule \t [1]" +
						 "\n  Abteilung \t [2]" + 
						 "\n  Adresse \t [3]");
		try
		{
			int option;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("\n\nEingabe: ");
			option = scan.nextInt() - 1;
						
			switch(Auswahl.values()[option])	// values liefert Array mit enum Konstanten, n.Element = n.Konstante 
			{
			case SCHULE:
				System.out.print(
						"\n" + HTL.getName() + "\t" +
						HTL.getSchulkennzahl() + "\n" +
						HTL.getSchultyp());		
					HTL.printOrt();
				break;
			case ABTEILUNG:
				
				Abteilung hilf = new Abteilung();
				
		        for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
				{
		        	hilf = iterator.next();
					System.out.print("\n Abteilung:" + hilf.getName() + "\t Kuerzel" + hilf.getKuerzel());
				}			
				
				/*int i = 0;
				while(Sammel[i] != null)
				{
					System.out.print(
						"\n Abteilung:" + Sammel[i].getName() + "\t" +
						"Kuerzel" + Sammel[i].getKuerzel());
					i++;
				}*/
				break;
				
			case MITARBEITER:
				
				Mitarbeiter hilfs;
				
		        for(Iterator<Mitarbeiter> iterator = (HTL.getPersonal()).iterator();iterator.hasNext();)
				{
		        	hilfs = iterator.next();
					System.out.print("\n Mitarbeiter: " + hilfs.getVorname() + " " + hilfs.getNachname()+"\n Geburtsdatum: "+ hilfs.getGeburtsdatum());
				}
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
		catch(NumberFormatException e)
		{
			System.out.println("Fehlerhafte Eingabe");
		}
		catch(Exception e) 
		{
			System.out.println("Fehler");
		}
	}
}
