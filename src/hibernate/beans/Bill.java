
package hibernate.beans;

public class Bill {
    private String custId;
    private String custName;
    private String contactNo;
    private String custAddress;
    private int amount;
    private String review;

    public Bill() {
    }

    public Bill(String custId, String custName, String contactNo, String custAddress, int amount, String review) {
        this.custId = custId;
        this.custName = custName;
        this.contactNo = contactNo;
        this.custAddress = custAddress;
        this.amount = amount;
        this.review = review;
    }
    
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
}
