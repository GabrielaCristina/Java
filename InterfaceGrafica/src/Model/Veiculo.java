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
public class Veiculo {
      private int Veiculoid, idmarca,id_modelo;
    private String Cadastro,placa,motor,cor;
  
    
    public void setID(int i) throws Exception {
        if(i>0) {
            this.Veiculoid=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
       public int getID(){
           return this.Veiculoid;
       }
    }

