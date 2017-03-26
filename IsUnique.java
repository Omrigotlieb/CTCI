import java.util.Hashtable;

public class IsUnique {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(isUnique("aa"));

    }
    
    public static boolean isUnique(String str){
	Hashtable hs = new Hashtable();
	for (int i = 0; i < str.length(); i++) {
	    if(null != hs.put(charAt(i),str.charAt(i))){
		return false;
	    }
	}
	return true;
    }
 }


