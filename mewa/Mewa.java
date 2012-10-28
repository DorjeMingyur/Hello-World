import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mewa {

	static int mewaMatrix[][] = new int [3][3];
	//  [i,j] coordrionates, center is 
	//  [0,0] [0,1] [0,2]
	//  [1,0] [1,1] [1,2]
	//  [2,0] [2,1] [2,2]

	// center is 
	public static void main (String[] args){
		int i=0, j=0;
		System.out.println("Mewa calculation for Mewa: "+ args[0]);


		// first fill the mewa
		for (i=0; i<3; i++){
			for(j=0;j<3;j++){
				if(j==1 && i==1){
					mewaMatrix[i][j]=new Integer(args[0]);
				} else {
					mewaMatrix[i][j]=5;
				}
			}
		}	

		// print it
		for (i=0; i<3; i++){
			for(j=0;j<3;j++){
				System.out.print("["+ mewaMatrix[i][j]+"]");
			}
			System.out.println();

		}
			
    		LinkedHashMap colorToNumbers = new LinkedHashMap();
		colorToNumbers .put("red", new int[]{1,2,8} );
		colorToNumbers .put("white", "THREE");
		colorToNumbers .put("yellow", "FOUR");
		colorToNumbers .put("green", new String[] {"FIVE","SIX"});
		colorToNumbers .put("blue", 9);
		print(colorToNumbers .keySet()); 
		print(colorToNumbers .values()); 


		LinkedHashMap mewaColors = new LinkedHashMap();
                mewaColors.put(1, "RED");
                mewaColors.put(6, "BLUE");
                mewaColors.put(5, "WHITE");
                mewaColors.put(4, "GREEN");
                mewaColors.put(3, "YELLOW");
                System.out.println("Colors are : " + mewaColors);

	}

	static void print(Collection coll) {
		Iterator iter = coll.iterator();
		while (iter.hasNext()) {
			String elem = (String) iter.next().toString();
			System.out.print(elem + " --  ");
		}
		System.out.println();
	}
}
