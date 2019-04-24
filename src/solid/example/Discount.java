/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.example;

/**
 *
 * @author tyler
 */
public interface Discount {
    
    char discountType();
}

class discountS implements Discount{

    
    public char discountType() {
       
    return 'S';
    }
    
}

class discountL implements Discount{

    
    public char discountType() {
        
     return  'L';
     
    }
    
}

class discountD implements Discount{

    
    public char discountType() {
        
     return'D';
     
    }
    
}
