import javax.sound.midi.*;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class PDFp956 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("시퀀스 성공쓰");
        } catch (MidiUnavailableException e) {
            System.out.println("시퀀스 성공쓰");
        }
    }

    public static void main(String[] args) {
        PDFp956 mt = new PDFp956();
        mt.play();
    }
}