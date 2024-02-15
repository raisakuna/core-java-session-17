package objectbasic;

public class Laptop {
    private String brand;
    private String cpu;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.setBrand("HP");
        lp.setCpu("Intel 5");
        System.out.println(lp.getBrand());

    }

}
