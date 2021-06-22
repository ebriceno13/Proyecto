package com.ucreativa.jugabilidad.ui;

import com.ucreativa.jugabilidad.entities.BitacoraJuegos;
import com.ucreativa.jugabilidad.repositories.FileRepository;
import com.ucreativa.jugabilidad.services.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
        super.setSize(600 , 400);
        super.setLayout(new GridLayout(4 , 2));
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
        JCheckBox txtCompletado = new JCheckBox();


        JButton salvar = new JButton("Salvar");

        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Service service= new Service(new FileRepository());
                service.save(txtNombre.getText(),
                        txtCorreo.getText(),
                        txtEdad.getText(),
                        txtNombreJuego.getText(),
                        txtPrecio.getText(),
                        txtCategoria.getText(),
                        txtCompletado.isSelected());

                txtNombre.setText("");
                txtCorreo.setText("");
                txtEdad.setText("");
                txtNombreJuego.setText("");
                txtPrecio.setText("");
                txtCategoria.setText("");
                txtCompletado.setText("");

                String reporte = String.join("\n", service.get());
                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);
            }
        });

        //se agrega al UI

        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);

        this.agregarComponente(lblCorreo);
        this.agregarComponente(txtCorreo);

        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);

        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);

        this.agregarComponente(lblNombreJuego);
        this.agregarComponente(txtNombreJuego);

        this.agregarComponente(lblPrecio);
        this.agregarComponente(txtPrecio);

        this.agregarComponente(lblCategoria);
        this.agregarComponente(txtCategoria);

        this.agregarComponente(lblCompletado);
        this.agregarComponente(txtCompletado);

        this.agregarComponente(salvar);

        }
    }



