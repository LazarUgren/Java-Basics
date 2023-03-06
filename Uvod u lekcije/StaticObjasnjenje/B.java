package Video21ZnacenjeStatic_VezbanjeZadataka.StaticObjasnjenje;

public class B {
    public static int lastID;
    public int ID;


    public B(int ID) {
        this.ID = lastID + 1;
        lastID+=1;
    }
}
