import ObjectsGame.Enemy;
import ObjectsGame.Map1;
import ObjectsGame.NormalEnemy;
import ObjectsGame.TankerEnemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GameStage extends JFrame implements ActionListener {

    int DeLay = 10;
    Timer timer;

    public GameStage() {
        initUI();;
        initTimer();
    }

    public void initTimer() {
        timer = new Timer(DeLay, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private void initUI() {
        add(new startPanel(this));
        setSize(840,448);
        setTitle("TowerDefense");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
            }
        });
    }
}

class controlPanel extends JPanel {

    Map1 map1;
    ArrayList<Enemy> listTank;
    boolean flag = true;
    int count = 5;


    public controlPanel() {
        map1 = new Map1();
        listTank = new ArrayList<>();
    }

    public void setupObj(){
        for(int a = 0 ; a < count ; a++){
            listTank.add(new TankerEnemy(32,416 + a*128));
        }
        flag = false;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        map1.render(g2d);

       if (count <= 11) {
           setupObj();

           for(int a = 0 ; a < count ; a++){
               listTank.get(a).render(g2d);
           }

           if(listTank.get(count - 1).getX() >  580){
               listTank.clear();
               flag = true;
               count = count +2;
           }
       }
    }
}

class startPanel extends JPanel  {
    GameStage gameStage;
    Image imgStart = new ImageIcon(getClass().getResource("/Defaultsize/Sample.png")).getImage();

    JButton jButtonStart = new JButton(new ImageIcon(getClass().getResource("/Defaultsize/start.png")));
    JButton JButtonCancel = new JButton(new ImageIcon(getClass().getResource("/Defaultsize/cancel.png")));

    public startPanel(GameStage gameStage) {
        this.gameStage = gameStage;
        add(jButtonStart);
        add(JButtonCancel);
        setLayout(null);

        jButtonStart.setBounds(320, 200, 200, 51 );
        jButtonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameStage.getContentPane().removeAll();
                gameStage.getContentPane().add(new controlPanel());
                gameStage.validate();
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

