public class ListenElement {

    private int Inhalt;
    private ListenElement next;

    public ListenElement(int Inhalt) {
        this.Inhalt = Inhalt;
    }

    public void add(ListenElement neu) {
        if (next == null) {
            next = neu;
        } else {
            next.add(neu);
        }
    }

    public void get() {
        System.out.println(Inhalt);
        if (next != null) {
            next.get();
        }
        
    }
}
