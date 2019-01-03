/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schule - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

import java.util.*;

public class Schule
{
	private String name;
	private Long schulkennzahl;
	private String schultyp;
	private Adresse Ort = new Adresse();
	
	
	//Zum Testen der Funktionen add und get Schueler
	Date datum1;
	Schueler schlagla = new Schueler(100L,"Herbert","Oaschloch",datum1,"hua@gmail.com",20,false,datum1);
	

	private long schulsprecher_ID;
	private Lehrer Direktor;

	private List<NichtLehrpersonal> nichtlehrpersonal = new ArrayList<>();
	private List<Abteilung> abteilungen = new ArrayList<>();
	private List<Mitarbeiter> mitarbeiter = new ArrayList<>();
	private List<Schueler> schueler = new ArrayList<>();
	
	
	
	
	public Schule(){}
	public Schule(String name,String schultyp,Long schulkennzahl,
			String ort,String strasse,Integer nr,Integer plz)
	{
		this.schultyp = schultyp;
		this.name = name;
		this.schulkennzahl = schulkennzahl;
		Ort = new Adresse(ort,strasse,nr,plz);
	}


	public Abteilung addAbteilung(String name, String kuerzel)
	{
		Abteilung abteilung = new Abteilung(name,kuerzel);
		abteilungen.add(abteilung);
		
		return abteilung;
		
		/*BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		try
    	{
    		name = rd.readLine();
    		kuerzel = rd.readLine();
    	}
    	catch(IOException e)
    	{
    		System.out.println("Bad luck ...");
    		e.printStackTrace();
    	}

		Abteilung X = new Abteilung(name, kuerzel);*/
	}

	public boolean setDirektor(Lehrer Lehrer)
	{
		if(Lehrer.Aufgabe == false)
		{
			if(Lehrer != null)
			{
				Lehrer = Direktor;
				return true;
			}
		}
		return false;
	}

	public Long getSchulkennzahl()
	{
		return schulkennzahl;
	}
	public String getSchultyp()
	{
		return schultyp;
	}
	public String getName()
	{
		return name;
	}
	public void printOrt()
	{
		Ort.printAdresse();
	}

	public long getSchulsprecher_ID()
	{
		return schulsprecher_ID;
	}
	public void setSchulsprecher_ID(long Schulsprecher_ID)
	{
		this.schulsprecher_ID = Schulsprecher_ID;
	}
	public void addNichtlehrpersonal(NichtLehrpersonal x)
	{
		nichtlehrpersonal.add(x);
	}
	public List<Abteilung> getAbteilungen() 
	{
		return abteilungen;
	}
	public List<Mitarbeiter> getPersonal()
	{
		return mitarbeiter;
	}
	public List<Schueler> getSchueler()
	{
		return schueler;
	}
	public int getAnzahlSchueler()
	{
		return 1;
	}
	public boolean addPersonal(NichtLehrpersonal personal)
	{
		try 
		{
			mitarbeiter.add(personal);
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
	public void addSchuelerTest1()
	{
		schueler.add(schlagla);
	}
}
