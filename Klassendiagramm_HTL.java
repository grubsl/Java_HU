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
		MITARBEITER,LEHRER,NICHTLEHRPERSONAL,SCHUELER,
		KLASSE,FACH,RAUM,

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

		Fach ggp=new Fach("GGP",1,Raumtyp.KLASSENZIMMER);
		Fach deutsch=new Fach("Deutsch",2,Raumtyp.KLASSENZIMMER);
		Fach englisch=new Fach("englisch",3,Raumtyp.KLASSENZIMMER);
		Fach am=new Fach("AM",4,Raumtyp.KLASSENZIMMER);
		Fach dic=new Fach("DIC",5,Raumtyp.KLASSENZIMMER);

		Date test = new Date();	//gibt aktuelles Datum an, alternativ zur Benutzereingabe callDate() einsetzen
		//Um jeden Lehrer richtiges geb zuzuweisen callDate() statt test einsetzen
		Lehrer a = new Lehrer(1121L,"Albert","Strau�",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L1",a1,new Fach(),HTL);
		Lehrer b = new Lehrer(1121L,"Manuel","Wiesi",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L2",a1,new Fach(),HTL);
		b.addAbteilungen(a3);
		Lehrer c = new Lehrer(1121L,"Alex","Pfeifer",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L3",a2,new Fach(),HTL);
		Lehrer d = new Lehrer(1121L,"Fabian","Sickinger",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L4",a2,new Fach(),HTL);
		d.addAbteilungen(a1);
		Lehrer e = new Lehrer(1121L,"Anna","Jings",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L5",a3,new Fach(),HTL);
		Lehrer f = new Lehrer(1121L,"Nonan","Ole",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L6",a3,new Fach(),HTL);
		f.addAbteilungen(a2);
		Lehrer x = new Lehrer(1121L,"Albert","Johann",test,"gffs@d.at",new Adresse("sdf","dfs",4,34),"L7",a3,new Fach(),HTL);

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

		a1.setAbteilungsvorstand(a,a1);
		a2.setAbteilungsvorstand(c,a2);
		a3.setAbteilungsvorstand(f,a3);

		a1.setAbteilungsvorstand(b,a1);	// ET erh�lt neuen AV
		HTL.setDirektor(a);
		if(HTL.setDirektor(b) == false) //System.out.print("Keine 2 Vorst�nde m�glich!");
		HTL.setDirektor(e);
		a1.setAbteilungsvorstand(a,a1);	// Aufgabe des Direktors wird �bertragen, a kann neue Aufgabe �bernehmen

		Raum N211 = HTL.addRaum(new Raum("N211", 15, Raumtyp.KLASSENZIMMER));
		Raum N212 = HTL.addRaum(new Raum("N212", 25, Raumtyp.KLASSENZIMMER));
		Raum N213 = HTL.addRaum(new Raum("N213", 25, Raumtyp.KLASSENZIMMER));
		Raum N214 = HTL.addRaum(new Raum("N214", 35, Raumtyp.KLASSENZIMMER));

		Raum O211 = HTL.addRaum(new Raum("O211", 15, Raumtyp.KLASSENZIMMER));
		Raum O212 = HTL.addRaum(new Raum("O212", 25, Raumtyp.KLASSENZIMMER));
		Raum O213 = HTL.addRaum(new Raum("O213", 25, Raumtyp.KLASSENZIMMER));
		Raum O214 = HTL.addRaum(new Raum("O214", 35, Raumtyp.KLASSENZIMMER));

		Raum W211 = HTL.addRaum(new Raum("W211", 15, Raumtyp.KLASSENZIMMER));
		Raum W212 = HTL.addRaum(new Raum("W212", 25, Raumtyp.KLASSENZIMMER));
		Raum W213 = HTL.addRaum(new Raum("W213", 25, Raumtyp.KLASSENZIMMER));
		Raum W214 = HTL.addRaum(new Raum("W214", 35, Raumtyp.KLASSENZIMMER));

		Raum X111 = HTL.addRaum(new Raum("X111", 50, Raumtyp.KLASSENZIMMER));

		Klasse AHETS2 = a1.addKlasse(new Klasse(a1, 2,"2AHETS",a,N211,deutsch));		Klasse AHMBA2 = a2.addKlasse(new Klasse(a2, 2,"2AHMBA",c,O211,am));
		Klasse AHETS3 = a1.addKlasse(new Klasse(a1, 3,"3AHETS",d,N212,englisch));		Klasse AHMBA3 = a2.addKlasse(new Klasse(a2, 3,"3AHMBA",c,O212,ggp));
		Klasse AHETS4 = a1.addKlasse(new Klasse(a1, 4,"4AHETS",a,N213,ggp));		Klasse AHMBA4 = a2.addKlasse(new Klasse(a2, 4,"4AHMBA",d,O213,englisch));
		Klasse AHETS5 = a1.addKlasse(new Klasse(a1, 5,"5AHETS",b,N214,dic));		Klasse AHMBA5 = a2.addKlasse(new Klasse(a2, 5,"5AHMBA",f,O214,deutsch));

		Klasse AHELS2 = a3.addKlasse(new Klasse(a3, 2,"2AHELS",e,W211,am));
		Klasse AHELS3 = a3.addKlasse(new Klasse(a3, 3,"3AHELS",e,W212,ggp));
		Klasse AHELS4 = a3.addKlasse(new Klasse(a3, 4,"4AHELS",f,W213,deutsch));
		Klasse AHELS5 = a3.addKlasse(new Klasse(a3, 5,"5AHELS",b,W214,englisch));

		N211.setStammklasse(AHETS2);N212.setStammklasse(AHETS3);N213.setStammklasse(AHETS4);N214.setStammklasse(AHETS5);
		O211.setStammklasse(AHMBA2);O212.setStammklasse(AHMBA3);O213.setStammklasse(AHMBA4);O214.setStammklasse(AHMBA5);
		W211.setStammklasse(AHELS2);W212.setStammklasse(AHELS3);W213.setStammklasse(AHELS4);W214.setStammklasse(AHELS5);

		Schueler s1 = new Schueler(AHETS2,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s2 = new Schueler(AHETS3,0123L,"Hermann","Kleinfuss",test,"herkfuss@gmail.com",new Adresse("Hermannsdorf","Strasse",44,3100),test,false);
		Schueler s3 = new Schueler(AHETS4,0123L,"David","Blondhaar",test,"davblo@gmnail.com",new Adresse("Wien","Strasse",44,3100),test,false);
		Schueler s4 = new Schueler(AHETS5,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s5 = new Schueler(AHELS2,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s6 = new Schueler(AHELS3,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s7 = new Schueler(AHELS4,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s8 = new Schueler(AHELS5,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s9 = new Schueler(AHMBA2,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s10 = new Schueler(AHMBA3,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s11 = new Schueler(AHMBA4,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		Schueler s12 = new Schueler(AHMBA5,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);

		AHETS2.addSchueler(s1);		AHELS2.addSchueler(s5);		AHMBA2.addSchueler(s9);
		AHETS3.addSchueler(s2);		AHELS3.addSchueler(s6);		AHMBA3.addSchueler(s10);
		AHETS4.addSchueler(s3);		AHELS4.addSchueler(s7);		AHMBA4.addSchueler(s11);
		AHETS5.addSchueler(s4);		AHELS5.addSchueler(s8);		AHMBA5.addSchueler(s12);

		Schueler t_kat = new Schueler(AHETS2,0123L,"Ibraham","Stevic",test,"ibra@stec.sb",new Adresse("St.P�lten","Wald",44,3100),test,false);
		AHETS2.addSchueler(t_kat);

		//for(int i = 1; i <= 37; i++) {if(AHETS2.addSchueler(s1) == false) System.out.print("Max erreicht");} // bei 36 ist das Maximum erreicht

		AHETS2.setKlassensprecher(s1);AHETS3.setKlassensprecher(s2);AHETS4.setKlassensprecher(s3);AHETS5.setKlassensprecher(s4);
		AHELS2.setKlassensprecher(s5);AHELS3.setKlassensprecher(s6);AHELS4.setKlassensprecher(s7);AHELS5.setKlassensprecher(s8);
		AHMBA2.setKlassensprecher(s9);AHMBA3.setKlassensprecher(s10);AHMBA4.setKlassensprecher(s11);AHMBA5.setKlassensprecher(s12);

		a1.setAbteilungssprecher(s1);
		a2.setAbteilungssprecher(s12);
		a3.setAbteilungssprecher(s5);

		HTL.setSchulsprecher(s4);

		a1.changeKlassenvorstand("L1", "2AHETS");		a3.changeKlassenvorstand("L5", "2AHELS");
		a1.changeKlassenvorstand("L1", "4AHETS");		a3.changeKlassenvorstand("L5", "3AHELS");
		a1.changeKlassenvorstand("L2", "5AHETS");		a3.changeKlassenvorstand("L6", "4AHELS");
		a3.changeKlassenvorstand("L2", "5AHELS");		a2.changeKlassenvorstand("L6", "5AHMBA");
		a2.changeKlassenvorstand("L3", "2AHMBA");		a2.changeKlassenvorstand("L4", "4AHMBA");
		a2.changeKlassenvorstand("L3", "3AHMBA");		a1.changeKlassenvorstand("L4", "3AHETS");

		//a1.changeKlassenvorstand("AJ4", "4AHETS");		// 3.Vorstand geht nicht

		a3.setStammklasse(AHELS5,X111);
		a.exportStundenplan();			//Laut Angabe auszuf�hren/funktioniert aber nicht
		AHETS2.exportStundenplan();
		N211.exportBelegung();

		HTL.addPersonal(new NichtLehrpersonal(1L,"Putzkraft1","a",test,"1@gmail.com",new Adresse("St.Polten","Wald",44,3100),HTL));
		HTL.addPersonal(new NichtLehrpersonal(2L,"Putzkraft2","b",test,"2@gmail.com",new Adresse("St.Polten","Wald",44,3100),HTL));
		HTL.addPersonal(new NichtLehrpersonal(3L,"Putzkraft3","c",test,"3@gmail.com",new Adresse("St.Polten","Wald",44,3100),HTL));
		HTL.addPersonal(new NichtLehrpersonal(4L,"Putzkraft4","d",test,"4@gmail.com",new Adresse("St.Polten","Wald",44,3100),HTL));
		HTL.addPersonal(new NichtLehrpersonal(5L,"Putzkraft5","e",test,"5@gmail.com",new Adresse("St.Polten","Wald",44,3100),HTL));

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Folgender Abteil: Anzeige der Auswahlm�glichkeiten//////////////////////////////////////////////////////////////////////////

		while(true)
		{
			System.out.print("Schueleranzahl: " + HTL.getAnzahlSchueler() + "\n");

			System.out.print("\n Informationsseite:"
					+ "\n  Schule \t\t [1]"
					+ "\n  Abteilung \t\t [2]"
					+ "\n  Adresse \t\t [3]"
					+ "\n  Mitarbeiter \t\t [4]"
					+ "\n  Lehrer \t\t [5]"
					+ "\n  Nichtlehrpersonal \t [6]"
					+ "\n  Schueler \t\t [7]"
					+ "\n  Klasse \t\t [8]"
					+ "\n  Fach \t\t\t [9]"
					+ "\n  Raum \t\t\t [10]"
					+ "\n\n Erschaffe        :"
					+ "\n  Abteilung \t\t [11]"
					+ "\n  Nicht-Lehr-Personal \t [12]"
					+ "\n        Lehr-Personal \t [13]"
					+ "\n  Schueler \t\t [14]"
					+ "\n  Klasse \t\t [15]"
					+ "\n  Raum \t\t\t [16]"
					+ "\n  Abbrechen \t\t [17]");

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
					System.out.print("\nDirektor     : " + HTL.getDirektor().getKuerzel());
					HTL.printOrt();
					break;

				case ABTEILUNG:

					Abteilung hilf = null;

					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilf = iterator.next();
						System.out.print("\n Abteilung:" + hilf.getName() + "\tKuerzel: " + hilf.getKuerzel());
						try
						{
							System.out.print("\n Abteilungssprecher: " + hilf.getAbteilungssprecher());
						}
						catch (Exception e1)
						{
							System.out.print("\n Abteilungssprecher: Keiner Zugewiesen");
						}

						try
						{
							System.out.print("\n Abteilungsvorstand: " + hilf.getAv().getKuerzel());
						}
						catch (Exception e1)
						{
							System.out.print("\n Abteilungsvorstand: Keiner Zugewiesen");
						}
					}
					break;

				case ADRESSE:
					HTL.printOrt();
					break;

				case MITARBEITER:

					System.out.print("\n Anzahl der Mitarbeiter:" + Mitarbeiter.getAnzahl());
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

							System.out.print("\n\t Abteilungen:");
							Abteilung hilf_intern;
							hilf_intern = null;
							for (Iterator<Abteilung> iterator_intern = (hilfs_leh.getAbteilungen()).iterator(); iterator_intern.hasNext();)
							{
								hilf_intern = iterator_intern.next();
								System.out.print(hilf_intern.getKuerzel() + "  ");
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
						System.out.print("\n" + hilfe_schueler.getKlasse().getBezeichnung() + " " + hilfe_schueler.getKatalognummer() + ": " +
										hilfe_schueler.getVorname() + " " + hilfe_schueler.getNachname());
					}
					break;

				case KLASSE:

					Abteilung hilfe;
					Klasse hilfekl;
					Fach hilfef;
					hilfe = null;hilfekl = null;hilfef=null;
					int i=1;
					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfe = iterator.next();

						for (Iterator<Klasse> iterator2 = (hilfe.getKlassen()).iterator(); iterator2.hasNext();)
						{
							hilfekl = iterator2.next();
							System.out.print("\n" + hilfekl.getAbteilung().getKuerzel() + ":\t" + hilfekl.getBezeichnung());
							System.out.print("\tKlassensprecher: " + hilfekl.getKlassensprecher() + " Klassenvorstand:" + hilfekl.getKlassenvorstand().getKuerzel());
							System.out.print("\tStammklasse: " + hilfekl.getZuhause().getRaumNummer());

							for (Iterator<Fach> iterator3 = (hilfekl.getFaecher()).iterator(); iterator3.hasNext();)
							{
								hilfef=iterator3.next();
								System.out.print(" Fach" + i + ": " + hilfef.getName());
								//System.out.print(i);
								i++;
							}
							i=1;
						}
					}

					break;

				case FACH:

					Abteilung hilfsa;
					Lehrer hilfsl;
					Fach hilfsf;
					hilfsa=null;
					hilfsl=null;
					hilfsf=null;



					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfsa=iterator.next();
						for (Iterator<Lehrer> iterator2 = (hilfsa.getLehrer()).iterator(); iterator2.hasNext();)
						{
							hilfsl=iterator2.next();

							System.out.println(hilfsl.getKuerzel());
							System.out.print("\t");
							System.out.println("Faecher: ");

							for (Iterator<Fach> iterator3 = (hilfsl.getFaecher()).iterator(); iterator3.hasNext();)
							{
								hilfsf=iterator3.next();
								System.out.println("\t" + hilfsf.getName());
							}
						}
					}

					break;

				case RAUM:

					Klasse hilfsk;
					hilfsk=null;
					hilfsa=null;
					hilfsf=null;

					for (Iterator<Abteilung> iterator = (HTL.getAbteilungen()).iterator(); iterator.hasNext();)
					{
						hilfsa=iterator.next();
						for (Iterator<Klasse> iterator2 = (hilfsa.getKlassen()).iterator(); iterator2.hasNext();)
						{
							hilfsk=iterator2.next();

							System.out.println(hilfsk.getBezeichnung());

							for (Iterator<Fach> iterator3 = (hilfsk.getFaecher()).iterator(); iterator3.hasNext();)
							{
								hilfsf=iterator3.next();
								System.out.println("\t" + hilfsf.getName());
							}
						}
					}


					/*for (Iterator<Raum> iterator = (HTL.getRaeume()).iterator(); iterator.hasNext();)
					{
						hilfe_raum = iterator.next();
						System.out.print("\n" + hilfe_raum.getRaumNummer() + " " + hilfe_raum.getMaxSitzplaetze() + " " + hilfe_raum.getRaumtyp());

						try
						{
							System.out.print("\n Stammklasse von: " + hilfe_raum.getStammklasse().getBezeichnung());
						}
						catch(NullPointerException e0)
						{
							System.out.print("\n Stammklasse von: Keine Zugewiesen");
						}
					}*/
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
										callString(), new Adresse(callString(),callString(),callint(scan),callint(scan)), callString(), hilfe, dic,HTL)))
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
													 + ",email,Adresse(ort,strasse,hausnummer,plz), \n" +
													   "eintrittsdatum,eigenberechtigt(true,false)");
									if (hilfsklasse.addSchueler(new Schueler(hilfsklasse,callLong(scan),
										callString(),callString(),callDate(),callString(),
										new Adresse(callString(),callString(),callint(scan),callint(scan)),callDate(),callboolean())))
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
								if(hilfe.addKlasse(new Klasse(hilfe, callint(scan),callString(),x,O211,ggp)) != null)
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
						if(HTL.addRaum(new Raum(callString(), callint(scan), Raumtyp.values()[callint(scan)])) != null)
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
