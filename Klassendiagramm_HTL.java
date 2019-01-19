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
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Folgender Abteil: Um Funktionalitaet aufzuzeigen/////////////////////////////////////////////////////////////////////////////
		
		Schule HTL = new Schule("HTL St.Poelten ", "Hoehere Technische Lehranstalt", 1120234446248L,
				"St.Poelten", "Waldstrasse", 3, 3100); // add L for type Long
		
		Abteilung a1 = HTL.addAbteilung("Elektrotechnik", "ET",HTL);
		Abteilung a2 = HTL.addAbteilung("Maschinenbau  ", "MB",HTL);
		Abteilung a3 = HTL.addAbteilung("Elektronik    ", "EL",HTL);
		
		Date test = new Date();
		//Um jeden Lehrer richtiges geb zuzuweisen callDate() statt test einsetzen
		Lehrer a = new Lehrer(1121L,"Albert","Strau�",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ1",a1);
		Lehrer b = new Lehrer(1121L,"Manuel","Wiesi",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ2",a1);
		b.addAbteilungen(a3);
		Lehrer c = new Lehrer(1121L,"Alex","Pfeifer",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ3",a2);
		Lehrer d = new Lehrer(1121L,"Fabian","Sickinger",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ4",a2);
		d.addAbteilungen(a1);
		Lehrer e = new Lehrer(1121L,"Anna","Jings",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ5",a3);
		Lehrer f = new Lehrer(1121L,"Nonan","Ole",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ6",a3);
		f.addAbteilungen(a2);
		Lehrer x = new Lehrer(1121L,"Albert","Johann",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"AJ7",a3);

		a1.addLehrer(a);	a2.addLehrer(a);	a3.addLehrer(a);
		a1.addLehrer(b);	a2.addLehrer(b);	a3.addLehrer(b);
		a1.addLehrer(c);	a2.addLehrer(c);	a3.addLehrer(c);
		a1.addLehrer(d);	a2.addLehrer(d);	a3.addLehrer(d);
		a1.addLehrer(e);	a2.addLehrer(e);	a3.addLehrer(e);
		a1.addLehrer(f);	a2.addLehrer(f);	a3.addLehrer(f);
		a3.addLehrer(x);	
		
		a.addAbteilungen(a2);a.addAbteilungen(a3);		c.addAbteilungen(a1);c.addAbteilungen(a3);
		b.addAbteilungen(a2);b.addAbteilungen(a3);		d.addAbteilungen(a1);d.addAbteilungen(a3);
		e.addAbteilungen(a1);e.addAbteilungen(a2);		f.addAbteilungen(a1);f.addAbteilungen(a2);
		
		a1.addKlasse(new Klasse(a1, 2,"2AHETS",a));		a2.addKlasse(new Klasse(a2, 2,"2AHMBA",c));
		a1.addKlasse(new Klasse(a1, 3,"3AHETS",d));		a2.addKlasse(new Klasse(a2, 3,"3AHMBA",c));
		a1.addKlasse(new Klasse(a1, 4,"4AHETS",a));		a2.addKlasse(new Klasse(a2, 4,"4AHMBA",d));
		a1.addKlasse(new Klasse(a1, 5,"5AHETS",b));		a2.addKlasse(new Klasse(a2, 5,"5AHMBA",f));
		
		a3.addKlasse(new Klasse(a3, 2,"2AHELS",e));	
		a3.addKlasse(new Klasse(a3, 3,"3AHELS",e));	
		a3.addKlasse(new Klasse(a3, 4,"4AHELS",f));	
		a3.addKlasse(new Klasse(a3, 5,"5AHELS",b));	
		
		a1.changeKlassenvorstand("AJ1", "2AHETS");		a3.changeKlassenvorstand("AJ5", "2AHELS");
		a1.changeKlassenvorstand("AJ1", "4AHETS");		a3.changeKlassenvorstand("AJ5", "3AHELS");
		a1.changeKlassenvorstand("AJ2", "5AHETS");		a3.changeKlassenvorstand("AJ6", "4AHELS");
		a3.changeKlassenvorstand("AJ2", "5AHELS");		a2.changeKlassenvorstand("AJ6", "5AHMBA");
		a2.changeKlassenvorstand("AJ3", "2AHMBA");		a2.changeKlassenvorstand("AJ4", "4AHMBA");
		a2.changeKlassenvorstand("AJ3", "3AHMBA");		a1.changeKlassenvorstand("AJ4", "3AHETS");
		
		//a1.changeKlassenvorstand("AJ4", "4AHETS");		// 3.Vorstand geht nicht

		HTL.addRaum(new Raum("W211", 25, Raumtyp.KLASSENZIMMER));
		HTL.addRaum(new Raum("W213", 35, Raumtyp.KLASSENZIMMER));
		HTL.addRaum(new Raum("W214", 35, Raumtyp.KLASSENZIMMER));
		HTL.addRaum(new Raum("W215", 35, Raumtyp.KLASSENZIMMER));
		HTL.addRaum(new Raum("W217", 35, Raumtyp.KLASSENZIMMER));
		
		HTL.setStammklasse(a3, "4AHELS", "W211");
		HTL.setStammklasse(a1, "2AHETS", "W215");
		HTL.setStammklasse(a3, "4AHELS", "W211");
		HTL.setStammklasse(a1, "2AHETS", "W215");
		HTL.setStammklasse(a3, "4AHELS", "W211");
	
		
		

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Folgender Abteil: Anzeige der Auswahlm�glichkeiten//////////////////////////////////////////////////////////////////////////
		
		while(true)
		{
			System.out.print("\n Informationsseite:" + "\n  Schule \t\t [1]" + "\n  Abteilung \t\t [2]"
					+ "\n  Adresse \t\t [3]" + "\n  Personal \t\t [4]" + "\n  Mitarbeiter \t\t [5]"
					+ "\n  Lehrer \t\t [6]" + "\n  Nichtlehrpersonal \t [7]" + "\n  Schueler \t\t [8]"
					+ "\n  Klasse \t\t [9]" + "\n  Fach \t\t\t [10]" + "\n  Raum \t\t\t [11]" + "\n  Belegung \t\t [12]"
					+ "\n\n Erschaffe        :" + "\n  Abteilung \t\t [13]" + "\n  Nicht-Lehr-Personal \t [14]"
					+ "\n        Lehr-Personal \t [15]" + "\n  Schueler \t\t [16]" + "\n  Klasse \t\t [17]"
					+ "\n  Raum \t\t\t [18]" + "\n  Abbrechen \t\t [19]");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Folgender Abteil: Anzeigen aller zu Klassen zugeh�rigen Elemente nach Auswahl///////////////////////////////////////////////
			
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
					System.out.print("\nSchulsprecher: " + HTL.getSchulsprecher());
					HTL.printOrt();
					break;
					
				case ABTEILUNG:

					Abteilung hilf = new Abteilung();

					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilf = iterator.next();
						System.out.print("\n Abteilung:" + hilf.getName() + "\tKuerzel: " + hilf.getKuerzel());
						System.out.print("\n Abteilungssprecher: " + hilf.getAbteilungssprecher());
					}
					break;
					
				case ADRESSE:
					HTL.printOrt();
					break;

				case MITARBEITER:

					System.out.print("\n Anzahl der Mitarbeiter:" + Mitarbeiter.getAnzahl());
					break;
					
				case PERSONAL:
					System.out.print("\n Bitte Chase Lehrer und Nichtlehrpersonal bet�tigen!");
					break;
					
				case LEHRER:

					Abteilung hilfs_abt;
					Lehrer hilfs_leh;

					for (Iterator<Abteilung> iterator2 = (HTL.getAbteilungen()).iterator(); iterator2.hasNext();) 
					{
						hilfs_abt = iterator2.next();
						System.out.print("\n\n Lehrer in der Abteilung " + hilfs_abt.getName() + "\n");

						for (Iterator<Lehrer> iterator3 = (hilfs_abt.getLehrer()).iterator(); iterator3.hasNext();) 
						{
							hilfs_leh = iterator3.next();
							DateFormat df = new SimpleDateFormat("d MM yyyy");
							System.out.print("\n Lehrer: " + hilfs_leh.getVorname() + " " + hilfs_leh.getNachname()
									+ "\t Kuerzel:" + hilfs_leh.getKuerzel() + "\n\t Geburtsdatum:\t "
									+ df.format(hilfs_leh.getGeburtsdatum()));
							
							System.out.print("\n\t Klassenvorstand bei:");
							try 
							{							
								System.out.print((hilfs_leh.getVorstand())[0].getBezeichnung());
							} 
							catch (Exception e14) 
							{
								System.out.print("\t0");
							}
							System.out.print("\t&\t");
							try
							{
								System.out.print((hilfs_leh.getVorstand())[1].getBezeichnung());
							}
							catch(Exception e15)
							{
								System.out.print("0");
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
							System.out.print("\tKlassensprecher: " + hilfekl.getKlassensprecher() + " Klassenvorstand:" + hilfekl.getKlassenvorstand().getKuerzel());
							//System.out.print("\tStammklasse: " + hilfekl.getZuhause().getRaumNummer());
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
						System.out.print("\n" + hilfe_raum.getRaumNummer() + " " + hilfe_raum.getMaxSitzplaetze() + " " + hilfe_raum.getRaumtyp() +
								 	     "\n Stammklasse von: " + hilfe_raum.getStammklasse().getBezeichnung());
					}
					break;
					
				case BELEGUNG:
					
					break;
					
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Folgender Abteil: Erzeugen von neuen Klassen ///////////////////////////////////////////////////////////////////////////////
					
				case EABT:
					
					try
					{
						System.out.println("Folgend wird abgefragt: Kl.Stufe,Kl.Name,Bezeichnung,Kuerzel");
						Abteilung aberz = new Abteilung();
						aberz = HTL.addAbteilung(callString(), callString(), HTL);

						if(aberz != null)
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
					catch (Exception e13)
					{
						System.out.println("Nicht erfolgreich!");
					}
					break;
					
				case ENLP:
					
					try
					{
						System.out.println("Folgend wird abgefragt: svnr,vorname,nachname,geburtsdatum,"
										  +"\nemail, Adresse(ort,strasse,hausnummer,plz),kuerzel");
						if(HTL.addPersonal(new NichtLehrpersonal(callLong(scan), callString(), callString(), callDate(),callString(),
								new Adresse(callString(),callString(),callint(scan),callint(scan)),HTL)))
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
					catch (Exception e12)
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
					catch (Exception e2)
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
								System.out.println("Folgend wird abgefragt: svnr,V-name,N-name" + 
												   "\n,geb.(z.B.:10.12.2000),email," +
												   "\nAdresse(ort,strasse,hausnummer,plz),kuerzel");
								if(hilfe.addLehrer(new Lehrer(callLong(scan), callString(), callString(), callDate(),
										callString(), new Adresse(callString(),callString(),callint(scan),callint(scan)), callString(), hilfe)))
								{
									System.out.println("Lehrer wurde angelegt");
									break;
								}
								System.out.println("Fehler!");
							}
							catch(Exception e3)
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
													 + ",Adresse(ort,strasse,hausnummer,plz), email,katalognummer, \n" + 
													   "eigenberechtigt(true,false),eintrittsdatum");
									if (hilfsklasse.addSchueler(new Schueler(hilfsklasse,callLong(scan),
										callString(),callString(),callDate(),callString(),
										new Adresse(callString(),callString(),callint(scan),callint(scan)),callint(scan),callboolean(),callDate())))
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
					try 
					{
						System.out.println("Abteilung:");choose = callString();
					} 
					catch (IOException e11) 
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
								System.out.println("Folgend wird abgefragt: Jahrgang,Bezeichnung,Name des Vorstands");
								if(hilfe.addKlasse(new Klasse(hilfe, callint(scan),callString(),x)))
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
							catch (Exception e4) 
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
						System.out.println("Folgend wird abgefragt: Nummer,Sitzpl�tze,Raumtyp(1..4)");
						if(HTL.addRaum(new Raum(callString(), callint(scan), Raumtyp.values()[callint(scan)])))
						{
							System.out.println("Raum wurde angelegt");
						}
						else
						{
							System.out.println("Nicht erfolgreich!");
						}
					}
					catch (Exception e5) 
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
			catch (InputMismatchException e6)
			{
				System.out.println("Eingabe Abgebrochen");
			}
			catch (NumberFormatException e7)
			{
				System.out.println("Fehlerhafte Eingabe");
			}
			catch (Exception e8)
			{
				System.out.println("Fehler");
				e8.printStackTrace();
			}

			try
			{
				System.in.read();
			}
			catch (IOException e9)
			{
				e9.printStackTrace();
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
			catch (IOException e10)
			{
				e10.printStackTrace();
			}

		    System.out.flush();
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Folgender Abteil: Hilfreiche Methoden zur Eingabe///////////////////////////////////////////////////////////////////////////
	
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
