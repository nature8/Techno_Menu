//package hib.dto;
package hibernate.beans;
public class AdminTable 
{
    private String loginId;
    private String password;
    
    public AdminTable(){   
    }
    public AdminTable(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
