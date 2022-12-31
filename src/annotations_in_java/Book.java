// Note : This sis Demonstartaion of how we can define our class in JavaDoc creation.

/** @author Ajith Kumar
 *  @version 2.0
 *  @since 2015
 **/
package annotations_in_java;

/**
 * @author Ajith Kumar
 * 
 * Class for Library Book
 */

public class Book {
   
    /** Description about Data Members
     * @value 10 default value 
     */
    static int val=10;
    
    
    /** Description about Constructor
     * 
     * @param s Books Name
     */
    public Book(String s){
        
    }
    
    
    /** Description of Method issue();
     * 
     * issue a Book to a student
     * @param roll roll number of student
     * @throws Exception  if Book is not available it throw exception
     */
    public  void issue(int roll) throws Exception{
        }
    
    
    /** Description of available() method.
     * check if Book is available or not
     * @param str Book Name
     * @return if Book is available returns true or else false
     */
    public boolean available(String str){
            return true;
    }
    
    
    /**Description for getName() method.
     * 
     * Get Book Name
     * @param id Book Id
     * @return Book name
     */
    public String getName(int id){
        return"";
    }
    
}
