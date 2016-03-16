package JavaIO.VideoGolovach.Lecton2;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Александр on 07.01.2016.
 */
public class PallOutputStream extends OutputStream {
    private  OutputStream out;
    String name;
    public PallOutputStream(OutputStream out) {
        this.out = out;
        this.name = name;
    }

        @Override
        public void write ( int b)throws IOException {
            out.write(b);
            System.out.println(name + ":" + 1);

        }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        out.write(b, off, len);
        System.out.println(name + ":" +len);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }

    @Override
    public void write(byte[] b) throws IOException {

        out.write(b);
        System.out.println(name + ":" +b.length);
    }
}
