/**
 * Class for Student.
 */
class Student implements Comparable<Student> {
    /**The Student class also implements the interface
    of the Comparable class.**/
    /**
     * String name.
     */
    private String name;
    /**
     * String date.
     */
    private String date;
    /**
     * String month.
     */
    private String month;
    /**
     * String year.
     */
    private String year;
    /**
     * String subject1.
     */
    private int subject1;
    /**
     * String subject2.
     */
    private int subject2;
    /**
     * String subject3.
     */
    private int subject3;
    /**
     * String totalmarks.
     */
    private int totalmarks;
    /**
     * String reservation.
     */
    private String reservation;
    /**
     * boolean alloted.
     */
    private boolean alloted;
    /**
     * Constructs the object.
     *
     * @param      name         The name
     * @param      date         The date
     * @param      month        The month
     * @param      year         The year
     * @param      subject1     The subject 1
     * @param      subject2     The subject 2
     * @param      subject3     The subject 3
     * @param      totalmarks   The totalmarks
     * @param      reservation  The reservation
     */
    Student (String name, String date, String month, String year, 
        int subject1, int subject2, int subject3,
        int totalmarks, String reservation) {
        this.name = name;
        this.date = date;
        this.month = month;
        this.year = year;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.totalmarks = totalmarks;
        this.reservation = reservation;
    }
    public boolean getAlloted() {
        return alloted;
    }
    public void setAlloted(final boolean alloted) {
        this.alloted = alloted;
    }
    /**
     * Gets name.
     *
     * @return     name.
     */
    public String getname() {
        return name;
    }
    /**
     * Sets name.
     *
     * @param      name  The name.
     */
    public void setname(String name) {
        this.name = name;
    }
    /**
     * Get dateOfbirth.
     *
     * @return     dateOfbirth.
     */
    public String getdate() {
        return date;
    }
    /**
     * Set dateOfbirth.
     *
     * @param      dateOfbirth  The dateOfbirth.
     */
    public void setdate(String date) {
        this.date = date;
    }

     public String getmonth() {
      return year;
     }
     
     public void setmonth(String year) {
      this.year = year;
     }

      public String getyear(){
       return year;
      }
      
      public void setyear(String year){
       this.year = year;
      }
    /**
     * Get subject1.
     *
     * @return     subject1.
     */
    public int getsubject1() {
        return subject1;
    }
    /**
     * Set subject1.
     *
     * @param      subject1  The subject1.
     */
    public void setsubject1(int subject1) {
        this.subject1 = subject1;
    }
    /**
     * Get subject2.
     *
     * @return     subject2. 
     */
    public int getsubject2() {
        return subject2;
    }
    /**
     * Set subject2.
     *
     * @param      subject2  The subject2.
     */
    public void setsubject2(int subject2) {
        this.subject2 = subject2;
    }
    /**
     * Get subject3.
     *
     * @return     subject3.
     */
    public int getsubject3() {
        return subject3;
    }
    /**
     * Set subject3.
     *
     * @param      subject3  The subject2.
     */
    public void setsubject3(int subject3) {
        this.subject3 = subject3;
    }
    /**
     * Get totalmarks.
     *
     * @return     totalmarks.
     */
    public int gettotalmarks() {
        return totalmarks;
    }
    /**
     * Set totalmarks.
     *
     * @param      totalmarks  The totalmarks.
     */
    public void settotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }
    /**
     * Get resrvation.
     *
     * @return reservation.
     */
    public String getreservation() {
        return reservation;
    }
    /**
     * Set reservation.
     *
     * @param      reservation The reservation.
     */
    public void setreservation(String reservation) {
        this.reservation = reservation;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name + "," + this.totalmarks + "," + this.reservation;
    }
    /**
     * comapares two objects in the given condition.
     *
     * @param      that  The that
     *
     * @return
     */
    public int compareTo(final Student that) {
        Student a = this;
        if (a.totalmarks > that.totalmarks) {
            return 1;
        }
        if (a.totalmarks < that.totalmarks) {
            return -1;
        }
        if (a.subject3 > that.subject3) {
            return 1;
        }
        if (a.subject3 < that.subject3) {
            return -1;
        }
        if (a.subject2 > that.subject2) {
            return 1;
        }
        if (a.subject2 < that.subject2) {
            return -1;
        }
        if (Integer.parseInt(a.year) < Integer.parseInt(that.year)) {
            return -1;
        }
        if (Integer.parseInt(a.year) > Integer.parseInt(that.year)) {
            return 1;
        }
        if (Integer.parseInt(a.month) < Integer.parseInt(that.month)) {
            return -1;
        }
        if (Integer.parseInt(a.month) > Integer.parseInt(that.month)) {
            return 1;
        }
        if (Integer.parseInt(a.date) < Integer.parseInt(that.date)) {
            return -1;
        }
        if (Integer.parseInt(a.date) > Integer.parseInt(that.date)) {
            return 1;
        }
        return 0;
    }
}
