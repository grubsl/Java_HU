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

	Schule(){}
	Schule(String name,String schultyp,Long schulkennzahl)
	{
		this.schultyp = schultyp;
		this.name = name;
		this.schulkennzahl = schulkennzahl;
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
}
