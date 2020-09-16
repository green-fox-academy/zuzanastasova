package postIt;

public class PostIt {

    private String backgroundColor;
    private String text;
    private String textColor;

    public PostIt (String backgroundColor, String text, String textColor){

        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;

    }
    public PostIt (){

    }
    public void setBackgroundColor (String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public void setText (String text) {
        this.text = text;
    }
    public void setTextColor (String textColor) {
        this.textColor = textColor;
    }
    public String getBackgroundColor () {
        return backgroundColor;
    }
    public String getText (){
        return text;
    }
    public String getTextColor () {
        return textColor;
    }
    public String toString () {
        return backgroundColor + " " + text + " " + textColor;
    }
    /*Create a postIt.PostIt class that has
            a backgroundColor represented by a String
            a text on it
            a textColor represented by a String
            Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/
}
