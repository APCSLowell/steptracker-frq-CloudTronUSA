import java.util.ArrayList;
public class StepTracker {
  private int m,d,a,t;
  public StepTracker(int m) {
    this.m=m;
  }
  public void addDailySteps(int s) {
    d++;
    t+=s;
    if(s>=m) a++;
  }
  public int activeDays() { return a; }
  public double averageSteps() {
    return d==0 ? 0.0 : (double)t/d;
  }
} 
