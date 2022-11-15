package Chapter7.com.extend2;

public class PC extends computer{
    String brand; //品牌

    public PC(String cpu, String hDisk, String memory, String brand) {
        super(cpu, hDisk, memory);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
