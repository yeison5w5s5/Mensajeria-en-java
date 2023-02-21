
package metodos;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dwanj
 */

public class Teclado {
    
    public void SoloLetras(KeyEvent evt){
        
        Character letra; // var tipo character
        
        letra = evt.getKeyChar();
        
        if(!Character.isLetter(letra) && letra !=KeyEvent.VK_SPACE){// si el caracter es diferente a una letra
            evt.consume();
        }
        
    }
    
    public void SoloNumeros(KeyEvent evt){
        Character letra;
        
        letra = evt.getKeyChar();
        
        if(Character.isLetter(letra) && letra != KeyEvent.VK_DELETE){// si el caracter es una letra y es diferente a borrar
            evt.consume();
            JOptionPane.showMessageDialog(null,"No se admiten letras");
        }
    }
    
    public void Minimizar(JFrame frame){
        frame.setState(JFrame.ICONIFIED); //minimisar
    }

    public void CerrarTodo(JFrame frame){
        System.exit(0);
    }
    
    public void cerrarJFrame(JFrame jframe){
        jframe.setVisible(false);
    }
    



    
}
