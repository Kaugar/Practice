package Exam1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;


public class OddAvgTest {
  OddAvg test;

  @Before
  public void setUp() {
    test = new OddAvg();
  }

  @org.junit.Test
  public void oddAverage1() {

    ArrayList<Integer> testlist = new ArrayList<>(Arrays.asList(1));
    assertEquals(1.0,1, test.oddAverage(testlist));
  }
  @org.junit.Test
  public void oddAverageEven() {

    ArrayList<Integer> testlist = new ArrayList<>(Arrays.asList(2,4,6,8,10,100));
    assertEquals(0,0, test.oddAverage(testlist));
  }
  @org.junit.Test
  public void oddAverage10() {

    ArrayList<Integer> testlist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    assertEquals(5.0,5, test.oddAverage(testlist));
  }
  @org.junit.Test
  public void oddAveragePair() {

    ArrayList<Integer> testlist = new ArrayList<>(Arrays.asList(34,33,32,31,63,55,50));
    assertEquals(1.0,1, test.oddAverage(testlist));
  }
}