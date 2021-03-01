package org.springframework.demo.salaryChange;import org.springframework.context.ApplicationEvent;import org.springframework.demo.Employees.Employee;public class SalaryChangeEvent extends ApplicationEvent {    private Employee employee;    private Double oldSalary;    public SalaryChangeEvent(Object source, Employee employee, Double oldSalary) {        super(source);        this.employee = employee;        this.oldSalary = oldSalary;    }    public Employee getEmployee() {        return employee;    }    public Double getOldSalary() {        return oldSalary;    }}