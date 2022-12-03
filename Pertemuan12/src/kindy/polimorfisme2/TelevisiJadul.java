package kindy.polimorfisme2;

public class TelevisiJadul extends Elektronik{
    private String modeInput;

    public TelevisiJadul(){
        modeInput = "DVI";
        voltase = 220;
    }
    public String getModeInput(){
        return modeInput;
    }
}
