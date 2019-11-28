public class SmallComputerCompany implements ComputerInterface{
    @Override
    public String buyComputer() {
        return "Lenovo Y999";
    }

    @Override
    public void repair() {
        System.out.println("Repaired.");
    }
}
