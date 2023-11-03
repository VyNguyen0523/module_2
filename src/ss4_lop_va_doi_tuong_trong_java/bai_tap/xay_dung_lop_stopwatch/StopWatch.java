package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch(){
        this.startTime=System.currentTimeMillis();
        this.endTime=System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime=System.currentTimeMillis();
   }
    public void end(){
        this.endTime=System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
