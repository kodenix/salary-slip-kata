import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalarySlipGeneratorTest {

    @Test
    void should_generate_a_salary_slip_for_given_employee() {
        EmployeeId expectedEmployeeId = new EmployeeId(12345);
        EmployeeName expectedEmployeeName = new EmployeeName("John J Doe");
        AnnualGrossSalary employeeAnnualGrossSalary = new AnnualGrossSalary(5000);
        String expectedEmployeeMonthlyGrossSalary = "€416.67";
        Employee employee = new Employee(expectedEmployeeId, expectedEmployeeName, employeeAnnualGrossSalary);


        SalarySlip salarySlip = new SalarySlipGenerator().generateFor(employee);


        Assertions.assertEquals(expectedEmployeeId, salarySlip.getEmployeeId(), "id");
        Assertions.assertEquals(expectedEmployeeName, salarySlip.getEmployeeName(), "name");
        Assertions.assertEquals(expectedEmployeeMonthlyGrossSalary, salarySlip.getEmployeeMonthlyGrossSalary(), "Monthly Gross Salary");
    }

}
