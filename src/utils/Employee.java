package utils;

public class Employee {
    String name, address;
    Long enpId, phoneNumber, scoialSecurityNumber;

    public Employee() {
    }

    public Employee(String name, String address, Long enpId, Long phoneNumber, Long scoialSecurityNumber) {
        this(name, enpId, address);
        this.phoneNumber = phoneNumber;
        this.scoialSecurityNumber = scoialSecurityNumber;
    }

    public Employee(String name, Long enpId){
        this.name = name;
        this.enpId = enpId;
    }

    public Employee(String name, Long enpId, String address){
        this(name, enpId);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getEnpId() {
        return enpId;
    }

    public void setEnpId(Long enpId) {
        this.enpId = enpId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getScoialSecurityNumber() {
        return scoialSecurityNumber;
    }

    public void setScoialSecurityNumber(Long scoialSecurityNumber) {
        this.scoialSecurityNumber = scoialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", enpId=" + enpId +
                ", phoneNumber=" + phoneNumber +
                ", scoialSecurityNumber=" + scoialSecurityNumber +
                '}';
    }
}
