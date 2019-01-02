
public class Fach 
{
	String name="";
	int wochenstunden=0;
	Raumtyp raumanforderung;
	
	
	
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
}
