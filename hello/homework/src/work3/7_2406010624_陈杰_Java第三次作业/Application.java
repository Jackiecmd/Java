package work3.work7;

public class Application {
    public static void main(String[] args) {
        GameSave localSave = new LocalSave();
        GameSave cloudSave = new CloudSave();

        localSave.loadSave();
        cloudSave.loadSave();
    }
}
