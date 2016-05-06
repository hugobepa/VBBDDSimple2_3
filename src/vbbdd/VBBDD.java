/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vbbdd;

/**
 *
 * @author hugo
 */
public class VBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        V v = new V();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
    
    /*
    int tecla= evt.getKeyChar();
        Persona pp;
        if(tecla==10)// si apretar ENTER
        {
            //eliminar espacios en blanco trim()
            codigo =this.TFCodigo.getText().trim();
            for(int y=0;y<contenedor.size();y++)
            {
                pp=(Persona) contenedor.get(y); 
                // si codigo coincide se muestran los otros
                if(codigo.equalsIgnoreCase(pp.getCodigo()))
                {
                    this.TFNombre.setText(pp.getNombre());
                    this.TFEdad.setText(pp.getEdad());
                    Encontrado =y;
                    break;
                }
            }
        }
    
    */
}
