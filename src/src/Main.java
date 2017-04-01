import com.sun.scenario.effect.impl.sw.java.JSWBoxBlurPeer;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.demo.charts.area.AreaChart01;

import javax.swing.*;
import java.awt.*;

/**
 * Creates a simple Chart using QuickChart
 */
public class Main {

    public static void Main(String[] args) throws Exception {

        JFrame frame;
        frame = new JFrame("XChart Swing Demo");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XChartPanel chartPanel = new XChartPanel((new AreaChart01()).getChart());
        frame.add(chartPanel);
        frame.setVisible(true);

        private JComboBox {
            String[] items = {
                    "T1",
                    "T2",
                    "T3"
            }
            JComboBox comboBox = new JComboBox(items);
        }


        //       System.out.printf("" + sum(4, 5));
    }

    //   public static int sum(int a, int b) {
    //      int c = a + b;

    //      return c;
}
