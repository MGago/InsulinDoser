package model;

public class Value {
    
    private String state;
    private String url = "";
    private int value;

    public Value(int value) {
        this.value = value;
        setState();
    }

    public Value(String url, int value) {
        this.url = url;
        this.value = value;
        setState();
    }

    //local method
    private void setState() {

        if (url.isEmpty()) {
            return;
        }

        if (value >= 0) {
            state = "Value received";
        } else if (value == -1) {
            state = "ERROR";
        }else if(value == -8){
            state = "voter didn't wait";
        }else {
            state = "Timeout";
        }

    }

    public String getUrl() {
        return url;
    }

    public int getValue() {
        return value;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setValue(int value) {
        this.value = value;
        setState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
