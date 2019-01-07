import java.util.ArrayList;
import java.util.List;

public class Fach 
{
	private String name="";
	private int wochenstunden=0;
	private Raumtyp raumanforderung;
	private Belegung x;
	
	private List<Lehrer> lehrer = new ArrayList<Lehrer>();
	
	
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
	public void setBelegung(int unterrichtsEinheit)
	{
		x=new Belegung(unterrichtsEinheit);
	}
	public void addLehrer(Lehrer Lehrer)
	{
		lehrer.add(Lehrer);
	}
}
