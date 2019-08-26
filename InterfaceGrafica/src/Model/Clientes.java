/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Clientes {
   
    private int idClientes,RG,CEP,CPF, id_marca,id, id_modelo;
    private String nome,cidade, cor,estado, motor;
  
    
    public void setID(int i) throws Exception {
        if(i>0) {
            this.id=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
       public int getID(){
           return this.idClientes;
       }
    }


