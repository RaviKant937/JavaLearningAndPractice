package iterateOverDifferentTypeOfCollection;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    String name, address;
    long enpId, phoneNumber, scoialSecurityNumber;

    public Employee() {
    }

    public Employee(String name, String address, long enpId, long phoneNumber, long scoialSecurityNumber) {
        this.name = name;
        this.address = address;
        this.enpId = enpId;
        this.phoneNumber = phoneNumber;
        this.scoialSecurityNumber = scoialSecurityNumber;
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

    public long getEnpId() {
        return enpId;
    }

    public void setEnpId(long enpId) {
        this.enpId = enpId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getScoialSecurityNumber() {
        return scoialSecurityNumber;
    }

    public void setScoialSecurityNumber(long scoialSecurityNumber) {
        this.scoialSecurityNumber = scoialSecurityNumber;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", enpId=" + enpId +
                ", phoneNumber=" + phoneNumber +
                ", scoialSecurityNumber=" + scoialSecurityNumber +
                "}\n";
    }

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
