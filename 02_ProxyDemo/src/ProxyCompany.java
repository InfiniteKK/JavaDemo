/*
    代理类：代理商
 */
public class ProxyCompany implements ComputerInterface{

    private ComputerInterface computerInterface;
    public ProxyCompany() {
    }

    public ProxyCompany(ComputerInterface computerInterface) {
        this.computerInterface = computerInterface;
    }


    @Override
    public String buyComputer() {
        return computerInterface.buyComputer() + ", mouse, operating system.";
    }

    @Override
    public void repair() {
        System.out.println("Charge 100.");
        computerInterface.repair();
    }
}
