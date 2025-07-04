package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
    public JDesktopPane desktop; //Escritorio dentro del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;

    



    public VentanaPrincipal (String title){
        this.setTitle(title);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponets();
    }

    private void initComponets(){

        //DesctopPane escritorio
        desktop = new JDesktopPane();
        this.add(desktop);
        //barra de menu
        jMenuBar = new JMenuBar();
        this.add(jMenuBar);
        //menu alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        //Elemento de menu (insertar)
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar");
        // Elemento de menu:  Ver alumnos 


        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos...");
        //menu carreras

        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        //Elemntos de carreras

        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las carreras...");

        // Insertar carreras
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar...");






        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);



        jMenuCarreras.add(jMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(jMenuCarreras);




        this.setJMenuBar(jMenuBar);
        pack();
    }
}