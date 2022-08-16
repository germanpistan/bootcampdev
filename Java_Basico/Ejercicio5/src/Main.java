public class Main {
    static CocheCRUD CocheCRUDImpl = new CocheCRUDImpl();


    public static void main(String[] args) {
        CocheCRUDImpl.delete();
        CocheCRUDImpl.save();
        CocheCRUDImpl.findAll();
        System.out.println(CocheCRUDImpl);

    }

}
