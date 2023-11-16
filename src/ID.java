public class ID {
    int id;
    public ID(int id){
        this.id=id;
    }

    public int getId() {
        id++;
        return id;
    }
    @Override
    public String toString() {
        String ID = String.format("%d : ",id);
        return ID ;
    }
}
