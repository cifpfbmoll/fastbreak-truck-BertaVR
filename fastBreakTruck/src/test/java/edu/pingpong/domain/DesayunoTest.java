package edu.pingpong.domain;
import edu.pingpong.behaviour.FastBreakTruck;
import edu.pingpong.domain.Desayuno;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesayunoTest {

    @Test
    public void desayunoTest(){
        Desayuno smigDes = FastBreakTruck.prepararSmiggles();
        assertEquals(85f, smigDes.getCoste(),  0.000);
        Desayuno eyeDes1 = FastBreakTruck.prepararEyeHoles();
        assertEquals(55f, eyeDes1.getCoste(),  0.000);
        FastBreakTruck.incluirJuguete(eyeDes1);
        assertEquals(155f, eyeDes1.getCoste(),  0.000);
        FastBreakTruck.incluirJuguete(smigDes);//precio no cambia porque es smiggles y no se tiene que poder añadir
        assertEquals(85f, eyeDes1.getCoste(),  0.000);



    }
}
