package java.io;

public final class FileDescriptor {

    public static final FileDescriptor in;
    public static final FileDescriptor out;
    public static final FileDescriptor err;

    public FileDescriptor() {
    }

    public boolean valid() {
        throw new RuntimeException("Implementation stripped");
    }

    public void sync() throws SyncFailedException {
        throw new RuntimeException("Implementation stripped");
    }

}