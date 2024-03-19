
package hibernate.beans;
public class CustomerSign {
    
   
       private String custName;
       private String id;
       private int tableNo;
       private String contact;
       private int amount;
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public CustomerSign(String custName, String id, String contact) {
        this.custName = custName;
        this.id = id;
        this.contact = contact;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
       
   
   
}
