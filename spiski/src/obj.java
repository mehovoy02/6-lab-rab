public class obj implements Comparable<obj> {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(obj o) {

        if(getId() > o.getId())
            return 1;
        else if(getId() < o.getId())
            return -1;
        else
            return 0;
    }
}
