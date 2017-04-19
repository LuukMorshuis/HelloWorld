
public class Student {
	
	
	String name;
	char geslachtV		= 'v';
	char geslachtM		= 'm';
	int leeftijd 		= 0;
	double klas			= 4;
	boolean	kek			= true;
	
	
	String temp = Character.toString(geslachtV);
	String temp2 = Character.toString(geslachtM);
	
	
	
	
	public void identify(){
		
		if("v".equals(temp)){
			System.out.println("vrouw");
			
		if("m".equals(temp2)){
				System.out.println("man");
		}
		}
		System.out.println(name);
		System.out.println(leeftijd);
		System.out.println(klas);
		System.out.println("aanwezig = "+ kek);
	}
		
		
	public void birthday(){
		while(leeftijd < 120){
			leeftijd++;
			System.out.println(leeftijd);
			
		}
		
	}
		
	}

