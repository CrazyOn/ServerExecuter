import java.io.*;
public class HackSystem{
    public final static InputStream in =System.in;
    private static ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    public final static PrintStream out = new PrintStream(buffer);
    public final static PrintStream err = out;

    public static String getBufferString(){
        return buffer.toString();
    }
    public static void clearBuffer(){
        buffer.reset();
    }
    public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length){
        System.arraycopy(src,srcPos,dest,destPos,length);
    }
}
