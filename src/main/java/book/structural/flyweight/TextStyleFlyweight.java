package book.structural.flyweight;

import java.awt.*;

public class TextStyleFlyweight {

    private Font font;

    private Color color;

    public TextStyleFlyweight() {
        super();
    }

    public TextStyleFlyweight(Font font, Color color) {
        this.font = font;
        this.color = color;
    }


    public TextStyleFlyweight(String fontName, int fontStyle, int fontSize, Color color){
        this.font = new Font(fontName, fontStyle, fontSize);
        this.color = color;
    }

    public Font getFont() {
        return font;
    }

    public Color getColor() {
        return color;
    }
}
