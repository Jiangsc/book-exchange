package Project01;

public class User {
	private int Id;
	private String userName;
	private String password;
	private String email;
	private int mobile;




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new Integer(Id).hashCode();  

	}
	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		 if (!(obj instanceof User))
//	           return false;
//	       User user = (User) obj;
//	       return user.userName.equals(this.userName);
//	}
	public boolean equals(Object object){
        if(object instanceof User){
            User user = (User) object;
            if(user.getUserName() == null || userName == null){
                return false;
            }
            else{
                return userName.equalsIgnoreCase(user.getUserName());
            }
        }
        return false;
   }
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getId() {
		return Id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	

}
