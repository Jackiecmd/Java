package work3.work3;

public class EncryptedVideoPlayer implements Playable {

    public void decrypt(){
        System.out.println("Decrypting video...");
    }
    @Override
    public void play() {
        decrypt();
        System.out.println("Playing decrypted video...");
    }
}
