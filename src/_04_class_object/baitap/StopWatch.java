package _04_class_object.baitap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }
    public long stop(){
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        System.out.println(sw.start());
        for (int i = 0;i<10000;i++){
            System.out.println("Dem bang giay :"+i);
        }
        System.out.println(sw.stop());
        System.out.println(sw.getElapsedTime());
    }

}
