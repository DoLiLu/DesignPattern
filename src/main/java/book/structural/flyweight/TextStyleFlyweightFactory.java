package book.structural.flyweight;

import java.util.HashMap;

public class TextStyleFlyweightFactory {
    private HashMap<String, TextStyleFlyweight> pool = new HashMap<>();
    private static TextStyleFlyweightFactory singleton = new TextStyleFlyweightFactory();

    private TextStyleFlyweightFactory() {
        super();
    }

    public static TextStyleFlyweightFactory getInstance(){
        return singleton;
    }

    public TextStyleFlyweight getTextStyleFlyweight(String name){
        TextStyleFlyweight textStyle = pool.get(name);
        return textStyle;
    }

    public void putTextStyleFlyweight(String name, TextStyleFlyweight textStyle){
        pool.put(name, textStyle);
    }
}
