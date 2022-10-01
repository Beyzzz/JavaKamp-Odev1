
public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenciler [] = new String[3];
         ogrenciler[0]= "Beyza";
         ogrenciler[1]= "Ebiha";
         ogrenciler[2]= "Halime";
         for(int i= 0; i< ogrenciler.length; i++) {
        	 System.out.println(ogrenciler[i]);
         }
         System.out.println("----------------");
         for(String ogrenci : ogrenciler) {
        	 System.out.println(ogrenci);
         }
	}

}
;