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
public class Ayuda {
    
    /*  String query[] ={"SELECT * FROM emp where id=1", 
      "select name from emp where name like 'ravi_'",//todos empezan asi primera liena
      "select name from emp where name like 'ravi%'"};//todos empezan asi
      for(String q : query){
         ResultSet rs = stmt.executeQuery(q);
         System.out.println("Names for query "+q+" are");
         while (rs.next()) {
            String name = rs.getString("name");
            System.out.print(name+"  ");
         }*/
    /*private DefaultTableModel modelo;
    int cont=0;
    
     public void MostrarTabla ()
    {
        String data [][]= {};
        //titulo
        String col[]={"CODIGO","NOMBRE","EDAD"};
        //Instaciamos Model para Tabla tipo de array String, y titulo columnas
        modelo = new DefaultTableModel(data,col);
        //insertamos los datos en al tabla fisica
        this.TBLista.setModel(modelo);
        TBLista.setVisible(true);
    }
    
    public void Mostrardatos(){
        Persona pp;
        for(int y=0;y<contenedor.size();y++)
        {
            pp=(Persona) contenedor.get(y);
            modelo.insertRow(cont, new Object[]{});
            modelo.setValueAt(pp.getCodigo(),cont,0);
            modelo.setValueAt(pp.getNombre(),cont,1);
            modelo.setValueAt(pp.getEdad(),cont,2);
        }
    }*/
}
