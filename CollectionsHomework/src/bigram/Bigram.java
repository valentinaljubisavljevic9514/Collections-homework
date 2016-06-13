package bigram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bigram {

	
	public int frekvencijaPojavljivanjaBigrama(String string, String bigram){
		int brojac = 0;
		
		for (int i = 0; i < string.length()-1; i++) {
			
			if(string.substring(i, i+2).equals(bigram)){
				brojac++;
			}
		}
		return brojac;
		
	}
	
	
	public void upisiUMapu(String string, HashMap<String, Integer> hm){
		for (int i = 0; i < string.length()-1; i++) {
			String bigram = string.substring(i, i+2);
			
			hm.put(bigram, frekvencijaPojavljivanjaBigrama(string, bigram));
		}
	}
	
	
	public void ispisiMapu(HashMap<String, Integer> hm){
		 Set set = hm.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.println(mentry.getKey()+ " "+mentry.getValue());
	      }
	}
	
	public static void main(String[] args) {

		String ulazniString = "abbcceeeeeeabcc";
		HashMap<String, Integer> hm = new HashMap<>(50);

		Bigram bigram = new Bigram();
		
		bigram.upisiUMapu(ulazniString, hm);
		bigram.ispisiMapu(hm);
	}

}
