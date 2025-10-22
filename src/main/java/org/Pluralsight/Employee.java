package org.Pluralsight;

public class Employee {
    private int getEmployeeId;
    private String getName;
    private int getDepartment;
    private double getPayRate;
    private double getTotalPay;
    private int getRegularHours;
    private int OvertimeHours;

    public Employee(int getEmployeeId, String getName, int getDepartment, double getPayRate, double getTotalPay, int getRegularHours, int getOvertimeHours) {
        this.getEmployeeId = getEmployeeId;
        this.getName = getName;
        this.getDepartment = getDepartment;
        this.getPayRate = getPayRate;
        this.getTotalPay = getTotalPay;
        this.getRegularHours = getRegularHours;
        this.OvertimeHours = getOvertimeHours;

    }

    public int getEmployeeId() {
        return getEmployeeId;
    }


    public void setGetEmployeeId(int getEmployeeId) {
        this.getEmployeeId = getEmployeeId;
    }

    public String getName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public int getDepartment() {
        return getDepartment;
    }

    public void setGetDepartment(int getDepartment) {
        this.getDepartment = getDepartment;
    }

    public double getPayRate() {
        return getPayRate;
    }

    public void setGetPayRate(double getPayRate) {
        this.getPayRate = getPayRate;
    }

    public double getTotalPay() {
        return getTotalPay;
    }

    public void setGetTotalPay(int getTotalPay) {
        this.getTotalPay = getTotalPay;
    }

    public int getRegularHours() {
        return getRegularHours;
    }

    public void setGetRegularHours(int getRegularHours) {
        this.getRegularHours = getRegularHours;
    }

    public int getOvertimeHours() {
        return OvertimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        OvertimeHours = overtimeHours;
    }
}
