package kindy.percobaan1Sampai4;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5,"R-2");
        ow.pay(eBill);
        System.out.println("-------------------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedk",500);
        ow.pay(pEmp);
        System.out.println("-------------------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto",5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------------------------");
        ow.showMyEmployee(iEmp);
        
//      ow.pay(iEmp);
    }
}
