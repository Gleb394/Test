package reflection;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class SoundClipTest extends JFrame {

    public SoundClipTest() {

        File f = new File("C:\\Users\\Evgeniy\\IdeaProjects\\Test\\src\\main\\java\\reflection\\Breezeblocks - Alt.mp3");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test Sound Clip");
        this.setSize(300, 200);
        this.setVisible(true);

        try {
            // Open an audio input stream.
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SoundClipTest();
    }
}
