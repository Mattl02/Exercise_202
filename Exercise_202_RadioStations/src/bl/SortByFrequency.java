/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.Comparator;

/**
 *
 * @author Matthias
 */
public class SortByFrequency implements Comparator<Sender>{

    @Override
    public int compare(Sender s, Sender s1) {
        if(s.getFrequenz() > s1.getFrequenz()) return 1;
        if(s.getFrequenz() < s1.getFrequenz()) return -1;
        return 0;
    }
    
}
