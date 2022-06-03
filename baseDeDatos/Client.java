package memento.practice.baseDeDatos;

public class Client {
    public static void main(String[] args){
        BaseDeDatos baseDeDatos= new BaseDeDatos();
        Persona persona= new Persona();

        Backups backups1;
        backups1= new Backups("BackupEnero");
        persona.setBackupsMes(backups1);
        baseDeDatos.createBackupsMes("BackupEnero-Ramiro", persona.createBackupsMes());
        persona.setName("Ramiro");
        persona.setCi("123465678");
        persona.setEdad("50 anios");
        backups1 = persona.restoreBackupsMes(baseDeDatos.getBackupsMes("BackupEnero"));
        backups1.showInfo();

        Backups backups2;
        baseDeDatos.createBackupsMes("BackupFebrero-Jorge", persona.createBackupsMes());
        backups2= new Backups("BackupFebrero");
        persona.setName("Jorge");
        persona.setCi("87654321");
        persona.setEdad("28 anios");
        persona.setBackupsMes(backups2);
        backups2 = persona.restoreBackupsMes(baseDeDatos.getBackupsMes("BackupFebrero"));
        backups2.showInfo();

        Backups backups3;
        baseDeDatos.createBackupsMes("BackupMarzo-Ana", persona.createBackupsMes());
        backups3= new Backups("BackupMarzo");
        persona.setName("Ana");
        persona.setCi("75315985");
        persona.setEdad("33 anios");
        persona.setBackupsMes(backups3);
        backups3 = persona.restoreBackupsMes(baseDeDatos.getBackupsMes("BackupMarzo"));
        backups3.showInfo();

        Backups backups4;
        baseDeDatos.createBackupsMes("BackupAbril-Vivian", persona.createBackupsMes());
        backups4= new Backups("BackupAbril");
        persona.setName("Vivian");
        persona.setCi("357951258");
        persona.setEdad("40 anios");
        persona.setBackupsMes(backups4);
        backups4 = persona.restoreBackupsMes(baseDeDatos.getBackupsMes("BackupAbril"));
        backups4.showInfo();

        Backups backups5;
        baseDeDatos.createBackupsMes("BackupMayo-Mateo", persona.createBackupsMes());
        backups5= new Backups("BackupMayo");
        persona.setName("Mateo");
        persona.setCi("4569841");
        persona.setEdad("23 anios");
        persona.setBackupsMes(backups5);
        backups5 = persona.restoreBackupsMes(baseDeDatos.getBackupsMes("BackupMayo"));
        backups5.showInfo();
    }
}
