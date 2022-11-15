package Chapter7.com.extend2;

public class computer {
    String cpu;
    String hDisk; //硬盘
    String memory; //内存


    public computer(String cpu, String hDisk, String memory) {
        this.cpu = cpu;
        this.hDisk = hDisk;
        this.memory = memory;
    }

    public String getDetail(){
        return "cpu为:"+cpu + ",硬盘为:"+hDisk +",内存为:"+memory;

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String gethDisk() {
        return hDisk;
    }

    public void sethDisk(String hDisk) {
        this.hDisk = hDisk;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }


}
