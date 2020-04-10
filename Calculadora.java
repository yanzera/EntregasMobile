import javax.swing.*;

public class Calculadora{
   public static void main(String[] args){
   int  a;
   int b;
   int resp;
   String respUsuario = null;
   
   respUsuario = JOptionPane.showInputDialog("Digite um operador matematico (+ - / *)");
   
    
      if(respUsuario.equals("+")){
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
         resp = a + b;
         JOptionPane.showMessageDialog(null, a + "+ " + b + " = " + resp);
      }else if(respUsuario.equals("-")){
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
         resp = a - b;
         JOptionPane.showMessageDialog(null, a + "- " + b + " = " + resp);
      } else if(respUsuario.equals("*")){
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo vallr"));
         resp = a * b;
         JOptionPane.showMessageDialog(null, a + "* " + b + " = " + resp);
      }else{
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
         resp = a / b;
         JOptionPane.showMessageDialog(null, a + "/ " + b + " = " + resp);
      }
      
      JOptionPane.showMessageDialog(null, "Fim");
      
   }
}

