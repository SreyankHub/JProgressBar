import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100-1);

    ProgressBar() throws InterruptedException {

        bar.setBounds(0,0,420,50);
        bar.setForeground(Color.RED);
        bar.setBackground(Color.WHITE);
        bar.setStringPainted(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.add(bar);
        frame.setVisible(true);

        fill();


    }

    public void fill() throws InterruptedException {
        int counter = 0;
        while(counter<100) {
            bar.setValue(counter);
            Thread.sleep(50);

            counter+=1;

        }
        bar.setString("You Are Done");
    }

}

