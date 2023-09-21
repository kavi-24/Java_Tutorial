// AWT - Abstract Window Toolkit
// Used to create GUI applications

import java.awt.*;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Frame -> Main window of the application

// MouseEvent, MouseMotionListener (interfaces) -> To observe mouse events

public class Painter extends JFrame implements MouseMotionListener, MouseListener, ActionListener {

    Label mousePosLabel;
    Color defaultColor = Color.red;
    Color color = defaultColor;

    JButton redButton;
    JButton blueButton;
    JButton greenButton;
    JButton orangeButton;
    JButton blackButton;
    JButton whiteButton;

    JLabel eraserLabel;

    public Painter() {
        mousePosLabel = new Label();
        mousePosLabel.setBounds(20, 20, 100, 50);
        add(mousePosLabel);

        redButton = new JButton("");
        redButton.setBackground(Color.red);
        redButton.addActionListener(this);

        blueButton = new JButton("");
        blueButton.setBackground(Color.blue);
        blueButton.addActionListener(this);

        greenButton = new JButton("");
        greenButton.setBackground(Color.green);
        greenButton.addActionListener(this);

        orangeButton = new JButton("");
        orangeButton.setBackground(Color.ORANGE);
        orangeButton.addActionListener(this);

        blackButton = new JButton("");
        blackButton.setBackground(Color.black);
        blackButton.addActionListener(this);

        whiteButton = new JButton("");
        whiteButton.setBackground(Color.white);
        whiteButton.addActionListener(this);

        eraserLabel = new JLabel("Eraser", new ImageIcon("images/eraser.png"), JLabel.CENTER);

        JPanel colorPanel = new JPanel(new GridLayout(2, 4));
        colorPanel.add(redButton);
        colorPanel.add(blueButton);
        colorPanel.add(greenButton);
        colorPanel.add(orangeButton);
        colorPanel.add(blackButton);
        colorPanel.add(whiteButton);

        colorPanel.add(eraserLabel);

        colorPanel.setBounds(20, 650, 100, 60);
        add(colorPanel);

        addMouseMotionListener(this);
        addMouseListener(this);

        // frame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseMoved(e);
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mousePosLabel.setText("X=" + e.getX() + " Y=" + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("MouseListener:" + e.getButton());
        if (e.getButton() == 1 || e.getButton() == 2) // Left or Middle Click
        {
            color = defaultColor;
        } else if (e.getButton() == 3) // Right Click
        {
            color = this.getBackground();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            defaultColor = Color.red;
        } else if (e.getSource() == blueButton) {
            defaultColor = Color.blue;
        } else if (e.getSource() == greenButton) {
            defaultColor = Color.green;
        } else if (e.getSource() == orangeButton) {
            defaultColor = Color.orange;
        } else if (e.getSource() == blackButton) {
            defaultColor = Color.black;
        } else if (e.getSource() == whiteButton) {
            defaultColor = Color.white;
        } else if (e.getSource() == eraserLabel) {
            defaultColor = this.getBackground();
        }
        color = defaultColor;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}