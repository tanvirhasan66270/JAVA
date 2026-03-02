
package Model;

public class Supplier {
    private int id;
    private String name;
    private String cell;
    private String contactParsonName;
    private String contactParsonCell;
    private String address;

    public Supplier() {
    }

    public Supplier(int id, String name, String cell, String contactParsonName, String contactParsonCell, String address) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.contactParsonName = contactParsonName;
        this.contactParsonCell = contactParsonCell;
        this.address = address;
    }

    public Supplier(String name, String cell, String contactParsonName, String contactParsonCell, String address) {
        this.name = name;
        this.cell = cell;
        this.contactParsonName = contactParsonName;
        this.contactParsonCell = contactParsonCell;
        this.address = address;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getContactParsonName() {
        return contactParsonName;
    }

    public void setContactParsonName(String contactParsonName) {
        this.contactParsonName = contactParsonName;
    }

    public String getContactParsonCell() {
        return contactParsonCell;
    }

    public void setContactParsonCell(String contactParsonCell) {
        this.contactParsonCell = contactParsonCell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    
    
}
