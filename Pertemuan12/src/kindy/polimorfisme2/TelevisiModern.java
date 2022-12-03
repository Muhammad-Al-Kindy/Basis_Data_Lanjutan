package kindy.polimorfisme2;

public class TelevisiModern extends Elektronik{
    private String modeInput;

    public TelevisiModern(){
        modeInput= "HDMI";
        voltase = 220;
    }
    public String getModeInput(){
        return modeInput;
    }
}
