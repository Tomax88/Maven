
package com.academy.lesson17;
import java.util.Objects;

public class Operator {
    private long operator_id;
    private String name;
    private String address;

    public Operator(long operator_id, String name, String address) {
        this.operator_id = operator_id;
        this.name = name;
        this.address = address;
    }

    public long getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(long operator_id) {
        this.operator_id = operator_id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return operator_id == operator.operator_id &&
                Objects.equals(name, operator.name) &&
                Objects.equals(address, operator.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(operator_id, name, address);
    }

    @Override
    public String toString() {
        return "Operator " +
                "operator_id " + operator_id +
                "  name " + name +
                "  address " + address;
    }
}
