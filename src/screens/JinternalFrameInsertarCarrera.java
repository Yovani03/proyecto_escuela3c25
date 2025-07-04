package screens;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JinternalFrameInsertarCarrera extends JInternalFrame {

    private JLabel jLabelId;
    private JLabel jLabelNombre;
    private JLabel jLabelMonto;
    private JTextField jLabelFieldId;
    private JTextField jLabelFieldIdNombre;
    private JTextField jLabelFieldIdMonto;
    private JButton jButtonAceptar;
    private JButton jButtonCancelar;


    public JinternalFrameInsertarCarrera(){
        this.setTitle("Insertar nueva carrera");
        initComponets();
    }
    

    
    
}
