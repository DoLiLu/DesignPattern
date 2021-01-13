package book.structural.flyweight;

import javax.swing.*;
import java.awt.*;

public class ClientFrame extends JFrame {

    private PrintAnswerPanel printAnswerPanel;

    public ClientFrame(){
        setTitle("Calculator");

        setupTextStyleFlyweightFactory();

        printAnswerPanel = new PrintAnswerPanel();
        printAnswerPanel.setFirstNumber(10);
        printAnswerPanel.setSecondNumber(20);

        add(printAnswerPanel, BorderLayout.CENTER);

    }

    private void setupTextStyleFlyweightFactory() {
        TextStyleFlyweightFactory textStyleFlyweightFactory = TextStyleFlyweightFactory.getInstance();
        String name = FlyweightConstants.NUMBER_STYLE_NAME;
        TextStyleFlyweight textStyle = new TextStyleFlyweight(FlyweightConstants.DEFAULT_ANSWER_FONT, Color.RED);
        textStyleFlyweightFactory.putTextStyleFlyweight(name, textStyle);

        name = FlyweightConstants.OPERATOR_STYLE_NAME;
        textStyle = new TextStyleFlyweight(FlyweightConstants.DEFAULT_ANSWER_FONT, Color.BLUE);
        textStyleFlyweightFactory.putTextStyleFlyweight(name, textStyle);

        name = FlyweightConstants.EQUAL_STYLE_NAME;
        textStyle = new TextStyleFlyweight(FlyweightConstants.DEFAULT_ANSWER_FONT, Color.GREEN);
        textStyleFlyweightFactory.putTextStyleFlyweight(name, textStyle);

        name = FlyweightConstants.ANSWER_STYLE_NAME;
        textStyle = new TextStyleFlyweight(FlyweightConstants.DEFAULT_ANSWER_FONT, Color.BLACK);
        textStyleFlyweightFactory.putTextStyleFlyweight(name, textStyle);
    }

    public static void main(String[] args) {
        ClientFrame frame = new ClientFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setVisible(true);

    }
}
