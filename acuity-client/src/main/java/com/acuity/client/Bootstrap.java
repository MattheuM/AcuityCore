package com.acuity.client;

import com.acuity.api.AcuityInstance;
import com.acuity.client.devgui.ScriptRunnerView;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zach on 5/31/2017.
 */
public class Bootstrap {

    public static void main(String[] args) {
        try {

            JFrame frame = new JFrame();
            frame.setSize(new Dimension(800, 600));
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            AcuityInstance.init();
            frame.getContentPane().add(AcuityInstance.getApplet());

            AcuityInstance.loadClient();

            new ScriptRunnerView().setVisible(true);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}