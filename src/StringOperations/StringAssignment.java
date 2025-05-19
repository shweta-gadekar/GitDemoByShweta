package StringOperations;

public class StringAssignment {

	public static void main(String[] args) {
		String cityname="Pune";
		String Favcity="pune";
		String lovedcity="Pune";
		
		String popularcity="Mumbai";
		String capitalcity="Mumbai";
		
		String countryname=new String("India");
		String favcountryname=new String("india");
		String lovingcountry=new String("india");
		
		String myaddress=new String("india");

		String city=new String("india");
		
		System.out.println(cityname==countryname);				//	false
		System.out.println(Favcity==capitalcity);				//	false
		System.out.println(popularcity==capitalcity);			//	true
		System.out.println(lovingcountry==myaddress);			//	false
		System.out.println(cityname==Favcity);					//	false
		System.out.println(popularcity==capitalcity);			//	true
		System.out.println(countryname==favcountryname);		//	false
		System.out.println("------------------------------");
		System.out.println(cityname.equals(countryname));		//	false
		System.out.println(Favcity.equals(capitalcity));		//	false
		System.out.println(popularcity.equals(capitalcity));	//	true
		System.out.println(lovingcountry.equals(myaddress));	//	true
		System.out.println(cityname.equals(Favcity));			//	false
		System.out.println(popularcity.equals(capitalcity));	//	true
		System.out.println(countryname.equals(favcountryname));	//	true
		System.out.println("------------------------------");

		System.out.println(cityname.charAt(2));
		System.out.println(cityname.length());
		System.out.println(popularcity.length());
		System.out.println(popularcity.startsWith(city));
		System.out.println(popularcity.endsWith("i"));
		System.out.println(popularcity.contains("mb"));
		System.out.println(countryname.concat(" is country."));
		System.out.println(countryname.toUpperCase());
		System.out.println(countryname.compareTo(favcountryname));
		System.out.println(countryname.compareTo(city));
		System.out.println(city.compareTo(countryname));
		System.out.println(countryname.toLowerCase());
		System.out.println(favcountryname.replace("i", "I"));
		System.out.println(countryname.replace(countryname, lovedcity));
	}

}
