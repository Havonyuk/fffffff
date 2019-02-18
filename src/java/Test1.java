import jewelry.web.ForTestProgramm;
import org.junit.Test;
import java.lang.*;
import org.junit.*;

import static org.junit.Assert.*;

public class Test1 {
    private ForTestProgramm forTestProgram;
    //    @Test(timeout 5000= )
//    public void timeStampTest() {
//        while (true);
//    }
    @Before()
    public void initTest() {
        forTestProgram = new ForTestProgramm();
    }
    @Test(timeout = 30000)
    public void testGetDivide(){
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        timeStampTest();
        AassertEquals(50, forTestProgram.getDevide(100,5));
    }

    private void AassertEquals(int i, int devide) {
    }
}
