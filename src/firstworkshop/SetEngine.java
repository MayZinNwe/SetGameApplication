/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstworkshop;

import java.util.ArrayList;

/**
 *
 * @author MZN
 */
public class SetEngine {
    public boolean isSet(Card a, Card b, Card c) {
        if (!((a.number == b.number) && (b.number == c.number) ||
                (a.number != b.number) && (a.number != c.number) && (b.number != c.number))) {
            return false;
        }
        if (!((a.symbol == b.symbol) && (b.symbol == c.symbol) ||
                (a.symbol != b.symbol) && (a.symbol != c.symbol) && (b.symbol != c.symbol))) {
            return false;
        }
        if (!((a.shading == b.shading) && (b.shading == c.shading) ||
                (a.shading != b.shading) && (a.shading != c.shading) && (b.shading != c.shading))) {
            return false;
        }
        if (!((a.color == b.color) && (b.color == c.color) ||
                (a.color != b.color) && (a.color != c.color) && (b.color != c.color))) {
            return false;
        }
        return true;
      
    }
    
}
