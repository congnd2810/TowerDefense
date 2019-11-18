import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startPanel extends JPanel {
    GameStage gameStage;
    Image imgStart = new ImageIcon(getClass().getResource("/Defaultsize/Sample.png")).getImage();

    JButton jButtonStart = new JButton(new ImageIcon(getClass().getResource("/Defaultsize/start.png")));
    JButton JButtonCancel = new JButton(new ImageIcon(getClass().getResource("/Defaultsize/cancel.png")));

    public startPanel(GameStage gameStage) {

        setLayout(null);

        this.gameStage = gameStage;
        add(jButtonStart);
        add(JButtonCancel);

        jButtonStart.setBounds(320, 200, 200, 51 );

        jButtonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameStage.showPlay();
            }
        });

        JButtonCancel.setBounds(339, 280, 162, 39);
        JButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imgStart, 0 , 0, null);
    }
}
