import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fach 
{
	private String name="";
	private int wochenstunden;
	private Raumtyp raumanforderung;
	private Belegung x;
	
	private List<Lehrer> lehrer = new ArrayList<Lehrer>();
	private List<Klasse> klassen = new ArrayList<Klasse>();
		
	public Fach() {}
	public Fach(String name, int wochenstunden, Raumtyp raumanforderung) 
	{
		this.name = name;
		this.wochenstunden = wochenstunden;
		this.raumanforderung = raumanforderung;
	}

	public String getName() 
	{
		return name;
	}
	public Raumtyp getRaumanforderung() 
	{
		return raumanforderung;
	}
	public void setBelegung(int unterrichtsEinheit,Fach Fach)
	{
		x=new Belegung(unterrichtsEinheit,Fach);
	}
	public void addLehrer(Lehrer Lehrer)
	{
		lehrer.add(Lehrer);
	}
	public int getWochenstunden() 
	{
		return wochenstunden;
	}
	public void setWochenstunden(int wochenstunden) 
	{
		this.wochenstunden = wochenstunden;
	}
	public Belegung getX() 
	{
		return x;
	}
	public boolean addKlasse(Klasse Klasse, Fach Fach)
	{
		Klasse hf = null;
		
		for (Iterator<Klasse> iterator = (this.klassen).iterator(); iterator.hasNext();)
		{
			hf = iterator.next();
			if(hf==Klasse)
			{
				return false;
			}
		}
		
		try 
		{
			klassen.add(Klasse);
			Klasse.addFach(Fach, Klasse);
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
}
