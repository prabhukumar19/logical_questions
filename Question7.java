public class Question7 {
    public static void main(String[] args) {
        System.out.println("7.	Write a program to check given String is Anagram?");
        String Str1 = "java2";
		String str2 = "vaja2";
		int found = 0;
		int not_found = 0;

        // char char1[]=Str1.toLowerCase().toCharArray();
		// char char2[]=str2.toLowerCase().toCharArray();

		if (Str1.length() == str2.length()) {
			for (int i = 0; i < Str1.length(); i++) {
				found = 0;
				for (int j = 0; j < str2.length(); j++) {
					if (Str1.charAt(i)==str2.charAt(j)) {
						found = 1;
						break;
					}
				}
				if (found == 0) {
					not_found = 1;
					break;
				}
			}
			if (not_found == 1) {
				System.out.println(" Not AnaGram");
			} else {
				System.out.println("Anagram");
			}

		}

    }
}
