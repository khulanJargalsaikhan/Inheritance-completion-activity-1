public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(){

    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }
    public String getProgrammer() {
        return programmer;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getPlatform() {
        return platform;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public String getOs() {
        return os;
    }

    public String toStringSoftware(){
        return  "Programmer:         " + programmer + "\n"+
                "Platform:           " + platform + "\n"+
                "OS:                 " + os;
    }



}
