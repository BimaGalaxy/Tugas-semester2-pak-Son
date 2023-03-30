package modifier;

import modifier.Person;

/**
 *
 * @author Galaxy
 */
public class Author {
    
    Person p = new Person();
    
    public Author(){
        //Akan terjadi error disini karena atribut name
        //Telah diberikan modifier protected
        p.name = "Petani kode";
    }
    
}
