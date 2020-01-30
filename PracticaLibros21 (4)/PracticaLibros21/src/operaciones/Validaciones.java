/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Karla Abad
 */
public class Validaciones {
    public boolean soloLetras(Character ch) {
        boolean res = true;
        if (!Character.isLetter(ch) && 
                ch!=KeyEvent.VK_BACKSPACE && 
                ch!=KeyEvent.VK_SPACE &&
                ch!=KeyEvent.VK_DELETE) {
            res = false;
        }
        return res;
    }
}
