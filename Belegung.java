
public class Belegung 
{
	private int unterrichtsEinheit=0;
	
	
	public Belegung() {}
	public Belegung(int unterrichtsEinheit)
	{
		this.unterrichtsEinheit=unterrichtsEinheit;
	}
	
	
	public Unterrichtstag getWochentag()
	{
		return this.Unterrichtstag;
	}
	
	public Klasse getKlasse()
	{
		return this.Klasse;
	}
	
	public Lehrer getLehrer()
	{
		return this.Lehrer;
	}
}
