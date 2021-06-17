package com.ucreativa.jugabilidad.ui;

import com.ucreativa.jugabilidad.entities.BitacoraJuegos;
import com.ucreativa.jugabilidad.repositories.FileRepository;
import com.ucreativa.jugabilidad.services.Service;

import javax.swing.*;
import java.awt.*;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build() {

        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(800 , 400);
        super.setLayout(new GridLayout(5 , 2));
    }

    private void agregarComponente(Component componente) {

        super.getContentPane().add(componente);

    }

    private void crearComponentes() {
        //crear labels
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCorreo = new JLabel("Correo");
        JLabel lblEdad = new JLabel("Edad");
        JLabel lblNombreJuego = new JLabel("Nombre Juego");
        JLabel lblPrecio = new JLabel("Precio");
        JLabel lblCategoria = new JLabel("Categoria");
        JLabel lblCompletado = new JLabel("Completado");
        JLabel lblConsola = new JLabel("Consola");

        //crear texto
        JTextField txtNombre = new JTextField();
        JTextField txtCorreo = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtNombreJuego = new JTextField();
        JTextField txtPrecio = new JTextField();
        JTextField txtCategoria = new JTextField();
        JCheckBox txtRiesgo = new JCheckBox();
        JTextField txtConsola = new JTextField();

        JButton salvar = new JButton("Salvar");

        BitacoraJuegos service;
        salvar.addActionListener((AbstractAction) (e){

                Service service = new BitacoraJuegos((new FileRepository()));
                service.save

        });
    }


}
