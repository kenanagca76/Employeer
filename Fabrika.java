package FabrikaMain;
public class Fabrika {
    public static void main(String[] args){
        Employee fabrika=new Employee("Kenan AĞCA",19800,45,2000);
        fabrika.tax();
        fabrika.bonus();
        fabrika.raiseSalary();

        System.out.println(fabrika.toString());
    }
}
