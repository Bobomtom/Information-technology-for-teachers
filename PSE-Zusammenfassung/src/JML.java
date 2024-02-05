
public class JML {
    final int Id;
    /*@
      @ ensures a JML-object is initialized; //describes what has to have happened after the method ran
     */
    public JML(final int Id) {
        this.Id=Id;
    }
    /*@
      @ requires nothing ;// describes what the method needs to work properly
      @ ensures System prints i i-times; //describes what has to have happened after the method ran
     */
    public void loop(){
        /*@
		  @ loop_invariant System.print.out printed i, i times; //describes how many iterations the loop already did
		  @ decreasing 5-i; //describes how many iterations the loop still has to do
		 */
        for (int i = 0;i<5;i++){
            System.out.println(i);
        }
    }
}
