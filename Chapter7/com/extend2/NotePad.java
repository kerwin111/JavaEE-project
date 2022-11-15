package Chapter7.com.extend2;

public class NotePad extends computer{
    String color; //颜色

    public NotePad(String cpu, String hDisk, String memory, String color) {
        super(cpu, hDisk, memory);
        this.color = color;
    }
}
