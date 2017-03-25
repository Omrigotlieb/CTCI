import java.util.Hashtable;

/**
 * 
 */

/**
 * @author omrigotlieb
 *
 */
public class IsUnique {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(isUnique("abcdefg"));

    }
    
    public static boolean isUnique(String str){
	Hashtable hs = new Hashtable();
	for (int i = 0; i < str.length(); i++) {
	    if(null != hs.put(str.charAt(i),i)){
		return false;
	    }
	}
	return true;
    }
 }


