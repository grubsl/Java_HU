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
	private Abteilung Abteilung;
	private int klassengröße = 1;
	private Schueler Klassensprecher;
	private Lehrer Klassenvorstand;
	
	private List<Schueler> schueler = new ArrayList<>();
	
	public Klasse(){}
	public Klasse(Abteilung abteilung,int schulstufe,String bezeichnung, Lehrer Klassenvorstand)
	{//schueler.add(new Schueler("4AHELS",0000L,"Alex","Wippel",new Date(),"@",4,true,new Date()));
		this.Klassenvorstand = Klassenvorstand;
		this.Abteilung = abteilung;
		this.schulstufe = schulstufe;
		this.bezeichnung = bezeichnung;
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
	public boolean addSchueler(Schueler schueler)
	{
		if(klassengröße < 36)
		{
			try 
			{
				this.schueler.add(schueler);
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
	public Schueler getKlassensprecher()
	{
		return Klassensprecher;
	}
	public Lehrer getKlassenvorstand() 
	{
		return Klassenvorstand;
	}
}
