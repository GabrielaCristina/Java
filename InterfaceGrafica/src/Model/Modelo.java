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
public class Modelo {
      private int  id_modelo;
    private String nome;
  
    
    public void setID(int i) throws Exception {
        if(i>0) {
            this.id_modelo=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
       public int getID(){
           return this.id_modelo;
       }
    }

