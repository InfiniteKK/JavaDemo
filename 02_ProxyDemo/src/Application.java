/*
 静态代理案例：
        通过代理商买电脑，代理商通过厂家买电脑
        代理设计模式是基于接口的，把需要定义的方法都定义在接口中
 */
public class Application {
    public static void main(String[] args) {
        ComputerCompany computerCompany = new ComputerCompany();
        //SmallComputerCompany smallComputerCompany = new SmallComputerCompany();
        ProxyCompany proxyCompany = new ProxyCompany(computerCompany);
        System.out.println(proxyCompany.buyComputer());
        proxyCompany.repair();
    }
}
