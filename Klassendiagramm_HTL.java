/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Test - main methode
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;
import java.io.*;
import java.text.*;

public class Klassendiagramm_HTL
{
	enum Auswahl
	{
		SCHULE,ABTEILUNG,ADRESSE,
		PERSONAL,MITARBEITER,LEHRER,NICHTLEHRPERSONAL,SCHUELER,
		KLASSE,FACH,RAUM,BELEGUNG,

		EABT,ENLP,ELP,ES,EK,ER,ABBRECHEN
	}

	
	public static void main(String[] args)
	{
		while(true)
		{
		Schule HTL= new Schule(	"HTL St.Pölten ", "Höhere Technische Lehranstalt" , 1120234446248L,
								"St.Pölten","Waldstraï¿½e",3,3100);	//add L for type Long

		HTL.addAbteilung("Elektrotechnik", "ET");
		HTL.addAbteilung("Elektronik    ", "EL");
		HTL.addAbteilung("Maschinenbau  ", "MB");

		System.out.print("\n Informationsseite:" +
						 "\n  Schule \t\t [1]" +
						 "\n  Abteilung \t\t [2]" +
						 "\n  Adresse \t\t [3]"+
						 "\n  Personal \t\t [4]" +
						 "\n  Mitarbeiter \t\t [5]" +
						 "\n  Lehrer \t\t [6]"+
						 "\n  Nichtlehrpersonal \t [7]" +
						 "\n  Schueler \t\t [8]"+
						 "\n  Klasse \t\t [9]" +
						 "\n  Fach \t\t\t [10]" +
						 "\n  Raum \t\t\t [11]"+
						 "\n  Belegung \t\t [12]" +
						 "\n\n Erschaffe        :" +
						 "\n  Abteilung \t\t [13]" +
						 "\n  Nicht-Lehr-Personal \t [14]" +
						 "\n        Lehr-Personal \t [15]" +
						 "\n  Schueler \t\t [16]" +
						 "\n  Klasse \t\t [17]" +
						 "\n  Raum \t\t\t [18]" +
						 "\n  Abbrechen \t\t [19]");

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
					System.out.print("\n Abteilung:" + hilf.getName() + "\tKuerzel: " + hilf.getKuerzel());
				}
				break;

			case MITARBEITER:

				Mitarbeiter hilfs;

		        for(Iterator<Mitarbeiter> iterator = (HTL.getPersonal()).iterator();iterator.hasNext();)
				{
		        	hilfs = iterator.next();
					System.out.print("\n Mitarbeiter: " + hilfs.getVorname() + " " + hilfs.getNachname()+"\n Geburtsdatum: "+ hilfs.getGeburtsdatum());
				}
		        break;

			case LEHRER:

				Abteilung hilfs_abt; Lehrer hilfs_leh;

		        for(Iterator<Abteilung> iterator2 = (HTL.getAbteilungen()).iterator();iterator2.hasNext();)
				{
		        	hilfs_abt = iterator2.next();
		        	System.out.print("\n\n Lehrer in der Abteilung " + hilfs_abt.getName() + "\n");

		        	try
		        	{
			        	hilfs_abt.addLehrer(new Lehrer(0000L, "Herbert", "Wagner", callDate()
			        			,"perversion@hostdas.at","WAGN \t",hilfs_abt));
		        	}
		        	catch(ParseException e)
		        	{
		        		System.out.print("Ungültiges Format!");
		        	}

			        for(Iterator<Lehrer> iterator3 = (hilfs_abt.getLehrer()).iterator();iterator3.hasNext();)
					{
			        	hilfs_leh = iterator3.next();
			        	hilfs_leh.addVorstand(new Klasse(hilfs_abt,12,"4AHELS", hilfs_leh));
			        	DateFormat df = new SimpleDateFormat("d MM yyyy");
			        	System.out.print("\n Lehrer: " + hilfs_leh.getVorname() + " " + hilfs_leh.getNachname()+
			        		"\t Kuerzel:" + hilfs_leh.getKuerzel() + "\n\t Geburtsdatum:\t "+ df.format(hilfs_leh.getGeburtsdatum()));
			        	try
			        	{
			        		System.out.print("\n\t Klassenvorstand bei:" + (hilfs_leh.getVorstand())[0].getBezeichnung());
			        		System.out.print("\t&\t" + (hilfs_leh.getVorstand())[1].getBezeichnung());
			        	}
			        	catch(Exception e)
			        	{
			        		System.out.print("\t0");
			        	}
					}
				}
		        break;

			case SCHUELER:
				System.out.print(HTL.getSchueler());
				break;

			case KLASSE:

				Abteilung hilfe; Klasse hilfekl;
				int i=0;
				Lehrer lehrer1 = new Lehrer();
				for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
				{
					i++;
					hilfe = iterator.next();
					hilfe.addKlasse(hilfe,i,"1A",lehrer1);
				}

				hilfe = null;
		        for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
				{
		        	hilfe = iterator.next();

		        	for(Iterator<Klasse> iterator2 = (hilfe.getKlassen()).iterator();iterator2.hasNext();)
					{
			        	hilfekl = iterator2.next();
						System.out.print("\n" + hilfekl.getBezeichnung());
					}
				}

				break;

			case EABT:

				break;
			case ENLP:

				break;
			case ELP:

				break;
			case ES:
				hilfe=null;
				boolean b=false;
				String choose = new String("ET");
				String chooseklasse=new String("4AHELS");
				Klasse hilfsklasse=null;
				Schueler schueler =new Schueler();
				
				
				for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
				{
					hilfe = iterator.next();
					if(hilfe.getKuerzel().equals(choose))
					{
						
						for(Iterator<Klasse> iterator2 = (hilfe.getKlassen()).iterator();iterator.hasNext();)
						{
							hilfsklasse = iterator2.next();
							
							if(hilfsklasse.getBezeichnung().equals(chooseklasse))
							{
								b=hilfsklasse.addSchueler(schueler);
								if(b==true)
								{
									System.out.println("Schueler wurde angelegt");
								}
								else
								{
									System.out.println("Fehler beim Anlegen vom Schüler");
								}
							}
						}
					}
				}
				
				break;
			case EK:
				choose =new String("ET");
				for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
				{
					hilfe = iterator.next();
					if(hilfe.getKuerzel().equals(choose))
					{
			        	Lehrer Wagner = new Lehrer(0000L, "Herbert", "Wagner", callDate()
			        			,"perversion@hostdas.at","WAGN \t",hilfe);
						hilfe.addKlasse(hilfe,4,"4AHELS",Wagner);
					}
				}

				break;
			case ER:

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
				e.printStackTrace();
		}
		
		
		try
		{
			Thread.sleep(3500);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for (int i=0; i<10000; i++)
		{
			   System.out.println(); 
		}
		}
	}

	public static Date callDate() throws ParseException, IOException
	{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Date parsedDate = df2.parse("12.02.1974" /*rd.readLine()*/);

		return parsedDate;
	}
	public static String callString() throws IOException
	{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		return rd.readLine();
	}
	public static int callInt(Scanner scan)
	{
		return scan.nextInt();
	}
	public static Long callDouble(Scanner scan)
	{
		return scan.nextLong();
	}
}
