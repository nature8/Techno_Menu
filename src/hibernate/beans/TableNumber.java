package hibernate.beans;
public class TableNumber {
    private int tableNo;
    public TableNumber(){}
    public TableNumber(int tableNo){
        this.tableNo=tableNo;
    }
    public int getTableNumber() {
        return tableNo;
    }

    public void setTableNumber(int tableNo) {
        this.tableNo = tableNo;
    }
    
}
