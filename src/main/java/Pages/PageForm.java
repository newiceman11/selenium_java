package Pages;

/**
 *
 * @author juampi
 */
public class PageForm {

    public void Sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {

        }
    }
}
