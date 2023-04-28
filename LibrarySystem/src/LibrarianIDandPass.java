import java.util.HashMap;

public class LibrarianIDandPass {
	
	HashMap<String,String> librarianlogininfo = new HashMap <String,String>();
	
	LibrarianIDandPass(){
		
		librarianlogininfo.put("Librarian_01", "LibOne");
		librarianlogininfo.put("Librarian_02", "LibTwo");
		librarianlogininfo.put("Librarian_03", "LibThree");
		
	}
	
	public HashMap getLibrarianLoginInfo(){
		return librarianlogininfo;
		
	}

}