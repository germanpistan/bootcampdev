public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
    }

    @Override
    public void delete() {

    }

    @Override
    public void findAll() {
    }

    String save = "Guardado";
    String delete = "Eliminado";
    String findAll = "Buscando todos";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", delete='" + delete + '\'' +
                ", findAll='" + findAll + '\'' +
                '}';
    }
}
