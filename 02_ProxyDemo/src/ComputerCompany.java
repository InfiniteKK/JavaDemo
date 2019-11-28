/*
    被代理类：厂家
 */
public class ComputerCompany implements ComputerInterface{

    public ComputerCompany() {
    }

    @Override
    public String buyComputer() {
        return "Lenovo Y666";
    }

    @Override
    public void repair() {
        System.out.println("Repaired.");
    }
}
