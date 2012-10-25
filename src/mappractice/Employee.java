package mappractice;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Sean Ennis
 */
public class Employee implements Comparable {

    private int empID;
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee() {
    }

    public Employee(int empID, String lastName, String firstName, String ssn) {
        this.empID = empID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.empID = empID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empID != other.empID) {
            return false;
        }
        return true;
    }

    //containers called "buckets" for HashMap
    //hashcodes are not a memory address, rather it points to a bucket
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.empID;
        return hash;
    }

    public int compareTo(Object other) {

        Employee o = (Employee) other;

        return new CompareToBuilder()
                .append(this.empID, o.empID)
                .toComparison();
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) throws IllegalArgumentException {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("value cannot be null or zero length");
        }
        firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpID(int id) {
        this.empID = id;
    }

    public int getEmpID() {
        return empID;
    }

    @Override
    public String toString() {
        return "ID : " + empID + "   First Name : " + firstName + "   Last Name : " + lastName + ", ssn : " + ssn;
    }
}
