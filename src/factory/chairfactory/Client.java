package factory.chairfactory;

class Client {
    public IChair chair;

    public void sitChair() {
         System.out.println("Client on the Chair" + chair.getClass());
     }

    public void setChair(IChair chair) {
        this.chair = chair;
    }
}
