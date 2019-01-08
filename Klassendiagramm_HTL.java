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
		Schule HTL = new Schule("HTL St.Poelten ", "Hoehere Technische Lehranstalt", 1120234446248L,
				"St.Poelten", "Waldstrasse", 3, 3100); // add L for type Long

		HTL.addAbteilung("Elektrotechnik", "ET");
		HTL.addAbteilung("Elektronik    ", "EL");
		HTL.addAbteilung("Maschinenbau  ", "MB");

		HTL.addRaum(new Raum("W211", 25, Raumtyp.KLASSENZIMMER));
		HTL.addRaum(new Raum("W213", 35, Raumtyp.KLASSENZIMMER));

		while(true)
		{
			System.out.print("\n Informationsseite:" + "\n  Schule \t\t [1]" + "\n  Abteilung \t\t [2]"
					+ "\n  Adresse \t\t [3]" + "\n  Personal \t\t [4]" + "\n  Mitarbeiter \t\t [5]"
					+ "\n  Lehrer \t\t [6]" + "\n  Nichtlehrpersonal \t [7]" + "\n  Schueler \t\t [8]"
					+ "\n  Klasse \t\t [9]" + "\n  Fach \t\t\t [10]" + "\n  Raum \t\t\t [11]" + "\n  Belegung \t\t [12]"
					+ "\n\n Erschaffe        :" + "\n  Abteilung \t\t [13]" + "\n  Nicht-Lehr-Personal \t [14]"
					+ "\n        Lehr-Personal \t [15]" + "\n  Schueler \t\t [16]" + "\n  Klasse \t\t [17]"
					+ "\n  Raum \t\t\t [18]" + "\n  Abbrechen \t\t [19]");

			try
			{
				int option;
				Scanner scan = new Scanner(System.in);

				System.out.print("\n\nEingabe: ");
				option = scan.nextInt() - 1;

				switch (Auswahl.values()[option]) // values liefert Array mit enum Konstanten, n.Element = n.Konstante
				{
				case SCHULE:
					
					System.out.print("\n" + HTL.getName() + "\t" + HTL.getSchulkennzahl() + "\n" + HTL.getSchultyp());
					HTL.printOrt();
					break;
					
				case ABTEILUNG:

					Abteilung hilf = new Abteilung();

					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilf = iterator.next();
						System.out.print("\n Abteilung:" + hilf.getName() + "\tKuerzel: " + hilf.getKuerzel());
					}
					break;
					
				case ADRESSE:
					HTL.printOrt();
					break;

				case MITARBEITER:

					System.out.print("\n Anzahl der Mitarbeiter:" + Mitarbeiter.getAnzahl());
					break;
					
				case PERSONAL:
					System.out.print("\n Bitte Chase Lehrer und Nichtlehrpersonal betätigen!");
					break;
					
				case LEHRER:

					Abteilung hilfs_abt;
					Lehrer hilfs_leh;

					for (Iterator<Abteilung> iterator2 = (HTL.getAbteilungen()).iterator(); iterator2.hasNext();) {
						hilfs_abt = iterator2.next();
						System.out.print("\n\n Lehrer in der Abteilung " + hilfs_abt.getName() + "\n");

						try {
							hilfs_abt.addLehrer(new Lehrer(0000L, "Herbert", "Wagner", callDate(),
									"perversion@hostdas.at", "WAGN \t", hilfs_abt));
						} catch (ParseException e) {
							System.out.print("Ungï¿½ltiges Format!");
						}

						for (Iterator<Lehrer> iterator3 = (hilfs_abt.getLehrer()).iterator(); iterator3.hasNext();) {
							hilfs_leh = iterator3.next();
							hilfs_leh.addVorstand(new Klasse(hilfs_abt, 12, "4AHELS", hilfs_leh));
							DateFormat df = new SimpleDateFormat("d MM yyyy");
							System.out.print("\n Lehrer: " + hilfs_leh.getVorname() + " " + hilfs_leh.getNachname()
									+ "\t Kuerzel:" + hilfs_leh.getKuerzel() + "\n\t Geburtsdatum:\t "
									+ df.format(hilfs_leh.getGeburtsdatum()));
							try {
								System.out.print(
										"\n\t Klassenvorstand bei:" + (hilfs_leh.getVorstand())[0].getBezeichnung());
								System.out.print("\t&\t" + (hilfs_leh.getVorstand())[1].getBezeichnung());
							} catch (Exception e) {
								System.out.print("\t0");
							}
						}
					}
					break;
					
				case NICHTLEHRPERSONAL:
					
					Mitarbeiter hilfe_NichtLehrpersonal;
					
					for (Iterator<Mitarbeiter> iterator = (HTL.getPersonal()).iterator(); iterator.hasNext();)
					{
						hilfe_NichtLehrpersonal = iterator.next();
						System.out.print("\n" + hilfe_NichtLehrpersonal.getVorname() + " " + hilfe_NichtLehrpersonal.getNachname());
					}
					break;

				case SCHUELER:
					
					Schueler hilfe_schueler;
					
					for (Iterator<Schueler> iterator = (HTL.getSchueler()).iterator(); iterator.hasNext();)
					{
						hilfe_schueler = iterator.next();
						System.out.print("\n" + hilfe_schueler.getVorname() + " " + hilfe_schueler.getNachname());
					}
					break;

				case KLASSE:

					Abteilung hilfe;
					Klasse hilfekl;
					hilfe = null;hilfekl = null;

					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfe = iterator.next();

						for (Iterator<Klasse> iterator2 = (hilfe.getKlassen()).iterator(); iterator2.hasNext();)
						{
							hilfekl = iterator2.next();
							System.out.print("\n" + hilfekl.getAbteilung().getKuerzel() + ":\t" + hilfekl.getBezeichnung());
						}
					}

					break;
					
				case FACH:
					
					break;
					
				case RAUM:
					
					Raum hilfe_raum;
					
					for (Iterator<Raum> iterator = (HTL.getRaeume()).iterator(); iterator.hasNext();)
					{
						hilfe_raum = iterator.next();
						System.out.print("\n" + hilfe_raum.getRaumNummer() + " " + hilfe_raum.getMaxSitzplaetze() + " " + hilfe_raum.getRaumtyp());
					}
					break;
					
				case BELEGUNG:
					
					break;
					
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				case EABT:
					
					try
					{
						System.out.println("Folgend wird abgefragt: Bezeichnung,Kuerzel");
						if(HTL.addAbteilung(callString(), callString()))
						{
							System.out.println("Abteilung wurde angelegt");
							break;
						}
						else
						{
							System.out.println("Fehler beim Anlegen von Abteilung!");
							break;
						}
					}
					catch (Exception e)
					{
						System.out.println("Nicht erfolgreich!");
					}
					break;
					
				case ENLP:
					
					try
					{
						System.out.println("Folgend wird abgefragt: svnr,vorname,nachname,geburtsdatum,email");
						if(HTL.addPersonal(new NichtLehrpersonal(callLong(scan), callString(), callString(), callDate(),callString())))
						{
							System.out.println("N-Lp. wurde angelegt");
							break;
						}
						else
						{
							System.out.println("Fehler beim Anlegen von N-Lehrpersonal");
							break;
						}
					}
					catch (Exception e)
					{
						System.out.println("Nicht erfolgreich!");
					}
					break;
					
				case ELP:
					
					String choose;
					try
					{
						System.out.println("Abteilung:");choose = callString();
					}
					catch (Exception e)
					{
						System.out.println("Auswahl inkorrekt!");
						break;
					}
					
					hilfe = null;
					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfe = iterator.next();
						if (hilfe.getKuerzel().equals(choose))
						{
							try 
							{
								System.out.println("Folgend wird abgefragt: svnr,V-name,N-name\n,geb.(z.B.:10.12.2000),email,kuerzel");
								if(hilfe.addLehrer(new Lehrer(callLong(scan), callString(), callString(), callDate(),
										callString(), callString(), hilfe)))
								{
									System.out.println("Lehrer wurde angelegt");
									break;
								}
								System.out.println("Fehler!");
							}
							catch(Exception e)
							{
								System.out.println("Auswahl inkorrekt!");
								break;
							}
						}
					}
					break;
					
				case ES:
					
					hilfe = null;
					Klasse hilfsklasse = null;
					System.out.println("Folgend wird abgefragt: Abteilung,Klasse");
					choose = new String(callString());
					String chooseklasse = new String(callString());
					
					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfe = iterator.next();
						if (hilfe.getKuerzel().equals(choose))
						{
							for (Iterator<Klasse> iterator2 = (hilfe.getKlassen()).iterator(); iterator2.hasNext();)
							{
								hilfsklasse = iterator2.next();

								if (hilfsklasse.getBezeichnung().equals(chooseklasse))
								{
									System.out.println("Folgend wird abgefragt: svnr,vorname,nachname,geburtsdatum,\n"
										+ "email,katalognummer,eigenberechtigt(true,false),eintrittsdatum");
									if (hilfsklasse.addSchueler(new Schueler(new Klasse(),callLong(scan),
										callString(),callString(),callDate(),callString(),callint(scan),callboolean(),callDate())))
									{
										System.out.println("Schueler wurde angelegt");
										break;
									}
									else
									{
										System.out.println("Fehler beim Anlegen vom Schueler!");
										break;
									}
								}
							}
						}
					}

					break;
					
				case EK:
					
					hilfe = null;
					Lehrer Lehrer = new Lehrer();
					try 
					{
						System.out.println("Abteilung:");choose = callString();
					} 
					catch (IOException e) 
					{
						System.out.println("Auswahl inkorrekt!");
						break;
					}
					
					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfe = iterator.next();
						if (hilfe.getKuerzel().equals(choose))
						{
							try 
							{
								System.out.println("Folgend wird abgefragt: Jahrgang,Bezeichnung");
								if(hilfe.addKlasse(hilfe, callint(scan),callString(),Lehrer))
								{
									System.out.println("Klasse wurde angelegt");
									break;
								}
								else
								{
									System.out.println("Nicht erfolgreich!");
									break;
								}
							} 
							catch (Exception e) 
							{
								System.out.println("Nicht erfolgreich!");
								break;
							}
						}
					}
					break;
					
				case ER:
					
					try
					{
						System.out.println("Folgend wird abgefragt: Nummer,Sitzplätze,Raumtyp(1..4)");
						if(HTL.addRaum(new Raum(callString(), callint(scan), Raumtyp.values()[callint(scan)])))
						{
							System.out.println("Raum wurde angelegt");
						}
						else
						{
							System.out.println("Nicht erfolgreich!");
						}
					}
					catch (Exception e) 
					{
						System.out.println("Nicht erfolgreich!");
					}
					break;
					
				case ABBRECHEN:
					System.out.println("Programm wurde beendet.");
					scan.close();
					System.exit(0);
				default:
					System.out.println("Fehlerhafte Eingabe");
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Eingabe Abgebrochen");
			}
			catch (NumberFormatException e)
			{
				System.out.println("Fehlerhafte Eingabe");
			}
			catch (Exception e)
			{
				System.out.println("Fehler");
				e.printStackTrace();
			}

			try
			{
				System.in.read();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

		/*try
		{
			Thread.sleep(3500);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}*/

			try
			{
				System.in.read();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

		    System.out.flush();
		}
	}

	public static Date callDate() throws ParseException, IOException
	{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Date parsedDate = df2.parse(rd.readLine());

		return parsedDate;
	}
	public static String callString() throws IOException
	{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		return rd.readLine();
	}
	public static int callint(Scanner scan) throws Exception
	{
		return scan.nextInt();
	}
	public static Long callLong(Scanner scan) throws Exception
	{
		return scan.nextLong();
	}
	public static boolean callboolean() throws IOException
	{
		String hilf = callString();
		if(hilf.equals("true"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
