/**
 * Created by Marc on 18/11/2016.
 */
import static org.junit.Assert.assertEquals;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Test;

public class MyTests {

    @Test
    public void tryingoutadduser(){
        Singleton.getInstance().insertUser("pepe","syt");
        Etakemon rojas = new Etakemon("rojas","dolor");
        Singleton.getInstance().addEtakemon("pepe", rojas);

        assertEquals("pepe", Singleton.getInstance().showUser("pepe").name );
        assertEquals(rojas, Singleton.getInstance().showuserEtakemon("pepe").get(0));

    }
}
