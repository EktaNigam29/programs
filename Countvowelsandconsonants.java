package practise;

public class Countvowelsandconsonants {

	public static void main(String[] args) {
   
  int vowel_Count = 0, consonant_Count = 0;    
  String str = "India is my country";    
  str = str.toLowerCase();    
            for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
            	vowel_Count++;      
                
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                  
            	consonant_Count++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowel_Count);    
        System.out.println("Number of consonants: " + consonant_Count);    
    }    
   



	}


