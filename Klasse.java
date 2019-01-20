/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Klasse - Klasse
* 17.12.2018 - Version 1
****************************************************************************/
import java.util.*;

public class Klasse
{
	private int schulstufe;
	private String bezeichnung;
	private int klassengröße = 1;
	
	private Abteilung Abteilung;
	private Schueler Klassensprecher;
	private Lehrer Klassenvorstand;
	private Raum Zuhause;
	
	private List<Schueler> schueler = new ArrayList<>();
	
	public Klasse(){}
	public Klasse(Abteilung abteilung,int schulstufe,String bezeichnung,Lehrer Klassenvorstand, Raum Stammklasse)
	{
		this.Abteilung = abteilung;
		this.schulstufe = schulstufe;
		this.bezeichnung = bezeichnung;
		this.Klassenvorstand = Klassenvorstand;
		this.Zuhause = Stammklasse;
	}
	
	public boolean setKlassensprecher(Schueler Schueler)
	{
		try 
		{
			Klassensprecher = Schueler;
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	public String getKlassensprecher()
	{
		if(this.Klassensprecher == null)
		{
			return "Keiner Zugewiesen";
		}
		else
		{
			return this.Klassensprecher.getVorname() + " " + this.Klassensprecher.getNachname();
		}
	}
	public boolean addSchueler(Schueler schueler)
	{
		if(klassengröße < 36)
		{
			try 
			{
				this.schueler.add(schueler);
				this.klassengröße++;
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
	public void exportStundenplan()
	{
		System.out.println("\n !!! 0 !!! \n"); 
	}
	
	public float getDurschnittsalter()
	{
		return (float) 1.0;
	}
	public int getSchulstufe() 
	{
		return schulstufe;
	}
	public String getBezeichnung() 
	{
		return bezeichnung;
	}
	public Abteilung getAbteilung() 
	{
		return Abteilung;
	}
	public List<Schueler> getSchueler() 
	{
		return schueler;
	}
	public Lehrer getKlassenvorstand() 
	{
		return Klassenvorstand;
	}
	public boolean setKlassenvorstand(Lehrer klassenvorstand) 
	{
		try 
		{
			Klassenvorstand = klassenvorstand;
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	public Raum getZuhause() 
	{
		return Zuhause;
	}
	public boolean setZuhause(Raum Zuhause,Klasse Klasse) 
	{
		if(Zuhause.getStammklasse() != null)		//Falls bereits von anderer Klasse Stammklasse
		{
			return false;
		}
		
		try 
		{
			Klasse.getZuhause().setStammklasse(null);	//Damit Raum wieder frei ist
			this.Zuhause = Zuhause;
			Zuhause.setStammklasse(Klasse);
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
}
