package mergesort.util;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * This class menager the input
 */
public class InputController {
    private String mPath = "";
    private final String mSeparator = System.getProperty("line.separator");
    private StringBuilder mText;


    public InputController(String path) {
        this.mPath = path;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {

        this.mPath = path;
    }

    public String[] getLines() throws IOException {
        if(mText != null){
            return mText.toString().split(mSeparator);
        }
        RandomAccessFile aFile = new RandomAccessFile(getPath(), "rw");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(72000);

        int bytesRead = inChannel.read(buf);
        mText = new StringBuilder();
        while (bytesRead != -1) {
            buf.flip();

            while (buf.hasRemaining()) {
                char caractere = (char) buf.get();
                mText.append(caractere);
            }
            mText.deleteCharAt(mText.length() - 1);
            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
        return mText.toString().split(mSeparator);
    }
}
