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
		ABBRECHEN
	}

	public static void main(String[] args)
	{
		Schule HTL= new Schule(	"HTL St.P�lten ", "H�here Technische Lehranstalt" , 1120234446248L,
								"St.P�lten","Waldstra�e",3,3100);	//add L for type Long

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
						 "\n  Abbrechen \t\t [13]" +

						 "\n\n Erschaffe        :" +
						 "\n  Abteilung \t\t [14]" +
						 "\n  Nicht-Lehr-Personal \t [15]" +
						 "\n        Lehr-Personal \t [16]" +
						 "\n  Klasse \t\t [17]" +
						 "\n  Raum \t\t\t [18]");

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

			case LEHRER:

				Abteilung hilfs_abt; Lehrer hilfs_leh;

		        for(Iterator<Abteilung> iterator2 = (HTL.getAbteilungen()).iterator();iterator2.hasNext();)
				{
		        	hilfs_abt = iterator2.next();
		        	System.out.print("\n\n Lehrer in der Abteilung " + hilfs_abt.getName() + "\n");

		        	try
		        	{
			        	hilfs_abt.addLehrer(new Lehrer(0000L, "Herbert", "Wagner", callDate(),
			        			,"perversion@hostdas.at","WAGN \t",hilfs_abt));
		        	}
		        	catch(ParseException e)
		        	{
		        		System.out.print("Ung�ltiges Format!");
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

				Abteilung hilfe;
				int i=0;
				Lehrer lehrer1(0000L,"Hermann","Blad",D);
				for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
				{
					i++;
					hilfe = iterator.next();
					hilfe.addKlasse(hilfe,i,"1A",lehrer1);
					System.out.print("ok");
				}
				
				    //List<Schueler> alleschueler = new ArrayList<>();
				    Abteilung hilfsabteilung;
				    Klasse hilfsklasse;
				    
				    for(Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator();iterator.hasNext();)
					{
			        	
				    	hilfsabteilung = iterator.next();
			        	for(Iterator<Klasse> iterator2 = (hilfsabteilung.getKlassen()).iterator();iterator.hasNext();)
			        	{
			        		hilfsklasse=iterator2.next();
			        		System.out.print("\n"+hilfsklasse.getBezeichnung());
			        		
			        	}
						
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

	public static Date callDate() throws ParseException
	{
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Date parsedDate = df2.parse("10.02.1978");

		return parsedDate;
	}
	public static String callString() throws IOException
	{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		return rd.readLine();
	}
	public static int callInt() throws ParseException
	{
		Scanner scanner = new Scanner(System.in);

		return scanner.nextInt();
	}
}
