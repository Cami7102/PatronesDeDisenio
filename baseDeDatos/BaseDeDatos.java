package memento.practice.baseDeDatos;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String, Memento> backupsMes= new HashMap<>();

    public void createBackupsMes(String aliasPersona, Memento m){
        backupsMes.put(aliasPersona,m);
    }

    public Memento getBackupsMes(String aliasPersona){
        return backupsMes.get(aliasPersona);
    }

}
