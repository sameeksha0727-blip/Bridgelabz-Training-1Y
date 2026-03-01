import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainApp {
    public static void main(String[] args) {

        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        System.out.println("---- Company Combined Report ----");
        s.printSales();
        e.printEmployeeData();
    }
}
