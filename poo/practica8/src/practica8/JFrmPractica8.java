/*Jesus Adrian Caballero Nagaya ID.1816014*/
package practica8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class JFrmPractica8 extends JFrame implements ActionListener{
    public JFrmPractica8(){
    initComponents();  
    this.setVisible(true);
    }


private void initComponents(){
JLabel LblName = new JLabel();
JTextField TxtName = new JTextField();

this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

GroupLayout layout = new GroupLayout(this.getContentPane());
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

