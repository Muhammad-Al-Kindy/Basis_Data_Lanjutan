package kindy.percobaan1Sampai4;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik",500);
        Employee e;
        e= pEmp;
        System.out.println(""+e.getEmployeeeInfo());
        System.out.println("---------------------");
        System.out.println(""+pEmp.getEmployeeeInfo());
    }
}
