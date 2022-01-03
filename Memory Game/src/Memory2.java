import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Memory2 extends JFrame {

    public Memory2() {

        this.addButton();
    }
    public void addButton() {
        JButton btn = new JButton();
        for (int i = 1; i < 13; i++) {
            btn = new JButton("b" + i);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switchButtons((JButton) e.getSource());

                }
            });
        }
        add(btn);
        btn.setBounds(10, 30, 50, 40);
        btn.setBounds(70, 30, 50, 40);
        btn.setBounds(130, 30, 50, 40);
        btn.setBounds(10, 80, 50, 40);
        btn.setBounds(70, 80, 50, 40);
        btn.setBounds(130, 80, 50, 40);
        btn.setBounds(10, 130, 50, 40);
        btn.setBounds(70, 130, 50, 40);
        btn.setBounds(130, 130, 50, 40);
        btn.setBounds(10, 130, 50, 40);
        btn.setBounds(70, 130, 50, 40);
        btn.setBounds(130, 130, 50, 40);
    }

    private void switchButtons(JButton source) {

    }

    public static void main(String[] args) {
        Memory2 mem = new Memory2();
        mem.setSize(250, 300);
        mem.setLayout(new GridLayout(4, 3));
        mem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mem.setVisible(true);
    }
}
