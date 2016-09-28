import java.util.*;
import javax.swing.*;
public class BeerSong{
public static void main(String[] args) {
		
		Ninety_Nine_Bottles_Of_Beers();

	}
public static void Ninety_Nine_Bottles_Of_Beers(){
for(int i=99; i>0; i--){
			if(i>1){
				System.out.println(i + " bottles of beer on the wall," + i + " bottles of beer take one down, pass it around," + (i-1)+" bottles of beer on the wall.");
			}
			if(i==1){
				System.out.println(i + " bottle of beer on the wall," + i + " bottle of beer take one down, pass it around, no more bottles of beer on the wall");
			}
			}
			}
}