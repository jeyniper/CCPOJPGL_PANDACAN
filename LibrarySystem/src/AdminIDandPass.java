import java.util.HashMap;

public class AdminIDandPass {
	
	HashMap<String,String> adminlogininfo = new HashMap <String,String>();
	
	AdminIDandPass(){
		
		adminlogininfo.put("Admin_01", "AdminOne");
		adminlogininfo.put("Admin_02", "AdminTwo");
		adminlogininfo.put("Admin_03", "AdminThree");
		
	}
	
	public HashMap getAdminLoginInfo(){
		return adminlogininfo;
		
	}

}
