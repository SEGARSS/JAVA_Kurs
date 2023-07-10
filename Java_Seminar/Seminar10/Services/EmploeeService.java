package Services;
import java.util.ArrayList;
import java.util.List;
import Domen.Emploee;
public class EmploeeService implements iPersonService<Emploee> {
        public EmploeeService() {
        new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, int age) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }    
}
