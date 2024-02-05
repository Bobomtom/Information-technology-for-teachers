/**
 * @author      Firstname Lastname <address @ example.com>
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class Javadoc {
    /**
     * The name of a Person //describes the variable
     */
    String name;

    /**
     * This method returns the name of a person if it isn`t null //This comment describes what the Method below does.
     *
     * @param person A name of a Person //describes the parameter given to the method
     * @return name returns the name of the Person //describes the return value
     * @throws IllegalStateException when Person is null //describes the exception that is thrown
     */
    public String getPersonName(Person person){
        if (person==null){
            throw new IllegalStateException("Person can`t be null");
        }
        name = person.getName();
        return name;
    }
}
