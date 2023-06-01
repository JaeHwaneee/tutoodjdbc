import static org.junit.jupiter.api.Assertions.*;

import opgame.service.OpGame;
import opgame.service.PlusOperatorLevelOne;
import org.junit.jupiter.api.Test;

/**

 @Test
 public void test() {
 OpGame game = new OpGame(new PlusOperatorLevelOne());

 game.makeQuestion();
 String question = game.getQuestion();


 @Test
 public void testSumMax() {
 int max = 10;
 int a = (int)(Math.random() * max);
 int b = (int)(Math.random() * (max - a));
 System.out.printf("%d + %d = %d", a, b, a+b);
 assertTrue(a + b < max);
 }
 }
