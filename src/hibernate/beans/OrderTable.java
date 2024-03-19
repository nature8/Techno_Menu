package hibernate.beans;
public class OrderTable {
    private int tableNo;
    private String customerName;
    private String contactNumber;
    private String remark;
    public OrderTable(){
    }

    public OrderTable(int tableNo, String customerName, String contactNumber, String remark) {
        this.tableNo = tableNo;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.remark = remark;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}