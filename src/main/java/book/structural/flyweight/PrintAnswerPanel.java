package book.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;

public class PrintAnswerPanel extends JPanel {
    private TextStyleFlyweightFactory textStyleFlyweightFactory = TextStyleFlyweightFactory.getInstance();

    private int firstNumber;
    private int secondNumber;

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        Graphics2D graphics2D = (Graphics2D) graphics;

        int[] answer = new int[FlyweightConstants.OPERATRORS.length];

        answer[0] = firstNumber + secondNumber;
        answer[1] = firstNumber - secondNumber;
        answer[2] = firstNumber * secondNumber;
        answer[3] = firstNumber / secondNumber;

        FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();

        for (int j = 0; j < answer.length; j++) {
            String[] textArray = new String[5];
            textArray[0] = "" + firstNumber;
            textArray[1] = FlyweightConstants.OPERATRORS[j];
            textArray[2] = "" + secondNumber;
            textArray[3] = FlyweightConstants.EQUAL_CHAR;
            textArray[4] = "" + answer[j];

            for(int k = 0; k < textArray.length; k++){
                drawText(graphics2D, fontRenderContext, k, j, textArray[k]);
            }

        }

    }

    private void drawText(Graphics2D graphics2D, FontRenderContext fontRenderContext, int column, int row, String text) {
        TextStyleFlyweight textStyle = null;
        if(column == 0 || column == 2){
            textStyle = textStyleFlyweightFactory.getTextStyleFlyweight(FlyweightConstants.NUMBER_STYLE_NAME);
        } else if(column == 1) {
            textStyle = textStyleFlyweightFactory.getTextStyleFlyweight(FlyweightConstants.OPERATOR_STYLE_NAME);
        } else if(column == 3) {
            textStyle = textStyleFlyweightFactory.getTextStyleFlyweight(FlyweightConstants.EQUAL_STYLE_NAME);
        } else if(column == 4) {
            textStyle = textStyleFlyweightFactory.getTextStyleFlyweight(FlyweightConstants.ANSWER_STYLE_NAME);
        }

        if(textStyle == null)
            return;

        graphics2D.setColor(textStyle.getColor());

        TextLayout textLayout = new TextLayout(text, textStyle.getFont(), fontRenderContext);

        float textWidth = textLayout.getAdvance();
        float textHeight = textLayout.getAscent() + textLayout.getDescent();

        float x = FlyweightConstants.COLUMN_WIDTH * column + (FlyweightConstants.COLUMN_WIDTH - textWidth) / 2 ;
        float y = FlyweightConstants.ROW_HEIGHT * row + (FlyweightConstants.ROW_HEIGHT - textHeight) / 2 + textHeight - textLayout.getDescent();
        textLayout.draw(graphics2D, x, y);

    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
