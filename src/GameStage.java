import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameStage extends JFrame {

    startPanel st = new startPanel(this);
    controlPanel cp = new controlPanel(this);

    public GameStage() {
        initUI();;
    }

    public void showMenu() {
        st.setVisible(true);
        cp.setVisible(false);
    }

    public void showPlay() {
        cp.setVisible(true);
        st.setVisible(false);
    }

    private void initUI() {
        //add(st);
        add(cp);
        //showMenu();

        setLayout(new  CardLayout());
        setSize(1280,704);
        setTitle("TowerDefense");
        //setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });

        timer.start();
        if (cp.countTank > 11) timer.stop();
    }
}

