/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Abteilung - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Abteilung
{
	private String kuerzel;
	private String name;
	
	private Lehrer Av;
	private Schueler Abteilungssprecher;
	private Schule Schule;
	
	private List<Lehrer> lehrer = new ArrayList<Lehrer>();
	private List<Klasse> klassen = new ArrayList<Klasse>();

	public Abteilung(){}
	public Abteilung(String name,String kuerzel,Schule Schule)
	{
		this.kuerzel = kuerzel;
		this.name = name;
		this.Schule = Schule;
	}
	
	public boolean changeKlassenvorstand(String lehrerkuerzel,String klassenname)
	{
		Klasse hilfkl = null;
		for (Iterator<Klasse> iterator1 = this.klassen.iterator(); iterator1.hasNext();)
		{
			hilfkl = iterator1.next();
			if (hilfkl.getBezeichnung().equals(klassenname))
			{
				Lehrer hilfe = null;
				for (Iterator<Lehrer> iterator = this.lehrer.iterator(); iterator.hasNext();)
				{
					hilfe = iterator.next();
					if (hilfe.getKuerzel().equals(lehrerkuerzel))
					{
						/*Prüft ob anderer Lehrer diesen Vorstand bereits besitzt */
						Lehrer adam = new Lehrer();					
						if((adam = hilfkl.getKlassenvorstand()) != null)
						{
							if((adam.getVorstand())[0] == hilfkl)adam.rmVorstand(true);
							else adam.rmVorstand(false);
						}
						/*Prüft ob hinzufügen erfolgreich war					  */
						if(hilfe.addVorstand(hilfkl) && hilfkl.setKlassenvorstand(hilfe))
						{
							//System.out.println("Vorstand gesetzt!");
							return true;
						}
						else
						{
							System.out.println("Ueberpruefen Sie Ihre Eingabe!(max2Vorstände/Lehrer)");
							return false;
						}
					}
				}
			}
		}
		System.out.println("Ueberpruefen Sie Ihre Eingabe!Richtig benannt?");
		return false;
	}

	public boolean addLehrer(Lehrer L)
	{
		lehrer.add(L);
		return true;
	}
	public Klasse addKlasse(Klasse Klasse)
	{
		klassen.add(Klasse);
		return Klasse;
	}

	public boolean setAbteilungsvorstand(Lehrer Eule, Abteilung Abteilung)
	{
		if(Eule.Aufgabe == false)
		{
			if(this.Av != null)
			{
				Lehrer kruzifix = this.Av;
				kruzifix.Aufgabe = false;
				kruzifix.setAufgabe_Abteilung(null);
			}
			try
			{
				Eule.setAufgabe_Abteilung(Abteilung);
				Av = Eule;
				Eule.Aufgabe = true;	
				//System.out.println("Vorstand gesetzt!");
				return true;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

	public List<Schueler> getSchueler()
	{
	    List<Schueler> alleschueler = new ArrayList<>();
	    
	    Klasse hilf;
	    
	    for(Iterator<Klasse> iterator = (this.klassen).iterator();iterator.hasNext();)
		{
        	hilf = iterator.next();
        	alleschueler.addAll(hilf.getSchueler());
		}
	    
		return alleschueler;
	}

	public String getKuerzel()
	{
		return kuerzel;
	}
	public String getName()
	{
		return name;
	}
	public Lehrer getAv()
	{
		return Av;
	}
	public List<Lehrer> getLehrer()
	{
		return lehrer;
	}
	public List<Klasse> getKlassen()
	{
		return klassen;
	}
	public String getAbteilungssprecher() 
	{
		if(this.Abteilungssprecher == null)
		{
			return "Keiner Zugewiesen";
		}
		else
		{
			return this.Abteilungssprecher.getVorname() + " " + this.Abteilungssprecher.getNachname();
		}
	}
	public boolean setAbteilungssprecher(Schueler Abteilungssprecher) 
	{
		try 
		{
			this.Abteilungssprecher = Abteilungssprecher;
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	public Schule getSchule() 
	{
		return Schule;
	}
	public boolean setStammklasse(Klasse Klasse, Raum Raum)
	{
		try 
		{
			Klasse.setZuhause(Raum,Klasse);
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
}
