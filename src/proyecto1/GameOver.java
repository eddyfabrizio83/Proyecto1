/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Armin
 */
public class GameOver {
    
    
    
    public static void Derrota(int turno){
        System.out.print("<<<<GAME OVER>>>>");
        if(turno == 0){
           
            System.out.print(Jugadores.ganador1);
            
        }else{
             System.out.print(Jugadores.ganador1);
             
        }
    }
}
