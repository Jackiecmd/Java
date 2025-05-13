package work3.work3;

public class Media {
    public static void main(String[] args) {
        Playable audio =new AudioPlayer();
        Playable encryptedVideo =new EncryptedVideoPlayer();

        playMedia(audio);
        playMedia(encryptedVideo);

    }

    public static void playMedia(Playable media){
        if(media instanceof EncryptedVideoPlayer){
            EncryptedVideoPlayer encryptedVideoPlayer=(EncryptedVideoPlayer) media;
            encryptedVideoPlayer.play();
        }else{
            media.play();
        }
    }
}
