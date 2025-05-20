class Counter {
  public int count;

  // init 0
  public Counter() {
    count = 0;
  }
  
  // init with num
  public Counter(int num) {
    count = num;
  }
  // add 1
  public void move() {
    count++;
  }

  // add num
  public void move(int num) {
    count += count;
  }

  // set num
  public void set(int num) {
    count = num;
  }
  
  // return
  public int get() {
    return count;
  }
}
