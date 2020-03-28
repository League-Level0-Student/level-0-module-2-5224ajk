package _06_lottery_numbers;

import java.util.Random;

public class ticket {
int ticket = 0;
Random ran = new Random();
int r1 = ran.nextInt(10);
int r2 =ran.nextInt(10);
int r3 =ran.nextInt(10);
int r4 =ran.nextInt(10);
System.out.println(r1);
}
