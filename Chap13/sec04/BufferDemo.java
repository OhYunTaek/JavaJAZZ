package sec04;

import java.nio.ByteBuffer;

/*
 * Code By OhYunTaek 2022.10.11(화)
 */
// 챕터 13 예제
public class BufferDemo {
    public static void main(String[] args) {
        ByteBuffer buf = ByteBuffer.allocate(10);

        System.out.println(buf);

        buf.put("ab".getBytes());
        System.out.println(buf);

        buf.put("cde".getBytes());
        System.out.println(buf);

        buf.flip();
        System.out.println(buf);

        System.out.println(new String(buf.array()));

        buf.clear();
        System.out.println(buf);
    }
}