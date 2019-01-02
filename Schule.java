/****************************************************************************
* Gruber Lukas ; Alexander Wippel ; 4 AHELS
* Schule - Klasse
* 17.12.2018 - Version 1
****************************************************************************/

public class Schule
{	
	private String name;
	private Long schulkennzahl;
	private String schultyp;
	private Adresse Ort = new Adresse();
	private Schueler Schulsprecher;
	
	

	public Schule(){}
	public Schule(String name,String schultyp,Long schulkennzahl,
			String ort,String strasse,Integer nr,Integer plz)
	{
		this.schultyp = schultyp;
		this.name = name;
		this.schulkennzahl = schulkennzahl;
		Ort = new Adresse(ort,strasse,nr,plz);
	}
	
	public boolean addPersonal(NichtLehrpersonal personal)
	{
		return true;
	}	
	public Abteilung addAbteilung(String name, String kuerzel)
	{
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
		
		return new Abteilung(name,kuerzel); 
	}
	
	public boolean setDirektor(Lehrer lehrer)
	{
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
	public void setSchulsprecher(Schueler Schulsprecher)
	{
		this.Schulsprecher=Schulsprecher;
	}
}
